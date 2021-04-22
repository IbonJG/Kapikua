package com.elorrieta.coleccionesarray;

import java.util.ArrayList;

public class ListaPaises {

	public static void main(String[] args) {

		ArrayList<String> paises = new ArrayList<String>();
		// añadir
		paises.add("España");
		paises.add("Turquia");
		paises.add("Euskal Herria");
		paises.add("EEUU");
		paises.add("Euskal Herria");
		paises.add("Euskal Herria");
		paises.add("Euskal Herria");

		// eliminar
		paises.remove(0); // el lugar que ocupe en la lista
		paises.remove("Turquia");

		// añadir
		paises.add(1, "Irlanda");

		System.out.println("EEUU esta en la posicion " + paises.indexOf("EEUU"));

		// recorrer con un for
		for (int i = 0; i < paises.size(); i++) {
			String pais = paises.get(i);
			System.out.println("Posicion " + i + " - " + pais);
		}

		// recorrer bucle for each, es mas rapido pero no tenemos la i. solo vale para
		// recorrer no da la posicion
		for (String pais : paises) {
			System.out.println(pais);
		}

		// contar cuantas veces esta el pais x
		String paisBuscar = "Euskal Herria";
		int contador = 0;
		for (String paisIteracion : paises) {
			if (paisBuscar.equalsIgnoreCase(paisIteracion)) {
				contador++;
			}
			// cada vez que se hace el for lo pinta
			System.out.println("El pais " + paisBuscar + " esta " + contador + " veces");
		}
		System.out.println("-------------------------------------------------");
		// lo pinta una vez por que esta fuera del for
		System.out.println("El pais " + paisBuscar + " esta " + contador + " veces");
		System.out.println("-------------------------------------------------");
		// contar paises con mas de 5 caracteres
		System.out.println("Andorra tiene " + "Andorra".length() + " caracteres");
		int cont = 0;
		for (int i = 0; i < paises.size(); i++) {
			String paisIteracion = paises.get(i);
			if (paisIteracion.length() > 5) {
				cont++;
			}
			// cada vez que se hace el for lo pinta
			System.out.println("Hay " + cont + " paises con mas de 5 caracteres");
		}
		System.out.println("-------------------------------------------------");
		// Lo pinta una vez porque esta fuera del for
		System.out.println("Hay " + cont + " paises con mas de 5 caracteres");

		System.out.println("----------");
		System.out.println("Terminamos");

	}

}
