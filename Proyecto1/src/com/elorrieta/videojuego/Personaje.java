package com.elorrieta.videojuego;

public class Personaje {

	private String nombre;
	private int nivelEnergia;

	public Personaje() {
		super();// super solo en el constructor por defecto.
		this.nombre = "";
		this.nivelEnergia = 0;
		// TODO Auto-generated constructor stub
	}

	public Personaje(String nombre) {
		this();// cambiar simpre super por this
		this.nombre = nombre;
	}

	public Personaje(String nombre, int nivelEnergia) {
		this.nombre = nombre;
		this.nivelEnergia = nivelEnergia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNivelEnergia() {
		return nivelEnergia;
	}

	public void setNivelEnergia(int nivelEnergia) {
		this.nivelEnergia = nivelEnergia;
	}

	public void alimentarse(int incremento) {
		this.nivelEnergia += incremento;
	}

	public void consumir(int incremento) {
		this.nivelEnergia = nivelEnergia - incremento;
	}

	@Override
	public String toString() {
		return "Personaje [nombre=" + nombre + ", nivelEnergia=" + nivelEnergia + "]";
	}

}
