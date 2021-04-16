package com.elorrieta.estructurascondicionales;

public class Ejercicio9 {

	public static void main(String[] args) {
		// >TODO hacer el ejercicio como sale en los apuntes
		// declaracion de variables
		int num1 = 50;
		int num2 = 52;
		int num3 = 22;

		// variable para introducir datos por teclado
		// Scanner teclado = new Scanner(System.in);

		// condiciones
		if (num1 > num2 && num1 > num3) {
			System.out.println("El numero mas alto es " + num1);
		} else {
			if (num2 > num3) {
				System.out.println("El numero mas alto es " + num2);
			} else {
				System.out.println("El numero mas alto es " + num3);
			}
		}

		System.out.println("-----Otro Ejercio-----");

		int mes = 5;
		if (mes == 1 || mes == 2 || mes == 3) {
			System.out.println("Estamos en el primer trimestre");

		} else {
			System.out.println("No estamos en el primer trimestre");
		}

	}

}
