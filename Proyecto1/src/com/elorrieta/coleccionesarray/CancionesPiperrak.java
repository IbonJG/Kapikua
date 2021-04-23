package com.elorrieta.coleccionesarray;

import java.util.ArrayList;

import com.elorrieta.objetos.Cancion;

public class CancionesPiperrak {

	public static void main(String[] args) throws Exception {

		int totalSegundos = 0;
		Cancion cMasLarga = new Cancion();
		Cancion cMasCorta = new Cancion();
		cMasCorta.setDuracion(Cancion.DURACION_MAXIMA);

		ArrayList<Cancion> canciones = new ArrayList<Cancion>();

		Cancion c = new Cancion();
		c.setNombre("Kualkier dia");
		c.setDuracion(4, 13);
		canciones.add(c);

		c = new Cancion();
		c.setNombre("Mi Primer Amor");
		c.setDuracion(2, 54);
		canciones.add(c);

		c = new Cancion();
		c.setNombre("Ke le voy hacer");
		c.setDuracion(2, 47);
		canciones.add(c);

		c = new Cancion();
		c.setNombre("Okupados");
		c.setDuracion(1, 38);
		canciones.add(c);

		c = new Cancion();
		c.setNombre("AJOIOUN");
		c.setDuracion(2, 15);
		canciones.add(c);

		System.out.println(canciones);

		// for (int i = 0; i < canciones.size(); i++) {
		// Cancion cancion = canciones.get(i);

		// por cada cancion del array hace una pasada y me la guarda en cancion
		for (Cancion cancion : canciones) {

			int duracionMasLarga = cMasLarga.getDuracion();
			int duracionMasCorta = cMasCorta.getDuracion();
			int duracionActual = cancion.getDuracion();

			totalSegundos += duracionActual;

			if (duracionMasLarga < duracionActual) {
				cMasLarga = cancion;
			}

			if (duracionMasCorta > duracionActual) {
				cMasCorta = cancion;
			}

		}

		System.out.println("Total segundos: " + totalSegundos);
		System.out.println("Media segundos: " + totalSegundos / canciones.size());
		System.out.println(
				"Cancion mas Larga: " + cMasLarga.getNombre() + " " + cMasLarga.getDuracionFormateada() + " seg");
		System.out.println(
				"Cancion mas Corta: " + cMasCorta.getNombre() + " " + cMasCorta.getDuracionFormateada() + " seg");

	}

}
