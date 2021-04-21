package com.elorrieta.objetos;

import java.util.Scanner;

public class CrearCancion {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("---------VAMOS A CREAR CANCIONES---------");
		// Aqui se van a ir guardando todas las canciones
		Cancion c1 = new Cancion();
		// Empezamos a construir una cancion
		// Nombre
		System.out.println("Introduce nombre");
		String nombre = teclado.nextLine();
		c1.setNombre(nombre);
		// Grupo
		System.out.println("Introduce quien es el autor");
		String grupo = teclado.nextLine();
		c1.setGrupo(grupo);

		// Duracion
		System.out.println("Introduce la duracion en segundos");
		boolean repetir = true;
		int duracion;
		do {
			try {
				duracion = Integer.parseInt(teclado.nextLine());
				c1.setDuracion(duracion);
				repetir = false;
			} catch (NumberFormatException e) {
				System.out.println("Duracion incorrecta, debe de ser un numero entero");
			} catch (Exception e) {
				System.out.println("Cancion demasiado larga");
			}
		} while (repetir);

		// Mostramos lo que hemos hecho
		System.out.println("Has añadido esta cancion");
		System.out.println(c1.toString());

		teclado.close();
	}

}
