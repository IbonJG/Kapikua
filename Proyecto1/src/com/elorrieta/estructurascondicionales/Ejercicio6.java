package com.elorrieta.estructurascondicionales;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {

		// declaracion de variables
		int num1;
		int num2;
		int suma;
		int producto;
		// variable para guardar datos introducidos por teclado
		Scanner teclado = new Scanner(System.in);
		// pedir datos del numero 1 y guardar en num1
		System.out.println("Introduce el primer numero");
		num1 = teclado.nextInt();

		// pedir datos del numero2 y guardar en num2
		System.out.println("Introduce el segundo numero");
		num2 = teclado.nextInt();

		// suma
		suma = num1 + num2;
		System.out.println("La suma de los dos numeros es: " + suma);

		// producto
		producto = num1 * num2;
		System.out.println("El podructo de los dos numeros es: " + producto);

		// cerrar el teclado
		teclado.close();
	}

}
