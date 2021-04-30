package com.elorrieta.vehiculo;

public class Vehiculo implements IArrancable {

	private String matricula;
	private String color;
	private int numAsientos;
	private int numRuedas;

	// constructor?? using fields
	public Vehiculo(String matricula, String color, int numAsientos, int numRuedas) {
		this();
		this.matricula = matricula;
		this.color = color;
		this.numAsientos = numAsientos;
		this.numRuedas = numRuedas;
	}

	// contructor from superclass o contructor por defecto
	public Vehiculo() {
		super();
		this.matricula = "1111AAA";
		this.color = "blanco";
		this.numAsientos = 1;
		this.numRuedas = 2;
	}

	// contructor personalizado

	public Vehiculo(String matricula) {
		this();
		this.matricula = matricula;
	}

	public Vehiculo(String matricula, String color) {
		super();
		this.matricula = matricula;
		this.color = color;
	}

	// geters and seters
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getNumAsientos() {
		return numAsientos;
	}

	public void setNumAsientos(int numAsientos) {
		this.numAsientos = numAsientos;
	}

	public int getNumRuedas() {
		return numRuedas;
	}

	public void setNumRuedas(int numRuedas) {
		this.numRuedas = numRuedas;
	}

	// toString
	@Override
	public String toString() {
		return "Vehiculo [matricula=" + matricula + ", color=" + color + ", numAsientos=" + numAsientos + ", numRuedas="
				+ numRuedas + "]";
	}

	@Override
	public void arrancar() {

		System.out.println("Vehiculo arrancado");
	}

	@Override
	public void parar() {

		System.out.println("Vehiculo parado");

	}

}
