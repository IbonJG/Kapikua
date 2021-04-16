package com.elorrieta.cadenacaracteres;

import java.util.Scanner;

public class Ejercicio13b {

	public static void main(String[] args) {

		String nombreapellido1;
		String nombreapellido2;
		int edad1;
		int edad2;

		Scanner teclado = new Scanner(System.in);

		// programa
		System.out.println("Introduce tu nombre y apellido");
		nombreapellido1 = teclado.nextLine();
		System.out.println("Introduce tu edad");
		edad1 = teclado.nextInt();
		// hay que meter un nextLine extra que no coja ningun dato para que avance
		// otra forma es guardar todo en formato string con nextline() y luego pasarlo a
		// int float o lo que sea
		// para ello se utiliza: Integer.parseint(teclado.nextLine(); o
		// Float.parseFloat(teclado.nextLine() etc
		teclado.nextLine();
		System.out.println("Introduce tu nombre y apellido");
		nombreapellido2 = teclado.nextLine();
		System.out.println("Introduce tu edad");
		edad2 = teclado.nextInt();

		System.out.println("La persona de mayor edad es: ");
		if (edad1 > edad2) {
			System.out.println(nombreapellido1);

		} else {
			System.out.println(nombreapellido2);
		}

		teclado.close();

	}

}
