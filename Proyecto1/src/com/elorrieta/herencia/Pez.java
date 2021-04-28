package com.elorrieta.herencia;

public class Pez extends Animal {

	@Override
	public void cantar() {
		super.cantar();
		System.out.println(this.getNombre() + " glu glu glu");
	}

}
