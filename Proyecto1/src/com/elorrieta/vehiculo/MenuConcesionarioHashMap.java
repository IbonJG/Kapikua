package com.elorrieta.vehiculo;

import java.util.HashMap;
import java.util.Scanner;

public class MenuConcesionarioHashMap {

	// variables global para todos los metodos de esta clase
	private static Scanner sc = new Scanner(System.in);
	private static String opcion = "";
	private static HashMap<String, Vehiculo> stock = new HashMap<String, Vehiculo>();

	public static void main(String[] args) {
		System.out.println("Bienvenido");

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
					System.out.println("Adios");
					break;
				}

				default:
					System.out.println(opcion + " opcion no disponible");
				}

			} while (!"s".equalsIgnoreCase(opcion));

		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("Termina programa");
	}// main

	private static void darDeBaja() {
		System.out.println("Dar de Baja");
		System.out.println("-----------------------------");

		// Pedir todos los datos de un Vehiculo
		System.out.println("Dime la Matricula:");
		String matricula = sc.nextLine();

		Vehiculo v = stock.get(matricula);

		if (v == null) {
			System.out.println("No existe");
		} else {
			stock.remove(matricula);
			System.out.println("Vehiculo dado de baja");
		}

	}// darDeBaja

	private static void modificar() {

		boolean encontrado = false;

		System.out.println("Modificar");
		System.out.println("-----------------------------");
		System.out.println("Dime la Matricula:");
		String matricula = sc.nextLine();

		Vehiculo vm = stock.get(matricula);

		if (vm == null) {
			System.out.println("Vehiculo no encontrado");

		} else {
			// Pedir datos nuevos
			System.out.println("Matricula(" + vm.getMatricula() + "):");
			vm.setMatricula(sc.nextLine());

			System.out.println("Color(" + vm.getColor() + "):");
			vm.setColor(sc.nextLine());

			System.out.println("Asientos(" + vm.getNumAsientos() + "):");
			boolean error = true;
			do {
				try {
					vm.setNumAsientos(Integer.parseInt(sc.nextLine()));
					error = false;
				} catch (Exception e) {
					System.out.println("es incorrecto, prueba de nuevo:");
				}
			} while (error);

			// TODO Ruedas

		}

	}// modificar

	private static void cargarVehiculos() {

		stock.put("134 CMS", new Vehiculo("134 CMS", "rojo")); // en ArrayList -> add(Value)
		stock.put("2365 JKL", new Vehiculo("2365 JKL", "negro"));

	}

	private static void darDeAlta() {

		System.out.println("Datos para el nuevo vehiculo");
		System.out.println("-----------------------------");

		// Pedir todos los datos de un Vehiculo
		System.out.println("Matricula:");
		String matricula = sc.nextLine();

		System.out.println("Color:");
		String color = sc.nextLine();

		System.out.println("Asientos:");
		boolean error = true;
		int asientos = 0;
		do {
			try {
				asientos = Integer.parseInt(sc.nextLine());
				error = false;
			} catch (Exception e) {
				System.out.println("es incorrecto, prueba de nuevo:");
			}
		} while (error);

		// TODO repetir jugada de arriba, ahora voy a procrastinar
		System.out.println("Ruedas:");
		int ruedas = Integer.parseInt(sc.nextLine());

		// crear obejto con esos datos
		Vehiculo v = new Vehiculo(matricula, color, asientos, ruedas);

		// a�adirlo en la coleccion 'stock' ( Key, Value)
		stock.put(matricula, v);

	}

	private static void listar() {
		System.out.println("--------------------------------------");
		System.out.println(" Listado Vehiculos");
		System.out.println("--------------------------------------");

		// stock.keySet(); me retorna todas las matriculas

		for (Vehiculo vehiculo : stock.values()) {
			System.out.println(vehiculo);
		}
		System.out.println("");
		System.out.println("");

	}

	private static void leerOpcion() {
		System.out.println("Elije una opcion del menu:");
		opcion = sc.nextLine();

	}

	private static void menu() {
		System.out.println("1. Listar");
		System.out.println("2. Dar de Alta");
		System.out.println("3. Dar de baja");
		System.out.println("4. modificar");
		System.out.println("------------------");
		System.out.println("S- salir");
	}
}
