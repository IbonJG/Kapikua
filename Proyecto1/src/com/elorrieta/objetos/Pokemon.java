package com.elorrieta.objetos;

public class Pokemon implements Cantarin {

	// definir atributos de los pokemon
	private int id;
	private String nombre;
	private float precio;
	private int numero;
	private boolean isBrillante;

	// contructor
	public Pokemon() {
		super();
		this.id = 0;
		this.nombre = "Sin nombre";
		this.precio = 0;
		this.numero = 0;
		this.isBrillante = false;

	}

	public Pokemon(String nombre, float precio) {
		this();
		this.nombre = nombre;
		this.precio = precio;
	}

	public Pokemon(String nombre) {
		this();
		this.nombre = nombre;
	}

	public Pokemon(String nombre, float precio, boolean isBrillante) {
		this();
		this.nombre = nombre;
		this.precio = precio;
		this.isBrillante = isBrillante;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getPrecio() {
		if (isBrillante) {
			return precio + 20;
		} else {
			return precio;
		}
	}

	/**
	 * Setea el precio
	 * 
	 * @param precio float en euros
	 * @throws Exception si el precio < 0
	 */
	public void setPrecio(float precio) throws Exception {

		if (precio < 0) {
			throw new Exception("El precio debe ser 0 o superior");

		} else {
			this.precio = precio;
		}
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

	public void setIsBrillante(boolean isBrillante) {
		this.isBrillante = isBrillante;
	}

	@Override
	public String toString() {
		return "Pokemon [id=" + id + ", nombre=" + nombre + ", precio=" + precio + ", numero=" + numero
				+ ", isBrillante=" + isBrillante + "]";
	}

	public void cantar() {
		System.out.println("Soy un pokemon y estoy cantando. Tiritititi");
	}

}
