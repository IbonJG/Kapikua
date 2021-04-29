package com.elorrieta.vehiculo;

import java.util.ArrayList;

public class Concesionario {

	public static void main(String[] args) {
		ArrayList<Vehiculo> stock = new ArrayList<Vehiculo>();

		Coche c = new Coche();
		Avion a = new Avion();
		Moto m = new Moto();

		stock.add(c);
		stock.add(a);
		stock.add(m);

		System.out.println("Tenemos " + stock.size() + " vehiculos en stock");

		for (Vehiculo vehiculo : stock) {

			if (vehiculo instanceof Avion) {
				System.out.println("este vehiculo es un Avion");
				// castear el objeto a su Clase Hija
				Avion avion = (Avion) vehiculo;
				// podemos acceder a los metodos de la clase Hija
				avion.getNumAlas();
			}

			if (vehiculo instanceof Coche) {
				System.out.println("este vehiculo es un coche");
				((Coche) vehiculo).isItv();
			}

			if (vehiculo instanceof Moto) {
				System.out.println("este vehiculo es una moto");
				((Moto) vehiculo).isItv();
			}

		} // for

	}

}
