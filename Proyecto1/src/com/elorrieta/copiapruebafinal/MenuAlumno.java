package com.elorrieta.copiapruebafinal;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuAlumno {

	// declaracion de variables globales para todos los metodos de esta clase
	private static Scanner teclado = new Scanner(System.in);
	private static String opcion = "";
	private static ArrayList<Alumno> lista = new ArrayList<Alumno>();

	public static void main(String[] args) {

		System.out.println("Bienvenido");
		System.out.println("Elige una opcion del menu");

		try {

			cargarAlumnos();

			do {

				menu();
				leerOpcion();

				switch (opcion) {
				case "1": {
					verAlumnos();
					break;
				}

				case "2": {
					darDeAlta();
					break;
				}
				case "s": {
					System.out.println("Has salido del programa. Hasta la proxima");
					break;
				}

				default:
					System.out.println("Lo sentimos la opcion " + opcion + " no esta disponible");
					System.out.println("");
					System.out.println("Elige una opcion valida");
					break;
				}

			} while (!"s".equalsIgnoreCase(opcion));

		} catch (Exception e) {
			e.printStackTrace();
		} // cierre catch

	}// cierre main

	private static void cargarAlumnos() throws Exception {

		// Asignaturas
		Asignatura as1 = new Asignatura("Matematicas", 6);
		Asignatura as2 = new Asignatura("Lengua Castellana", 7.5f);
		Asignatura as3 = new Asignatura("Educacion Fisica", 1);

		Alumno a = new Alumno();
		// dar datos a alumno
		a.setNombre("Ibon");
		a.setApellidos("Juarrero Garcia");
		a.setEdad(34);
		a.setEnfermo(false);
		//cargar asignaturas
		a.setAsignatura(as1);
		a.setAsignatura(as2);
		a.setAsignatura(as3);
		// añadir alumno al arraylist
		lista.add(a);

		Asignatura as12 = new Asignatura("Informatica", 8);
		Asignatura as22 = new Asignatura("Ofimatica", 6.8f);
		Alumno a1 = new Alumno();
		a1.setNombre("Jon");
		a1.setApellidos("Murcia Rodriguez");
		a1.setEdad(25);
		a1.setEnfermo(true);
		a1.setAsignatura(as12);
		a1.setAsignatura(as22);
		lista.add(a1);

		// otra forma de crear alumno
		// lista.add(new Alumno(opcion, opcion, 0, false)

	}

	private static void menu() {
		System.out.println("-------------MENU--------------");
		System.out.println("1. Ver Alumnos Matriculados");
		System.out.println("2. Dar de Alta un Nuevo Alumno");
		System.out.println("-------------------------------");
		System.out.println("S. Salir del programa");

	}

	private static void leerOpcion() {
		System.out.println("Elige una opcion");
		opcion = teclado.nextLine();

	}

	private static void verAlumnos() {
		System.out.println("****Listado de Alumnos Matriculados****");
		System.out.println("---------------------------------------");

		for (Alumno alumno : lista) {

			System.out.println("Nombre Completo: " + alumno.getNombre() + " " + alumno.getApellidos());
			System.out.println("Edad: " + alumno.getEdad() + " años");

			if (alumno.isEnfermo()) {
				System.out.println("Enfermo: SI");
			} else {
				System.out.println("Enfermo: NO");
			}

			System.out.println("Asignaturas: ");
			ArrayList<Asignatura> asignaturasMatriculado = alumno.getAsignaturas();
			for (Asignatura asignatura : asignaturasMatriculado) {
				System.out.printf(" [%s] %s \n", asignatura.getNota(), asignatura.getNombre());
			}

			System.out.println("Nota media: " + alumno.getNotamedia() + "/10");
			System.out.println("---------------------------------------------");
		}
		System.out.println("");

	}

	private static void darDeAlta() throws Exception {
		System.out.println("*****DAR DE ALTA UN NUEVO ALUMNO*****");
		System.out.println("-------------------------------------");

		// pedir datos
		// Nombre
		System.out.println("Introduce el Nombre");
		String nombre = teclado.nextLine();
		// apellidos
		System.out.println("Intorduce los Apellidos");
		String apellidos = teclado.nextLine();
		// edad
		boolean errorEdad = true;
		int edad = 0;
		do {
			System.out.println("Introduce la Edad");
			if (edad < Alumno.EDAD_MINIMA || edad > Alumno.EDAD_MAXIMA) {

			} else {

			}
			try {
				edad = Integer.parseInt(teclado.nextLine());
				errorEdad = false;
			} catch (Exception e) {
				System.out.println("Debes introducir la edad en formato numero");
			}

		} while (errorEdad);

		// enfermo
		System.out.println("Indica si esta enfermo o no : Si/No");
		boolean isEnfermo;
		String respuestaEnfermo = teclado.nextLine();
		if ("SI".equalsIgnoreCase(respuestaEnfermo)) {
			isEnfermo = true;
		} else {
			isEnfermo = false;
		}

		// asignaturas
		System.out.println("Asignaturas en las que esta matriculado el alumno");
		System.out.println("-------------------------------------------------");
		String salirAsignatura = "";

		do {

			Asignatura asignaturasMatriculado = new Asignatura();

			boolean errorNota = true;
			do {
				try {
					System.out.println("Introduce nombre de la asignatura");
					String nombreAsignatura = teclado.nextLine();
					asignaturasMatriculado.setNombre(nombreAsignatura);

				} catch (Exception e) {
					System.out.println("Nota incorrecta");
				}

				System.out.println("Introduce la Nota");
				float notaAsignatura = Float.parseFloat(teclado.nextLine());
				asignaturasMatriculado.setNota(notaAsignatura);
				
			} while (!"s".equalsIgnoreCase(salirAsignatura));

		} while (!"s".equalsIgnoreCase(salirAsignatura));

		// guardar los datos introducidos
		Alumno a = new Alumno();
		a.setNombre(nombre);
		a.setApellidos(apellidos);
		a.setEdad(edad);
		a.setEnfermo(isEnfermo);
		//a.setNotamedia(notamedia);
		a.setAsignatura(asignaturasMatriculado);
		

		// añadir los datos al arraylist
		lista.add(a);
		System.out.println("+++Nuevo alumno añadido con exito+++");
		System.out.println("");

	}

}
// cierre class
