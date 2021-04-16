package com.elorrieta.metodos;

import java.util.Scanner;

public class CalcularIva {

	public static void main(String[] args) {
		// Solicitar por pantalla el sueldo
		// si el sueldo es mayor que 1000 se apilca iva del 5%
		// si es menos se aplica un iva del 0%
		// si es mayor que 2000 se aplica 10%
		// si es mayor que 5000 se aplica 25%

		// declarar variables
		float sueldo;
		float iva = 0;
		float precioConIva;

		// variable teclado
		Scanner teclado = new Scanner(System.in);

		// programa
		System.out.println("Introduce tu sueldo");
		sueldo = teclado.nextFloat();

		// calcular iva
		if (sueldo > 1000 && sueldo <= 2000) {
			iva = 5;
		} else {
			if (sueldo > 2000 && sueldo <= 5000) {
				iva = 10;
			} else if (sueldo > 5000) {
				iva = 25;
			}
		}

		// calculamos el iva y lo guardamos en una variable

		precioConIva = Utilidades.calcularIva(sueldo, iva);
		System.out.println("Con el sueldo: " + sueldo);
		System.out.println("Aplicamos un IVA de: " + iva);
		System.out.println("Total: " + precioConIva);

		// cerrar teclado
		teclado.close();

	}

}
