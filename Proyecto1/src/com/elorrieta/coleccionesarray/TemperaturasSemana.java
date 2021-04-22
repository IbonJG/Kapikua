package com.elorrieta.coleccionesarray;

import java.util.Scanner;

public class TemperaturasSemana {

	public static void main(String[] args) {

		int[] temperaturas = new int[7];
		temperaturas[0] = 12;
		temperaturas[1] = 15;
		temperaturas[2] = 18;
		temperaturas[3] = 5;
		temperaturas[4] = 22;
		temperaturas[5] = 15;
		temperaturas[6] = 18;

		int temperatura = 0;
		int tempmax = Integer.MIN_VALUE;
		int tempmin = Integer.MAX_VALUE;
		int sumatemp = 0;
		Scanner teclado = new Scanner(System.in);

		// for (Integer mostrartemp : temperaturas) {
		// System.out.println(mostrartemp);
		// }

		for (int i = 0; i < temperaturas.length; i++) {
			temperatura = temperaturas[i];
			/*
			 * System.out.println("Introduce las temperaturas semanales"); temperatura =
			 * teclado.nextInt(); temperaturas[i] = temperatura; // add o asignar valor
			 * System.out.println(temperaturas[i]);// get o recuperar valor
			 */
			sumatemp += temperatura;
			if (tempmax < temperatura) {
				tempmax = temperatura;
			}
			if (tempmin > temperatura) {
				tempmin = temperatura;
			}
		}
		System.out.println("La temp Media es: " + (sumatemp / temperaturas.length));
		System.out.println("La temp maxima es: " + tempmax);
		System.out.println("La tem minima es: " + tempmin);

		System.out.println("----------------------------------");

		sumatemp = 0;
		for (Integer mostrartemp : temperaturas) {
			// System.out.println(mostrartemp);
			sumatemp = sumatemp + mostrartemp;
			System.out.print(mostrartemp + " ");
		}

		// System.out.println(temperaturas); // no tiene .toString()
		System.out.println("la media es: " + sumatemp / temperaturas.length);
		// Mostrar temperatura max

		teclado.close();

	}

}
