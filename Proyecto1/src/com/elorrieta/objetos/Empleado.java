package com.elorrieta.objetos;

public class Empleado {

	// como es publica podemos acceder desde otras clases
	public static final int SUELDO_MINIMO = 600;

	// definir atributos del empleado
	private String nombre;
	private float sueldo;
	private boolean esBecario;

	// constructor
	public Empleado() {
		super();
		this.nombre = "Sin nombre";
		this.sueldo = SUELDO_MINIMO;
		this.esBecario = false;

	}

	// seters y geters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getSueldo() {
		return sueldo;
	}

	public void setSueldo(float sueldo) {
		this.sueldo = sueldo;
	}

	public boolean isEsBecario() {
		return esBecario;
	}

	public void setEsBecario(boolean esBecario) {
		this.esBecario = esBecario;
	}

	public String toString() {
		return "Empleado [nombre=" + nombre + ", sueldo=" + getSueldo() + ", esBecario=" + esBecario + "]";
	}

}
