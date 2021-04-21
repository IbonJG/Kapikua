package com.elorrieta.colecciones;

import java.util.ArrayList;
import java.util.Scanner;

public class EjercicioTemperaturas {

	/**
	 * pedir por pantalla temperaturas hasta salir y guardarlas en un array, al
	 * terminar recorrer array y mostar media
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		ArrayList<Integer> temperaturas = new ArrayList<Integer>();
		int temperatura = 0;
		int numerototaltemp = 0;
		int sumatotaltemp = 0;
		final int SALIR = 888;
		Scanner teclado = new Scanner(System.in);

		// bucle para pedir temperaturas hasta que se desee salir
		do {
			System.out.println("Introduce una temperatura. Presiona 888 para salir: ");
			temperatura = teclado.nextInt();
			if (temperatura != SALIR) {
				temperaturas.add(temperatura);
				numerototaltemp++;
				// sumatotaltemp = (temperaturas.);
			}

		} while (temperatura != SALIR);

		System.out.println("Has salido del programa");

		// recorrer y mostar el array

		System.out.println("----MOSTRAR ARRAY----");
		for (Integer mostrartemp : temperaturas) {
			System.out.println(mostrartemp);
			// Sumar las diferentes temperaturas
			sumatotaltemp = sumatotaltemp + mostrartemp;
			// sumatotaltemp += mostrartemp;
		}
		System.out.println("----------------------------------------");
		System.out.println("Numero total de temperaturas metidas = " + numerototaltemp);
		// mostrar media
		System.out.println("Media: " + (sumatotaltemp / temperaturas.size()));// o temperaturastotaltemp, no hace falta
																				// porque una celda del array es una
																				// parte de numerototaltemp
		// cerrar teclado
		teclado.close();
	}
}
