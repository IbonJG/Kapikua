package com.elorrieta.pruebapersonas;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuPersona {
//sfdsdafasdfgsadgfsdgfddfsgfaergdffdsgf
	// declaracion de variables globales para todos los metodos de esta clase
	private static Scanner teclado = new Scanner(System.in);
	private static String opcion = "";
	private static ArrayList<Persona> lista = new ArrayList<Persona>();

	public static void main(String[] args) {

		System.out.println("Bienvenido");
		System.out.println("Elige una opcion");
		System.out.println("--------------------");

		try {

			cargarPersonas();

			do {
				menu();
				leeerOpcion();

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
					System.out.println("Has salido del programa. Hasta la proxima");
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

	}// cierre main

	private static void cargarPersonas() {

		Persona p = new Persona();
		p.setDni("78927833K");
		p.setNombre("Ibon");
		p.setApellido("Juarrero");
		p.setEdad(34);
		lista.add(p);

		lista.add(new Persona("55546789B", "Ana Isabel", "Garcia", 58));

		// listaPersona.add = new Persona("55546789B", "Ana Isabel", "Garcia", 58);

	}

	private static void menu() {

		System.out.println("1. Listar Personas");
		System.out.println("2. Dar de alta una persona");
		System.out.println("3. Dar de baja una persona");
		System.out.println("4. Modificar una persona");
		System.out.println("--------------------------");
		System.out.println("S. Salir del programa");
	}

	private static void leeerOpcion() {
		System.out.println("Elige una opcion del menu");
		opcion = teclado.nextLine();

	}

	private static void listar() {
		System.out.println("-----------------------------");
		System.out.println("Listado de Personas");
		System.out.println("-----------------------------");

		for (Persona persona : lista) {
			System.out.println(persona);
		}
		System.out.println("");
		System.out.println("");

	}

	private static void darDeAlta() {
		System.out.println("****VAMOS A DAR DE ALTA UNA PERSONA*****");

		// pedir datos
		System.out.println("Introduce el DNI");
		String dni = teclado.nextLine();

		System.out.println("Introduce el Nombre");
		String nombre = teclado.nextLine();

		System.out.println("Introduce el apellido");
		String apellido = teclado.nextLine();

		System.out.println("Introduce la edad");
		int edad = Integer.parseInt(teclado.nextLine());

		// guardar datos
		Persona p = new Persona();
		p.setDni(dni);
		p.setNombre(nombre);
		p.setApellido(apellido);
		p.setEdad(edad);

		// añadir los datos al arraylist
		lista.add(p);
		System.out.println("****Persona añadida****");
		System.out.println("");

	}

	private static void darDeBaja() {
		System.out.println("Vamos a ELIMINAR una persona");
		System.out.println("----------------------------------");

		System.out.println("Introduce el DNI de la persona que deseas eliminar");
		String eliminar = teclado.nextLine();

		boolean encontrado = false;
		for (Persona persona : lista) {
			if (eliminar.equals(persona.getDni())) {
				encontrado = true;
				lista.remove(persona);
				System.out.println("****Persona eliminada****");
				System.out.println("");
				break;
			}
		}
		if (!encontrado) {
			System.out.println("Persona no encontrada");
			System.out.println("");
		}
	}

	private static void modificar() {

		Persona modificarPersona = new Persona();
		boolean encontrado = false;

		System.out.println("Vamos a MODIFICAR una persona");
		System.out.println("----------------------------------");

		System.out.println("Introduce el DNI de la persona que deseas eliminar");
		String modificar = teclado.nextLine();

		for (Persona persona : lista) {
			if (modificar.equals(persona.getDni())) {
				encontrado = true;
				System.out.println("****Persona encontrada****");
				System.out.println("");
				modificarPersona = persona;
				break;
			}
		}
		if (!encontrado) {
			System.out.println("Persona no encontrada");
			System.out.println("");
		} else {
			System.out.println("Introduce nuevo DNI");
			String nuevoDNI = teclado.nextLine();
			modificarPersona.setDni(nuevoDNI);

			System.out.println("Introduce nuevo Nombre");
			String nuevoNombre = teclado.nextLine();
			modificarPersona.setNombre(nuevoNombre);

			System.out.println("Introduce nuevo Apellido");
			String nuevoApellido = teclado.nextLine();
			modificarPersona.setApellido(nuevoApellido);

			System.out.println("Introduce nueva Edad");
			int nuevaEdad = Integer.parseInt(teclado.nextLine());
			modificarPersona.setEdad(nuevaEdad);

			System.out.println("Persona modificada correctamente");
			System.out.println("");

		}

	}

}// cierre class
