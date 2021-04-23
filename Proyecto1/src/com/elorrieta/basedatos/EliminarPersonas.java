package com.elorrieta.basedatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class EliminarPersonas {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		String sql = "DELETE FROM person WHERE id = ? ;";

		try (Connection con = DriverManager.getConnection("jdbc:sqlite:sample.db");
				PreparedStatement pst = con.prepareStatement(sql)) {

			// pedir datos por consola
			System.out.println("Vamos a ELIMINAR usuarios");
			System.out.println("----------------------------------");
			System.out.println("Introduce la ID que deseas eliminar");
			int id = Integer.parseInt(teclado.nextLine());

			// sustituimos las '?' de la SQL por las variables
			pst.setInt(1, id);

			int filas = pst.executeUpdate(); // ejecuta la SQL contra la bbdd que nos hemos conectado
			System.out.println("Hemos eliminado " + filas + " filas");

		} catch (SQLException e) {
			e.printStackTrace();
		}

		teclado.close();
	}

}
