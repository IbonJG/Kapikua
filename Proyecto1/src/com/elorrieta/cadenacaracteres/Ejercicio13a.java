package com.elorrieta.cadenacaracteres;

import java.util.Scanner;

public class Ejercicio13a {

	public static void main(String[] args) {

		// declaracion de variables

		String nombre1;
		String nombre2;
		int edad1;
		int edad2;

		Scanner teclado = new Scanner(System.in);

		// programa
		System.out.println("Introduce el primer nombre");
		nombre1 = teclado.next();
		System.out.println("Introduce la primera edad");
		edad1 = teclado.nextInt();
		System.out.println("Introduce el segundo nombre");
		nombre2 = teclado.next();
		System.out.println("Introduce la segunda edad");
		edad2 = teclado.nextInt();

		System.out.println("La persona de mayor edad es: ");
		if (edad1 > edad2) {
			System.out.println(nombre1);

		} else {
			System.out.println(nombre2);
		}

		teclado.close();

	}

}
