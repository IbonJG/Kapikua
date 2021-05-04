package com.elorrieta.copiapruebafinal;

public class Asignatura {

	public static final float NOTA_MIN = 0;
	public static final float NOTA_MAX = 10f;

	private String nombre;
	private float nota;

	// constructor superclass, hay k añadir manualmente las variables
	public Asignatura() {
		super();
		this.nombre = "";
		this.nota = 0;
	}

	// contructor using fields, hay que cambiar el super por defecto por this
	public Asignatura(String nombre, float nota) throws AsignaturaException {
		this();
		this.nombre = nombre;
		setNota(nota);
		// this.nota = nota;
	}

	// getters and setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getNota() {
		return nota;
	}

	public void setNota(float nota) throws AsignaturaException {
		if (nota < NOTA_MIN || nota < NOTA_MAX) {
			throw new AsignaturaException(
					String.format(" La nota debe estar comprendida ente &s y %s", NOTA_MIN, NOTA_MAX));

		}
		this.nota = nota;
	}

	@Override
	public String toString() {
		return "Asignatura [nombre=" + nombre + ", nota=" + nota + "]";
	}

}
