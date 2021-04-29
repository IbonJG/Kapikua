package com.elorrieta.vehiculo;

public class CocheElectrico extends Coche {

	private int kw;

	public CocheElectrico(String matricula, String color, int numAsientos, int numRuedas, boolean itv, String nombre,
			int kw) {
		super(matricula, color, numAsientos, numRuedas, itv, nombre);
		this.kw = kw;
	}

	public CocheElectrico() {
		super();
		this.kw = 50;
	}

	public CocheElectrico(String nombre, int kw) {
		this();
		setNombre(nombre);
		setKw(kw);

	}

	public int getKw() {
		return kw;
	}

	public void setKw(int kw) {
		this.kw = kw;
	}

	@Override
	public void arrancar() {
		System.out.println("Este coche no hace ruido");
	}

	@Override
	public String toString() {
		return "CocheElectrico [kw=" + kw + ", isItv()=" + isItv() + ", getNombre()=" + getNombre()
				+ ", getMatricula()=" + getMatricula() + ", getColor()=" + getColor() + ", getNumAsientos()="
				+ getNumAsientos() + ", getNumRuedas()=" + getNumRuedas() + "]";
	}

}
