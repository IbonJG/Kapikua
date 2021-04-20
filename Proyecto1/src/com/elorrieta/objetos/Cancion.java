package com.elorrieta.objetos;

public class Cancion {

	// atributos
	private String nombre;
	private String grupo;
	private int duracion;// en segundos
	private int duracionmax = 400;

	public Cancion() {
		super();
		this.nombre = "";
		this.grupo = "anonimo";
		this.duracion = 0;
		this.duracionmax = 400;
	}

	public int getDuracionmax() {
		return duracionmax;
	}

	public void setDuracionmax(int duracionmax) {
		this.duracionmax = duracionmax;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getGrupo() {
		return grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

	public int getDuracion() {
		return duracion;
	}

	// si tiene mas de 400 debe saltar una excepcion indicando que es una cancion
	// muy larga
	public void setDuracion(int duracion) throws Exception {

		if (duracion > duracionmax) {
			throw new Exception("Cancion demasiado larga. Maximo 400 segundos");
		} else {
			this.duracion = duracion;
		}
	}

	@Override
	public String toString() {
		return "Cancion [nombre= " + nombre + ", grupo= " + grupo + ", duracion= " + duracion + " seg]";
	}

}
