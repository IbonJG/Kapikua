package com.elorrieta.basedatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ModificarPersonas {

	/*
	 * Create - insert Read - select * from tabla Update Delete
	 * 
	 * 
	 */

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

//		String sql = "UPDATE person SET name = ? WHERE id = ? ;"; //para modificar solo el id
		String sql = "UPDATE person SET name = ? , id = ? WHERE id = ? ;"; // para modificar id y nombre

		try (Connection con = DriverManager.getConnection("jdbc:sqlite:sample.db");
				PreparedStatement pst = con.prepareStatement(sql)) {

			// pedir datos por consola
			System.out.println("Vamos a  MODIFICAR usuarios");
			System.out.println("----------------------------------");
			System.out.println("Introduce la ID de la persona que quieres modificar");
			int idViejo = Integer.parseInt(teclado.nextLine());
			System.out.println("Introduce la nueva ID que deseas darle");
			int idNuevo = Integer.parseInt(teclado.nextLine());
			System.out.println("Introduce el nuevo nombre que deseas darle");
			String nombre = teclado.nextLine();

			// sustituimos las '?' de la SQL por las variables
			pst.setString(1, nombre);
			pst.setInt(2, idNuevo);
			pst.setInt(3, idViejo);

			int filas = pst.executeUpdate(); // ejecuta la SQL contra la bbdd que nos hemos conectado
			System.out.println("Hemos modificado " + filas + " filas");

		} catch (SQLException e) {
			e.printStackTrace();
		}

		teclado.close();

	}

}
