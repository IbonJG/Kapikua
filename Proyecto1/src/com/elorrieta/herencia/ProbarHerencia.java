package com.elorrieta.herencia;

public class ProbarHerencia {

	public static void main(String[] args) {

		Animal aCerdo = new Animal("cerdo");
		aCerdo.cantar();
		System.out.println(aCerdo.toString());

		Pajaro pColibri = new Pajaro("Colibri");
		pColibri.cantar();
		System.out.println("Puede volar " + pColibri.isVolador());
		System.out.println(pColibri.toString());

		Pajaro pPinguino = new Pajaro();
		pPinguino.setNombre("pinguino");
		pPinguino.setVolador(false);
		pPinguino.cantar();
		System.out.println("Puede volar " + pPinguino.isVolador());

		Perro p1 = new Perro();
		p1.setNombre("Snoppy");
		p1.cantar();
		System.out.println("Hola soy " + p1.getNombre() + " y hago ");

		PerroPresa pp = new PerroPresa();
		pp.setNombre("Bubbba");
		pp.cantar();

		Perro p2 = new Perro();
		p2.setNombre("Puppy");
		p2.cantar();
		System.out.println(p2.toString());

		Pez pz1 = new Pez();
		pz1.setNombre("Evaristo");
		pz1.cantar();

		Pez pz2 = new Pez();
		pz2.setNombre("Evaristo2");
		pz2.cantar();

	}

}
