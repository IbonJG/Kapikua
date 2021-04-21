package com.elorrieta.excepciones;

import java.util.Scanner;

public class Ejercicio81 {
	public static void main(String[] ar) {
		Scanner teclado = new Scanner(System.in);
		int num;
		System.out.print("Ingrese un valor entero:");
		num = teclado.nextInt();
		int cuadrado = num * num;
		System.out.print("El cuadrado de " + num + " es " + cuadrado);
		teclado.close();
	}

}
