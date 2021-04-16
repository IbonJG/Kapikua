package com.elorrieta.objetos;

import java.util.Scanner;

public class CrearObjetosPokemon {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("---------------CANCIONES--------------");
		Cancion c1 = new Cancion();
		System.out.println(c1.toString());
		System.out.println("--------------------------------------");
		c1.setNombre("Enter SandMan");
		c1.setGrupo("Metallica");
		c1.setDuracion(46);
		System.out.println(c1.toString());

		System.out.println("--------------------------------------");

		Cancion c2 = new Cancion();
		c2.setNombre("Cuando nada vale nada");
		c2.setGrupo("Soziedad Alkoholika");
		c2.setDuracion(248);
		System.out.println(c2.toString());

		System.out.println("--------------------------------------");

		Cancion c3 = new Cancion();
		c3.setNombre("Okupados");
		c3.setGrupo("Piperrak");
		c3.setDuracion(196);
		System.out.println(c3.toString());

		System.out.println("-----------POKEMON----------");
		// vamos a crear objetos o instancias. un pokemon seria un objeto
		// pikachu
		Pokemon p1 = new Pokemon();

		System.out.println("Introduce nombre");
		String nombre = teclado.nextLine();
		p1.setNombre(nombre);

		System.out.println("Introduce precio");
		float precio = teclado.nextFloat();
		p1.setPrecio(precio);

		System.out.println("Introduce numero");
		int numero = teclado.nextInt();
		p1.setNumero(numero);

		System.out.println("¿ Es brillante ?  SI o NO");
		// boolean isBrillante
		String esBrillante = teclado.nextLine();
		if ("SI".equalsIgnoreCase(esBrillante)) {
			p1.setBrillante(true);
		} else {
			p1.setBrillante(false);
		}

		System.out.println(p1.toString());

		// charmander

		// bulbasur

		teclado.close();
	}

}
