package com.elorrieta.primerdia;

import java.util.Scanner;

/**
 * 
 * @author cursos_externos Pedir por teclado la temperatura de los 7 dias de la
 *         semana
 */
public class TemperaturaMedia {

	public static void main(String[] args) {

		// declaracion de variables
		float temperaturaLunes;
		float temperaturaMartes;
		float temperaturaMiercoles;
		float temperaturaJueves;
		float temperaturaViernes;
		float temperaturaSabado;
		float temperaturaDomingo;
		float temperaturaMedia;
		final int DIAS_SEMANA = 7; // final es para indicar que es una variable constante, siempre en mayusculas
		// variable paraq guardar datos de teclado
		Scanner teclado = new Scanner(System.in);

		// pedir y leer lunes
		System.out.println("Introduce la temperatura del Lunes: ");
		temperaturaLunes = teclado.nextFloat();

		// pedir datos
		System.out.println("Introduce la temperatura del Martes: ");
		temperaturaMartes = teclado.nextFloat();

		// pedir datos
		System.out.println("Introduce la temperatura del Miercoles: ");
		temperaturaMiercoles = teclado.nextFloat();

		// pedir datos
		System.out.println("Introduce la temperatura del Jueves: ");
		temperaturaJueves = teclado.nextFloat();

		// pedir datos
		System.out.println("Introduce la temperatura del Viernes: ");
		temperaturaViernes = teclado.nextFloat();

		// pedir datos
		System.out.println("Introduce la temperatura del Sabado: ");
		temperaturaSabado = teclado.nextFloat();

		// pedir datos
		System.out.println("Introduce la temperatura del Domingo: ");
		temperaturaDomingo = teclado.nextFloat();

		// mostrar el resultado
		temperaturaMedia = (temperaturaLunes + temperaturaMartes + temperaturaMiercoles + temperaturaJueves
				+ temperaturaViernes + temperaturaSabado + temperaturaDomingo) / DIAS_SEMANA;
		System.out.println("La temperatura media de la semana es: " + temperaturaMedia + "º");

		if (temperaturaMedia < 20) {
			System.out.println("Hace frio");
		} else {
			System.out.println("Hace calor");
		}

		// cerramos el teclado
		teclado.close();
	}

}
