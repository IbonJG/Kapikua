package com.elorrieta.objetos;

import java.util.Scanner;

public class CrearEmpleados2 {

	/**
	 * hay que crear empleados atributos nombre y sueldo hay que crear un
	 * constructor vacio donde el nombre inicial sea anonimo, un booleano para saber
	 * si es becrio o no y el sueldo tiene que es el minimo, 600 euros el por
	 * defecto no va a tener nombre no va a ser becario y va a tener el sueldo
	 * minimo
	 * 
	 * crear una clase nueva para solicitar los datos de un empleado nos va a
	 * solicitar el nombre del empleado, mayor de 5 caracteres nos va aprefguntar si
	 * es becario o no si es becario el sueldo va a ser 0 si no es becario nos
	 * tienen que pedir por pantalla el sueldo, el cual debe ser mayor al sueldo
	 * minimo internacional
	 */
	public static void main(String[] args) {

		System.out.println("--------------ALTA NUEVO EMPLEADO-------------");

		String nombre = "";
		float sueldo = 0;
		boolean esBecario = false;
		Scanner teclado = new Scanner(System.in);

		Empleado e1 = new Empleado();

		do {
			System.out.println("Introduce el nombre del empleado (Minimo 5 caracteres)");
			nombre = teclado.nextLine();
		} while (nombre.length() < 5);

		e1.setNombre(nombre);

		System.out.println("¿Es becario? Introduce si o no");

		String respuesta = teclado.nextLine();
		if ("SI".equalsIgnoreCase(respuesta) || "S".equalsIgnoreCase(respuesta)) {
			esBecario = true;
		} else {
			esBecario = false;
		}
		e1.setEsBecario(esBecario);

		if (e1.isEsBecario()) {
			System.out.println("No tiene sueldo");
			e1.setSueldo(0);
		} else {

			System.out.println("Introduce el suelo. Este debe ser mayor que 600");

			do {
				try {
					sueldo = Float.parseFloat(teclado.nextLine());
				} catch (Exception e) {
					System.out.println("Formato no correcto o precio inferior al debido");
				}
			} while (sueldo < Empleado.SUELDO_MINIMO);
			// TODO Hacer las dos excepciones por separado
			/**
			 * { System.out.println("El sueldo debe ser mayor que 600, escribelo de nuevo");
			 * sueldo = Float.parseFloat(teclado.nextLine()); }
			 */
			e1.setSueldo(sueldo);
		}
		// System.out.println("Introduce el sueldo");
		// float sueldo = Float.parseFloat(teclado.nextLine());
		// e1.setSueldo(sueldo);

		// muestra lo que hemos añadido
		System.out.println("Nuevo empleado añadido");
		System.out.println(e1.toString());

		teclado.close();
	}

}
