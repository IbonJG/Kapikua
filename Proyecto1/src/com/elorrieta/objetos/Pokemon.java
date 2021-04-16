package com.elorrieta.objetos;

public class Pokemon {

	// definir atributos de los pokemon
	private String nombre;
	private float precio;
	private int numero;
	private boolean isBrillante;

	// contructor
	public Pokemon() {
		super();
		nombre = "Sin nombre";
		precio = 0;
		numero = 0;
		isBrillante = false;

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public boolean isBrillante() {
		return isBrillante;
	}

	public void setBrillante(boolean isBrillante) {
		this.isBrillante = isBrillante;
	}

	@Override
	public String toString() {
		return "Pokemon [nombre=" + nombre + ", precio=" + precio + ", numero=" + numero + ", isBrillante="
				+ isBrillante + "]";
	}

}
