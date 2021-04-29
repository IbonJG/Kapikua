package com.elorrieta.vehiculo;

public class Avion extends Vehiculo {

	private int numAlas;

	public Avion() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Avion(String matricula, String color, int numAsientos, int numRuedas) {
		super(matricula, color, numAsientos, numRuedas);
		// TODO Auto-generated constructor stub
	}

	public Avion(String matricula) {
		super(matricula);
		// TODO Auto-generated constructor stub
	}

	public int getNumAlas() {
		return numAlas;
	}

	public void setNumAlas(int numAlas) {
		this.numAlas = numAlas;
	}

	@Override
	public String toString() {
		return "Avion [numAlas=" + numAlas + ", Matricula=" + getMatricula() + ", Color=" + getColor()
				+ ", NumAsientos=" + getNumAsientos() + ", NumRuedas=" + getNumRuedas() + "]";
	}

}
