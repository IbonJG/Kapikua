package com.elorrieta.estructurasrepetitivas;

public class EjercicioPropuesto {

	public static void main(String[] args) {
		// declaracion de variables
		int i = 0;
		int x = 9;
		System.out.println("Inicia el programa");

		/*
		 * System.out.println("Con FOR"); for (i = 0; i <= 10; i++) {
		 * System.out.println(i); } for (i = 9; i >= 0; i--) { System.out.println(i); }
		 */

		System.out.println("Con While");
		i = 0;

		while (i <= 10) {
			System.out.println(i);
			i++;
		}

		i = 9;
		while (i >= 0) {
			System.out.println(i);
			i--;
		}
	}
}