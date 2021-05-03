package com.elorrieta.pruebapersonas;

public class Persona {

	private String dni;
	private String nombre;
	private String apellido;
	private int edad;

//fdsfasdsadfgsaasdfsaddsdasfgfdwgf
	// Contructor por defecto, from superclass
	public Persona() {
		super();
		// TODO Auto-generated constructor stub
	}

	// contructor using fields
	public Persona(String dni, String nombre, String apellido, int edad) {
		this();
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}

	// Getters and setters
	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Persona [dni= " + dni + ", nombre =" + nombre + ", apellido =" + apellido + ", edad =" + edad + "]";
	}

	// Generate toString

}
