package com.elorrieta.basedatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertarPersonas {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		String repetir = "";
		while ("s".equalsIgnoreCase(repetir)) {

			System.out.println("Pedir nombre");
			String nombre = teclado.nextLine();

			// TODO pst.executeUpdate();
			System.out.println("perrsona insertada");

			System.out.println("¿ quieres repetir ? S-Si     N-No");
			repetir = teclado.nextLine();

		}

		String sql = "INSERT INTO person (id, name) VALUES ( ?, ?) ;";

		try (Connection con = DriverManager.getConnection("jdbc:sqlite:sample.db");
				PreparedStatement pst = con.prepareStatement(sql)) {

			// pedir datos por consola
			System.out.println("Vamos a INSERTAR nuevos usuarios");
			System.out.println("----------------------------------");
			System.out.println("Introduce un nuevo ID");
			int id = Integer.parseInt(teclado.nextLine());
			System.out.println("Introduce un nuevo Nombre");
			String nombre = teclado.nextLine();

			// sustituimos las '?' de la SQL por las variables
			pst.setInt(1, id);
			pst.setString(2, nombre);

			pst.executeUpdate(); // ejecuta la SQL contra la bbdd que nos hemos conectado

			System.out.println("Persona insertada");

		} catch (SQLException e) {
			e.printStackTrace();
		}

		teclado.close();
	}// main

}