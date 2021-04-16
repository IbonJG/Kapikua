package com.elorrieta.estructurascondicionales;

import java.util.Scanner;

public class Ejercicio7b {

	public static void main(String[] args) {

		// declaracion de variables
		int num1;
		int num2;
		// variable para guardar datos introducidos por teclado
		Scanner teclado = new Scanner(System.in);

		// mensaje
		System.out.println("Debes introducir dos numeros distintos");
		// introducir los datos y guardarlos
		System.out.println("Introduce el primer numero");
		num1 = teclado.nextInt();
		System.out.println("Introduce el segundo numero");
		num2 = teclado.nextInt();

		// condicion
		if (num1 > num2) {
			System.out.println(num1);
		} else {
			System.out.println(num2);
		}

		// cerrar teclado
		teclado.close();

	}

}
