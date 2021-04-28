package com.elorrieta.videojuego;

public class Guerrero extends Personaje {

	private String arma;

	public Guerrero(String nombre, int nivelEnergia, String arma) {
		super(nombre, nivelEnergia);
		this.arma = arma;
	}

	public String getArma() {
		return arma;
	}

	public void setArma(String arma) {
		this.arma = arma;
	}

	/**
	 * @param energiaGastar la cantidad de energía a gastar en el ataque, la cual es
	 *                      descontada de su nivel propio de energía
	 * @return retorna el arma y la cantidad de energía del ataque concatenados
	 */

	public String combatir(int energiaGastar) {
		int energiaNueva = getNivelEnergia() - energiaGastar;
		setNivelEnergia(energiaNueva);
		return getArma() + " " + energiaGastar;

	}

	@Override
	public String toString() {
		return "Guerrero [nombre= " + getNombre() + " ,arma= " + getArma() + ", nivelEnergia= " + getNivelEnergia()
				+ "]";
	}

}
