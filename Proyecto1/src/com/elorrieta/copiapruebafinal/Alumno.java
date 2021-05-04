package com.elorrieta.copiapruebafinal;

import java.util.ArrayList;

public class Alumno {

	// constantes
	public static final int EDAD_MINIMA = 16;
	public static final int EDAD_MAXIMA = 99;

	private String nombre;
	private String apellidos;
	private int edad;
	private boolean enfermo = false;
	// private float notamedia;
	private ArrayList<Asignatura> asignaturas;

	// constructor superclass
	public Alumno() {
		super();
		this.nombre = "";
		this.apellidos = "";
		this.edad = 0;
		this.enfermo = false;
		// this.notamedia = 0;
		this.asignaturas = new ArrayList<Asignatura>();

	}

	// contructor using fields
	public Alumno(String nombre, String apellidos, int edad, boolean enfermo) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.enfermo = enfermo;
		// this.notamedia = notamedia;
		// this.asignaturas = asignaturas;
	}

	// getters and setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) throws Exception {
		if (edad < EDAD_MINIMA || edad > EDAD_MAXIMA) {
			throw new Exception(
					String.format("La edad debe estar comprendida entre %s y %s", EDAD_MINIMA, EDAD_MAXIMA));
		}
		this.edad = edad;
	}

	public boolean isEnfermo() {
		return enfermo;
	}

	public void setEnfermo(boolean enfermo) {
		this.enfermo = enfermo;
	}

	public float getNotamedia() {
		float total = 0;
		for (Asignatura asignatura : asignaturas) {
			total += asignatura.getNota();
		}
		return total / asignaturas.size();
	}

	public ArrayList<Asignatura> getAsignaturas() {
		return asignaturas;
	}

	/**
	 * añadimos de golpe todas las Asignaturas al ArrayList
	 * 
	 * @param asignaturas
	 */
	public void setAsignaturas(ArrayList<Asignatura> asignaturas) {
		this.asignaturas = asignaturas;
	}

	/**
	 * Añadimos una sola Asigntura al ArrayList
	 * 
	 * @param asignatura
	 */
	public void setAsignatura(Asignatura asignatura) {
		this.asignaturas.add(asignatura);
	}

	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + ", enfermo=" + enfermo
				+ ", asignaturas=" + asignaturas + "]";
	}

}
