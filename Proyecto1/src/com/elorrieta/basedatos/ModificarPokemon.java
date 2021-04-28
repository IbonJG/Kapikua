package com.elorrieta.basedatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ModificarPokemon {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		String sql = "UPDATE pokemon SET nombre = ? , numero = ?, precio = ?, brillante = ? WHERE id = ? ;";

		try (Connection con = DriverManager.getConnection("jdbc:sqlite:pokemons2.db");
				PreparedStatement pst = con.prepareStatement(sql)) {

			// pedir datos por consola
			System.out.println("Vamos a  MODIFICAR Pokemos");
			System.out.println("----------------------------------");
			System.out.println("Introduce la ID del Pokemon que quieres modificar");
			int id = Integer.parseInt(teclado.nextLine());
			System.out.println("Introduce el nuevo nombre que deseas darle");
			String nombre = teclado.nextLine();
			System.out.println("Introduce el nuevo numero");
			String numero = teclado.nextLine();
			System.out.println("Introduce el nuevo precio");
			float precio = Float.parseFloat(teclado.nextLine());
			System.out.println("Introduce si es brillante = 1 / o no es brillante = 0");
			int brillante = Integer.parseInt(teclado.nextLine());

			// sustituimos las '?' de la SQL por las variables
			pst.setString(1, nombre);
			pst.setString(2, numero);
			pst.setFloat(3, precio);
			pst.setInt(4, brillante);
			pst.setInt(5, id);

			boolean flag = true;
			do {

				try {
					pst.executeUpdate();
					flag = false;
					System.out.println("Datos cambiados");
				} catch (Exception e) {
					System.out.println("El numero introducido " + numero + " ya existe, escribe otro");
					numero = teclado.nextLine();
					pst.setString(2, numero);
				}
			} while (flag);

			// ejecuta la SQL contra la bbdd que nos hemos conectado

		} catch (SQLException e) {
			e.printStackTrace();
		}

		teclado.close();

	}

}
