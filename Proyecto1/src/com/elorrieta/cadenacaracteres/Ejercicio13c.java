package com.elorrieta.cadenacaracteres;

import java.util.Scanner;

public class Ejercicio13c {

	public static void main(String[] args) {
		// declarar variables
		String apellido1;
		String apellido2;

		Scanner teclado = new Scanner(System.in);

		// programa

		System.out.println("Introduce el primer apellido");
		apellido1 = teclado.nextLine();
		System.out.println("Introduce el segundo apellido");
		apellido2 = teclado.nextLine();
		// se utiliza equals cuando se compara Strings, "==" es solo para numeros int,
		// float
		if (apellido1.equals(apellido2)) {
			System.out.println("Los apellidos son iguales");

		} else {
			System.out.println("Los apellidos son diferentes");
		}

		teclado.close();

	}

}
