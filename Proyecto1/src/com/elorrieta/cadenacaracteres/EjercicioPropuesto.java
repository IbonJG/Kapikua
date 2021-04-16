package com.elorrieta.cadenacaracteres;

import java.util.Scanner;

public class EjercicioPropuesto {

	public static void main(String[] args) {
		// pedir nombre edad y altura
		// mostrar el mas alto

		// declarar variables
		String nombre1;
		String nombre2;
		int edad1;
		int edad2;
		float altura1;
		float altura2;

		Scanner teclado = new Scanner(System.in);

		// programa
		// "parse" para modificar la entrada por teclado de tipo string (nextline) al
		// tipo que corrresponda, float, int...
		System.out.println("Introduce el primer nombre");
		nombre1 = teclado.nextLine();
		System.out.println("Introduce la primera edad");
		edad1 = Integer.parseInt(teclado.nextLine());
		System.out.println("Introduce la altura en metros");
		altura1 = Float.parseFloat(teclado.nextLine());
		System.out.println("Introduce el segundo nombre");
		nombre2 = teclado.nextLine();
		System.out.println("Introduce la segunda edad");
		edad2 = Integer.parseInt(teclado.nextLine());
		System.out.println("Introduce la segunda altura en metros");
		altura2 = Float.parseFloat(teclado.nextLine());

		System.out.println("La persona de mas alta es: ");
		if (altura1 > altura2) {
			System.out.println(nombre1);

		} else {
			System.out.println(nombre2);
		}

		teclado.close();

	}

}
