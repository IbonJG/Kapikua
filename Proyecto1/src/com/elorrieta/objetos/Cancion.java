package com.elorrieta.objetos;

public class Cancion {

	public static final int DURACION_MAXIMA = 400;
	public static final int DURACION_MIN = 0;
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

	public void setDuracion(int minutos, int segundos) throws Exception {

		int total = (minutos * 60) + segundos;
		setDuracion(total);
	}

	// si tiene mas de 400 debe saltar una excepcion indicando que es una cancion
	// muy larga
	public void setDuracion(int segundos) throws Exception {

		if (segundos > DURACION_MAXIMA || segundos < DURACION_MIN) {
			throw new Exception("La duracion debe ser entre " + DURACION_MIN + " y " + DURACION_MAXIMA);
		} else {
			this.duracion = segundos;
		}
	}

	@Override
	public String toString() {
		return "Cancion [nombre= " + nombre + ", grupo= " + grupo + ", duracion= " + duracion + "seg]";
	}

}
