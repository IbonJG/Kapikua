package com.elorrieta.excepciones;

import com.elorrieta.objetos.Pokemon;

public class PruebaExcepciones {

	public static void main(String[] args) {
		Pokemon p = new Pokemon();
		p.setNombre("Pikachu");
		p.setIsBrillante(true);
		p.setNumero(100);

		try {
			p.setPrecio(-3);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(p);

	}

}
