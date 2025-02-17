package com.elorrieta.variables2;

import java.util.Scanner;

public class EjercicioNotas {

	public static void main(String[] args) {
		// constantes

		final float VALOR_30 = 0.3f;
		final float VALOR_70 = (float) 0.7;

		// variables
		float nota1;
		float nota2;
		float nota3;
		float nota4;
		float nota5;
		float media;

		Scanner teclado = new Scanner(System.in);

		System.out.println(" Introduce la 1� nota");
		nota1 = Float.parseFloat(teclado.nextLine());

		System.out.println(" Introduce la 2� nota");
		nota2 = Float.parseFloat(teclado.nextLine());
		System.out.println(" Introduce la 3� nota");
		nota3 = Float.parseFloat(teclado.nextLine());
		System.out.println(" Introduce la 4� nota");
		nota4 = Float.parseFloat(teclado.nextLine());
		System.out.println(" Introduce la 5� nota");
		nota5 = Float.parseFloat(teclado.nextLine());
		/**
		 * las 4 primeras notas corresponden a las UF y tiene un valor del 30% las
		 * ultima nota corresponde al MF y tiene un valor del 70%
		 */

		media = ((nota1 + nota2 + nota3 + nota4) / 4 * VALOR_30) + (nota5 * VALOR_70);
		System.out.println("La nota media es: " + media);

		teclado.close();
	}

}
