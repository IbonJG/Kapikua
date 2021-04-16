package com.elorrieta.estructurasrepetitivas;

import java.util.Scanner;

public class EjercicioPropuesto3 {

	public static void main(String[] args) {
		/**
		 * Pedir numeros por pantalla y que me diga si es par o impar
		 */
		// declaracion de variables
		int numero;
		int divisor = 2;
		int resto = 0;
		// variable scanner
		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduce un numero");
		numero = teclado.nextInt();

		if (numero / divisor == resto) {
			System.out.println("El numero es par");
		} else {
			System.out.println("El numero es impar");
		}

		teclado.close();
	}

}
