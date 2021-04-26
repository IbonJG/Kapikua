package com.elorrieta.basedatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertarPokemon {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

//		String repetir = "";
//		while ("s".equalsIgnoreCase(repetir)) {
//
//			System.out.println("Pedir nombre");
//			String nombre = teclado.nextLine();
//
//			// TODO pst.executeUpdate();
//			System.out.println("perrsona insertada");
//
//			System.out.println("¿ quieres repetir ? S-Si     N-No");
//			repetir = teclado.nextLine();
//
//		}

		String sql = "INSERT INTO pokemon (nombre, numero, precio, brillante) VALUES ( ?, ?, ?, ?) ;";

		try (Connection con = DriverManager.getConnection("jdbc:sqlite:pokemons2.db");
				PreparedStatement pst = con.prepareStatement(sql)) {

			// pedir datos por consola
			System.out.println("Vamos a INSERTAR nuevos Pokemon");
			System.out.println("----------------------------------");
			System.out.println("Introduce un Nombre");
			String nombre = teclado.nextLine();
			// int id = Integer.parseInt(teclado.nextLine());
			System.out.println("Introduce un Numero");
			String numero = teclado.nextLine();
			System.out.println("Introduce un Precio");
			float precio = Float.parseFloat(teclado.nextLine());
			System.out.println("Es Brillante? (0 No / 1 Si)");
			int brillante = teclado.nextInt();

			// sustituimos las '?' de la SQL por las variables
			pst.setString(1, nombre);
			pst.setString(2, numero);
			pst.setFloat(3, precio);
			pst.setInt(4, brillante);

			boolean fallo = true;

			do {
				try {
					pst.executeUpdate(); // ejecuta la SQL contra la bbdd que nos hemos conectado
					System.out.println("Pokemon añadido");
				} catch (Exception e) {
					System.out.println("El numero de pokemon ya existe, introduce otro.");
				}
				fallo = false;

			} while (fallo);

//			try {
//				pst.executeUpdate(); // ejecuta la SQL contra la bbdd que nos hemos conectado
//				System.out.println("Pokemon añadido");
//			} catch (Exception e) {
//				System.out.println("El numero de pokemon ya existe, introduce otro.");
//			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		teclado.close();

	}

}
