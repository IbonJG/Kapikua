package com.elorrieta.objetos;

public class Cancion {

	// atributos
	private String nombre;
	private String grupo;
	private int duracion;// en segundos

	public Cancion() {
		super();
		this.nombre = "";
		this.grupo = "anonimo";
		this.duracion = 0;
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
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	@Override
	public String toString() {
		return "Cancion [nombre= " + nombre + ", grupo= " + grupo + ", duracion= " + duracion + " seg]";
	}

}
