package com.elorrieta.vehiculo;

public class Coche extends Vehiculo {

	private boolean itv = true;
	private String nombre;

	public Coche(String matricula, String color, int numAsientos, int numRuedas, boolean itv, String nombre) {
		this();
		this.itv = itv;
		this.nombre = nombre;
	}

	public Coche() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Coche(String matricula, String color, int numAsientos, int numRuedas) {
		super(matricula, color, numAsientos, numRuedas);
		// TODO Auto-generated constructor stub
	}

	public Coche(String matricula) {
		super(matricula);
		// TODO Auto-generated constructor stub
	}

	public boolean isItv() {
		return itv;
	}

	public void setItv(boolean itv) {
		this.itv = itv;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Coche [itv= " + itv + ", nombre= " + nombre + ", Matricula= " + getMatricula() + ", Color= "
				+ getColor() + ", NumAsientos= " + getNumAsientos() + ", NumRuedas() = " + getNumRuedas() + "]";
	}

}
