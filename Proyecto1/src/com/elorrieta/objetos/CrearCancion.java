package com.elorrieta.objetos;

import java.util.Scanner;

public class CrearCancion {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("---------VAMOS A CREAR CANCIONES---------");
		// Aqui se van a ir guardando todas las canciones
		Cancion c1 = new Cancion();
		// Empezamos a construir una cancion
		System.out.println("Introduce nombre");
		String nombre = teclado.nextLine();
		c1.setNombre(nombre);

		System.out.println("Introduce quien es el autor");
		String grupo = teclado.nextLine();
		c1.setGrupo(grupo);

		// int duracionmax = 0;
		int duracion = 0;
		do {
			System.out.println("Introduce la duracion en segundos");
			try {
				int duracion = Integer.parseInt(teclado.nextLine());
			} catch (Exception e) {
				System.out.println("Cancion demasiado larga");
			}
		} while (duracion > duracionmax);

		try {
			c1.setDuracion(duracion);
		} catch (Exception e) {
			e.printStackTrace();
		}

		// Mostramos lo que hemos hecho
		System.out.println("Has añadido esta cancion");
		System.out.println(c1.toString());

		teclado.close();
	}

}
