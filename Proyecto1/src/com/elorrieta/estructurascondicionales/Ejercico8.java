package com.elorrieta.estructurascondicionales;

import java.util.Scanner;

public class Ejercico8 {

	public static void main(String[] args) {

		// declaracion de variables
		float nota1;
		float nota2;
		float nota3;
		final float notas = 3;
		// final int notable = 7;
		// final int aprobado = 4;
		float media;
		// variable para guardar datos introducidos por teclado
		Scanner teclado = new Scanner(System.in);

		// mensaje
		System.out.println("Introduce las notas");
		// introducir los datos y guardarlos
		System.out.println("Introduce la primera nota");
		nota1 = teclado.nextFloat();
		// introducir los datos y guardarlos
		System.out.println("Introduce la segunda nota");
		nota2 = teclado.nextFloat();
		// introducir los datos y guardarlos
		System.out.println("Introduce la tercera nota");
		nota3 = teclado.nextFloat();
		// resultado
		media = (nota1 + nota2 + nota3) / notas;

		// condiciones
		if (media >= 7) {
			System.out.println("Notable");
		} else {
			if (media >= 4) {
				System.out.println("Aprobado");
			} else {
				System.out.println("Suspenso");
			}

		} // cierre primer else

		// cerrar teclado
		teclado.close();
	}// cierre main

}
