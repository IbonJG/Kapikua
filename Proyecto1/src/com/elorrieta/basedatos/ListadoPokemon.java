package com.elorrieta.basedatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ListadoPokemon {

	public static void main(String[] args) {
		try (Connection con = DriverManager.getConnection("jdbc:sqlite:pokemons2.db");
				Statement st = con.createStatement();
				ResultSet rs = st.executeQuery(
						"SELECT id,  UPPER(nombre) as nombre, numero, precio, brillante FROM pokemon ORDER BY UPPER(nombre) ASC; ");

		) {

			System.out.println("-----LISTADO DE POKEMON-----");
			System.out.println("ID----Nombre----Numero----Precio----Brillante");

			while (rs.next()) {

				int id = rs.getInt("id");
				String nombre = rs.getString("nombre");
				String numero = rs.getString("numero");
				float precio = rs.getFloat("precio");
				int brillante = rs.getInt("brillante");

				System.out.println(id + " - " + nombre + " - " + numero + " - " + precio + " - " + brillante);

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
