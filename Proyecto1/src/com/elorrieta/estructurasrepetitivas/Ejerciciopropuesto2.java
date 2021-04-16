package com.elorrieta.estructurasrepetitivas;

import java.util.Scanner;

public class Ejerciciopropuesto2 {

	public static void main(String[] args) {
		/**
		 * Pedir por teclado las temperaturas del dia, seguir pidiendo la siguiente
		 * temperatura mientras no se escriba "888". Al finalizar el programa mostrar la
		 * media de las temperaturas.
		 */
		float temperatura = 0;
		float total = 0;
		int numeroTemperaturas = 0;
		final int SALIR = 888;
		Scanner teclado = new Scanner(System.in);

		// bucle para pedir temperaturas y sumarlas
		while (temperatura != SALIR) {

			System.out.println("Dime la temperatura (o escribe 888 para salir):");
			temperatura = teclado.nextFloat();

			if (temperatura != SALIR) {
				total += temperatura; // total = total + temperatura;
				numeroTemperaturas++;
			}
		}

		// mostrar media
		System.out.println("Media: " + (total / numeroTemperaturas));
		// cerrar teclado
		teclado.close();

	}

}
