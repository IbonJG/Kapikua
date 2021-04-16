package com.elorrieta.estructurascondicionales;

import java.util.Scanner;

public class Ejercicio7a {

	public static void main(String[] args) {

		// declaracion de variables
		float sueldo;
		// variable para guardar datos introducidos por teclado
		Scanner teclado = new Scanner(System.in);

		// introducir los datos y guardarlos
		System.out.println("Introduce el sueldo");
		sueldo = teclado.nextFloat();

		// condicion
		if (sueldo > 3000) {
			System.out.println("Esta persona debe pagar impuestos");
		} else {
			System.out.println("Esta persona no tiene que pagar impuestos");
		}

		// cerrar teclado
		teclado.close();
	}

}
