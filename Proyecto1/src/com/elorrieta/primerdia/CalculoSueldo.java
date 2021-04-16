package com.elorrieta.primerdia;

import java.util.Scanner;

/**
 * 
 * @author cursos_externos
 * @see se utiliza para remarcar que algo es interensante Ejercicio basico para
 *      los primeros dias. Calculamos el sueldo
 */

public class CalculoSueldo {

	public static void main(String[] args) {
		// declaracion de variables -> Tipo nombre = valor;
		int horasTrabajadas = 0;
		float costoHora = 0;
		float sueldo = 0;

		// variable para leer datos por teclado
		Scanner teclado = new Scanner(System.in);

		// Pedir datos por pantalla y leerlos
		System.out.println("Ingresa la cantidad de horas trabajadas por el empleado");
		// guardar en la variable el valor entero "int" leido por pantalla
		horasTrabajadas = teclado.nextInt();

		System.out.print("Ingrese el valor de la hora:");
		costoHora = teclado.nextFloat();

		sueldo = horasTrabajadas * costoHora;
		System.out.print("El empleado debe cobrar: ");
		System.out.print(sueldo + "€");

		// cerramos el teclado
		teclado.close();

	}

}
