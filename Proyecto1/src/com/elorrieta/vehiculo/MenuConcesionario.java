package com.elorrieta.vehiculo;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuConcesionario {

	// declaracion de variables globales para todos los metodos de esta clase
	private static Scanner teclado = new Scanner(System.in);
	private static String opcion = "";
	private static ArrayList<Vehiculo> stock = new ArrayList<Vehiculo>();

	public static void main(String[] args) {
		System.out.println("Bienvenido");
		System.out.println("-------------------------------");

		try {

			cargarVehiculos();

			do {

				menu();
				leerOpcion();

				switch (opcion) {
				case "1": {
					listar();
					break;

				}
				case "2": {
					darDeAlta();
					break;
				}
				case "3": {
					darDeBaja();
					break;
				}
				case "4": {
					modificar();
					break;
				}
				case "s": {
					System.out.println("Has salido del programa");
					break;
				}
				default:
					System.out.println(opcion + " esta opcion no esta disponible");
					break;
				}

			} while (!"s".equalsIgnoreCase(opcion));

		} catch (Exception e) {
			e.printStackTrace();
		}

		// System.out.println("Terminar programa");

	}// cerrar main

	private static void listar() {
		System.out.println("-----------------------------");
		System.out.println("Listado de vehiculos en stock");
		System.out.println("-----------------------------");
		for (Vehiculo vehiculo : stock) {
			System.out.println(vehiculo);
		}

		System.out.println("");// linea en blanco
		System.out.println("");

	}

	private static void darDeAlta() {
		System.out.println("****VAMOS A DAR DE ALTA UN VEHICULO*****");

		// Pedir todos los datos de un Vehiculo
		System.out.println("Introduce Matricula");
		String nuevaMatricula = teclado.nextLine();
		System.out.println("Introduce Color");
		String nuevoColor = teclado.nextLine();

		// crear obejto con esos datos
		Vehiculo v = new Vehiculo();
		v.setMatricula(nuevaMatricula);
		v.setColor(nuevoColor);
		// añadirlo en la coleccion 'stock'
		stock.add(v);
		// CUIDADO con las excepciones al parsear

	}

	private static void darDeBaja() {
		// TODO Auto-generated method stub

	}

	private static void modificar() {
		// TODO Auto-generated method stub

	}

	private static void menu() {

		System.out.println("1. Listar Vehiculos");
		System.out.println("2. Dar de alta un vehiculo");
		System.out.println("3. Dar de baja un vehiculo");
		System.out.println("4. Modificar un vehiculo");
		System.out.println("--------------------------");
		System.out.println("S. Salir del programa");

	}

	private static void leerOpcion() {
		System.out.println("Elige una opcion del menu");
		opcion = teclado.nextLine();

	}

	private static void cargarVehiculos() {

		// mostar array
	}

}
