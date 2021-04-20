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
		Pokemon p1 = new Pokemon();

		System.out.println("Introduce nombre");
		String nombre = teclado.nextLine();
		p1.setNombre(nombre);

		float precio = 0;
		int contadorprecio = 1;

		do {
			System.out.println("Introduce precio");
			try {
				precio = Float.parseFloat(teclado.nextLine());
			} catch (Exception e) {
				if (contadorprecio < 3) {
					System.out.println(" Formato incorrecto Debes introducir el precio en numeros");
				} else
					System.out.println("ATENCION HAS METIDO MAL YA " + contadorprecio + " veces");
			}
			contadorprecio++;
		} while (precio <= 0);
		p1.setPrecio(precio);

		int numero = 0;
		int contadornumero = 1;

		do {
			System.out.println("Introduce numero");
			try {
				numero = Integer.parseInt(teclado.nextLine());
			} catch (Exception e) {
				if (contadornumero < 3) {
					System.out.println("Formato incorrecto");
				} else
					System.out.println("PRESTA ATENCION. HAS METIDO MAL EL NUMERO " + contadornumero + " veces");
			}
			contadornumero++;
		} while (numero <= 0);
		p1.setNumero(numero);

		System.out.println("¿ Es brillante ?  SI o NO");
		// boolean isBrillante
		boolean isBrillante;

		String respuesta = teclado.nextLine();
		if ("SI".equalsIgnoreCase(respuesta) || "S".equalsIgnoreCase(respuesta)) {
			isBrillante = true;
		} else {
			isBrillante = false;
		}
		p1.setIsBrillante(isBrillante);

		System.out.println("Este es tu nuevo pokemon");
		System.out.println(p1.toString());

		if (p1.isBrillante()) {
			System.out.println("Como es brillante vale 20 mas");

		}
////		 crear el pokemon
////		Pokemon pCustom = new Pokemon();
//		pCustom.setNombre(nombre);
//		pCustom.setPrecio(precio);
//		pCustom.setNumero(numero);
//		pCustom.setBrillante(isBrillante);
//
//		// mostrar por pantalla
//		System.out.println("Ya tienes tu nuevo Pokemon customizado");
//		System.out.println(pCustom);
//		if (pCustom.isBrillante()) {
//			System.out.println("Como es brillante el precio es " + pCustom.getPrecio());
//		}

		// charmander

		// bulbasur

		teclado.close();
	}

}
