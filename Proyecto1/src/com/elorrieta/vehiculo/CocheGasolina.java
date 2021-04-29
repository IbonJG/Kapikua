package com.elorrieta.vehiculo;

public class CocheGasolina extends Coche {

	private String combustible;
	private int cilindrada;

	public CocheGasolina() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CocheGasolina(String matricula, String color, int numAsientos, int numRuedas, boolean itv, String nombre,
			String combustible, int cilindrada) {
		super(matricula, color, numAsientos, numRuedas, itv, nombre);
		this.combustible = combustible;
		this.cilindrada = cilindrada;
	}

	public String getCombustible() {
		return combustible;
	}

	public void setCombustible(String combustible) {
		this.combustible = combustible;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

	@Override
	public void arrancar() {

		System.out.println("Este coche hace Brum Bruuuummmm");
	}

	@Override
	public String toString() {
		return "CocheGasolina [combustible=" + combustible + ", cilindrada=" + cilindrada + ", Itv=" + isItv()
				+ ", Nombre=" + getNombre() + ", Matricula=" + getMatricula() + ", Color=" + getColor()
				+ ", NumAsientos=" + getNumAsientos() + ", NumRuedas=" + getNumRuedas() + "]";
	}

}
