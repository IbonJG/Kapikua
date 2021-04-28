package com.elorrieta.basedatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertarPokemon {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		String sql = "INSERT INTO pokemon (nombre, numero, precio, brillante) VALUES ( ?, ?, ?, ?) ;";

		try (Connection con = DriverManager.getConnection("jdbc:sqlite:pokemons2.db");
				PreparedStatement pst = con.prepareStatement(sql)) {

			String salir = "";
			while (!"s".equalsIgnoreCase(salir)) {

				// pedir datos por consola
				System.out.println("Vamos a INSERTAR nuevos Pokemon");
				System.out.println("----------------------------------");
				System.out.println("Introduce un Nombre");
				String nombre = teclado.nextLine();

				System.out.println("Introduce un Numero");
				String numero = teclado.nextLine();

				System.out.println("Introduce un Precio");
				float precio = Float.parseFloat(teclado.nextLine());

				System.out.println("Es Brillante? (0 No / 1 Si)");
				int brillante = Integer.parseInt(teclado.nextLine());// ) teclado.nextInt();

				// sustituimos las '?' de la SQL por las variables
				pst.setString(1, nombre);
				pst.setString(2, numero);
				pst.setFloat(3, precio);
				pst.setInt(4, brillante);

				boolean fallo = true;

				do {
					try {
						pst.executeUpdate(); // ejecuta la SQL contra la bbdd que nos hemos conectado
						fallo = false;
						System.out.println("Pokemon añadido");
					} catch (Exception e) {
						System.out.println("El numero de pokemon ya existe, introduce otro.");
						numero = teclado.nextLine();
						pst.setString(2, numero);
					}
				} while (fallo);

				System.out.println("¿Quieres salir? S-Si / N-No");
				salir = teclado.nextLine();
				System.out.println("Has salido del programa");

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		teclado.close();

	}

}
