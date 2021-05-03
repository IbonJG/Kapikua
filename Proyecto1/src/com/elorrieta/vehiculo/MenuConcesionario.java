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
		System.out.println("Elige una opcion");
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
					System.out.println("");
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

		System.out.println("Introduce Numero de Asientos");
		boolean errorAsientos = true;
		int nuevoNumAsientos = 0;

		do {
			try {
				nuevoNumAsientos = Integer.parseInt(teclado.nextLine());
				errorAsientos = false;
			} catch (Exception e) {
				System.out.println("Debes introducir los asientos en formato numero");
			}

		} while (errorAsientos);

		System.out.println("Introduce Numero de Ruedas");
		boolean errorRuedas = true;
		int nuevoNumRuedas = 0;

		do {
			try {
				nuevoNumRuedas = Integer.parseInt(teclado.nextLine());
				errorRuedas = false;
			} catch (Exception e) {
				System.out.println("Debes introducir las ruedas en formato numero");
			}

		} while (errorRuedas);

		// crear obejto con esos datos
		Vehiculo v = new Vehiculo();
		v.setMatricula(nuevaMatricula);
		v.setColor(nuevoColor);
		v.setNumAsientos(nuevoNumAsientos);
		v.setNumRuedas(nuevoNumRuedas);

		// añadirlo en la coleccion 'stock'
		stock.add(v);
		System.out.println("***Nuevo Vehiculo añadido***");
		System.out.println("");

	}

	private static void darDeBaja() {

		System.out.println("Vamos a ELIMINAR un vehivulo");
		System.out.println("----------------------------------");

		System.out.println("Introduce la matricula del vehiculo que deseas eliminar");
		String eliminarMatricula = teclado.nextLine();

		boolean encontrado = false;
		for (Vehiculo vehiculo : stock) {

			if (eliminarMatricula.equals(vehiculo.getMatricula())) {
				encontrado = true;
				stock.remove(vehiculo);
				System.out.println("***Vehiculo eliminado***");
				System.out.println("");
				break; // para el bucle en cuanto encuentra un objeto
			}
		} // for

		if (!encontrado) {
			System.out.println("Vehiculo no encontrado");
			System.out.println("");
		}

	}

	private static void modificar() {

		Vehiculo modificarVehiculo = new Vehiculo();
		boolean encontrado = false;

		System.out.println("Vamos a MODIFICAR un vehivulo");
		System.out.println("----------------------------------");

		// buscar vehiculo por matricula
		System.out.println("Introduce la matricula del vehiculo que deseas modificar");
		String modificarMatricula = teclado.nextLine();

		for (Vehiculo vehiculo : stock) {

			if (modificarMatricula.equals(vehiculo.getMatricula())) {
				encontrado = true;
				modificarVehiculo = vehiculo;
				break;
			}
		} // for

		if (!encontrado) {
			System.out.println("Vehiculo no encontrado");

		} else {

			// matricula
			System.out.println("Introduce la nueva matricula");
			String nuevaMatricula = teclado.nextLine();
			modificarVehiculo.setMatricula(nuevaMatricula);

			// color
			System.out.println("Introduce nuevo color");
			String nuevoColor = teclado.nextLine();
			modificarVehiculo.setColor(nuevoColor);

			// asientos
			System.out.println("Introduce numero de asientos");
			boolean errorAsientos = true;
			do {
				try {
					modificarVehiculo.setNumAsientos(Integer.parseInt(teclado.nextLine()));
					errorAsientos = false;
				} catch (Exception e) {
					System.out.println("Debes introducir los asientos en formato numero");
				}

			} while (errorAsientos);

			// ruedas
			System.out.println("Introduce numero de ruedas");
			boolean errorRuedas = true;
			do {
				try {
					modificarVehiculo.setNumRuedas(Integer.parseInt(teclado.nextLine()));
					errorRuedas = false;
				} catch (Exception e) {
					System.out.println("Debes introducir las ruedas en formato numero");
				}

			} while (errorRuedas);

			System.out.println("***DATOS MODIFICADOS***");
			System.out.println("");
		} // else: modificar

	} // modificar

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

		// para que el programa siempre tenga vehiculos con los que jugar
		stock.add(new Vehiculo("8475GHZ", "Rojo", 5, 4));
		stock.add(new Vehiculo("1111TTT", "Negro", 5, 4));
		stock.add(new Vehiculo("2222GGG", "Verde", 5, 4));
		stock.add(new Vehiculo("3333CCC", "Verde", 2, 4));
		// instertar datos con diferentes constructores
		stock.add(new Vehiculo("6666JJJ", "Blanco"));
		stock.add(new Vehiculo("7777ZZZ"));

	}

}
