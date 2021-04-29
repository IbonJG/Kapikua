package com.elorrieta.vehiculo;

public class Moto extends CocheGasolina {

	public Moto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Moto(String matricula, String color, int numAsientos, int numRuedas, boolean itv, String nombre,
			String combustible, int cilindrada) {
		super(matricula, color, numAsientos, numRuedas, itv, nombre, combustible, cilindrada);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Moto [getCombustible()=" + getCombustible() + ", getCilindrada()=" + getCilindrada() + ", isItv()="
				+ isItv() + ", getNombre()=" + getNombre() + ", getMatricula()=" + getMatricula() + ", getColor()="
				+ getColor() + ", getNumAsientos()=" + getNumAsientos() + ", getNumRuedas()=" + getNumRuedas() + "]";
	}

	@Override
	public void arrancar() {

		System.out.println("Esta moto hace Papapapapapapa");
	}

}
