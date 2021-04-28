package com.elorrieta.videojuego;

public class CrearPersonajes {

	public static void main(String[] args) {

		// crear guerrero
		Guerrero g1 = new Guerrero("Rexar", 350, "Arco de Cazador");
		System.out.println("Guerrero creado");
		System.out.println(g1);
		System.out.println("Hola compañero, soy " + g1.getNombre() + " y tengo " + g1.getArma());

		// crear mago
		Mago m1 = new Mago("Jaina", "Bola de Fuego");
		System.out.println("Mago creado");
		System.out.println(m1);
		System.out.println("Hola soy " + m1.getNombre() + " y mi poder es " + m1.getPoder());

		// juagar
		g1.combatir(100);
		System.out.println(g1.combatir(100));
		System.out.println("Yo cazo solo: " + g1);
		g1.consumir(50);
		System.out.println("Yo cazo solo: " + g1);

		m1.encantar();
		System.out.println(m1.encantar());
		System.out.println("Mi magia prevalecera: " + m1);
		m1.alimentarse(50);
		System.out.println("Mi magia prevalecera: " + m1);

	}
}
