package com.elorrieta.coleccionesarray;

import java.util.ArrayList;

import com.elorrieta.objetos.Pokemon;

public class CrearPokemon {

	public static void main(String[] args) throws Exception {

		ArrayList<Pokemon> lista = new ArrayList<Pokemon>();
		int totalPrecio = 0;
		Pokemon pMasCaro = new Pokemon();
		Pokemon pMasBarato = new Pokemon();
		pMasBarato.setPrecio(1000000000); // establecer un precio bastante alto para que no de error la formula de mas
											// barato
		Pokemon pSonBrillante = new Pokemon();

		// crear Pokemons
//		Pokemon p = new Pokemon();
//		p.setNombre("Pikatxu");
//		p.setNumero(1);
//		p.setPrecio(1000);
//		p.setIsBrillante(true);
//		lista.add(p);

//		Pokemon p1 = new Pokemon();
//		p1.setNombre("Charmander");
//		p1.setNumero(2);
//		p1.setPrecio(500);
//		p1.setIsBrillante(false);
//		lista.add(p1);
//
//		Pokemon p2 = new Pokemon();
//		p2.setNombre("Bulbasur");
//		p2.setNumero(3);
//		p2.setPrecio(5);
//		p2.setIsBrillante(true);
//		lista.add(p2);
//
//		Pokemon p3 = new Pokemon();
//		p3.setNombre("Doraemon");
//		p3.setNumero(4);
//		p3.setPrecio(100);
//		p3.setIsBrillante(true);
//		lista.add(p3);

		// Otra forma de crear objeto, hay que crear un constructor previamente con
		// estos valores en la clase raiz(POKEMON)
		lista.add(new Pokemon("Pikatxu", 1000, true));
		lista.add(new Pokemon("Charmander", 500, false));
		lista.add(new Pokemon("Bulbasur", 5, true));
		lista.add(new Pokemon("Doraemon", 100, true));

		System.out.println(lista);

		// Programa
		// Mostrar mas caro
		for (Pokemon pokemon : lista) {

			int pokemonMasCaro = (int) pMasCaro.getPrecio();
			int pokemonMasBarato = (int) pMasBarato.getPrecio();
			int precioActual = (int) pokemon.getPrecio();
			// boolean pokemonBrillante = pSonBrillante.ge

			totalPrecio += precioActual;

			if (pokemonMasCaro < precioActual) {
				pMasCaro = pokemon;
			}

			if (pokemonMasBarato > precioActual) {
				pMasBarato = pokemon;
			}
		}
		System.out.println(
				"El pokemon mas caro es: " + pMasCaro.getNombre() + " con un valor de: " + pMasCaro.getPrecio());
		System.out.println(
				"El pokemon mas barato es: " + pMasBarato.getNombre() + " con una valor de: " + pMasBarato.getPrecio());
		System.out.println("El valor total de tus Pokemon es: " + totalPrecio);
		// Mostrar los que son brillantes
		for (Pokemon pokemon : lista) {

		}

	}

}
