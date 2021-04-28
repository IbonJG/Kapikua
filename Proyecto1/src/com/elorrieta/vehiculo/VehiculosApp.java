package com.elorrieta.vehiculo;

public class VehiculosApp {

	public static void main(String[] args) {

		// crear vehiculo con constructor por defecto
		Vehiculo v1 = new Vehiculo();
		v1.setMatricula("1875KWS");
		v1.setColor("Azul");
		v1.setNumAsientos(5);
		v1.setNumRuedas(4);
		System.out.println(v1);

		// contructor using fields
		System.out.println("---------------------------");
		System.out.println("Constructor using fields");
		Vehiculo v2 = new Vehiculo("4586DHK", "negro", 2, 4);
		System.out.println(v2);

		//
		Vehiculo v3 = new Vehiculo("1488PTZ");
		System.out.println(v3);

		// crear coche con parametros de coche
		Coche c1 = new Coche();
		c1.setItv(true);
		c1.setNombre("Peugeot");
		System.out.println(c1);

		// crear coche con parametros de vehiculo + coche
		Coche c2 = new Coche("6368FWX", "Negro", 5, 4, true, "Peugeot");
		System.out.println(c2);

		Coche c3 = new Coche();
		c3.setNombre("Citroen");
		c3.setItv(true);
		c3.setMatricula("8975CFG");
		c3.setColor("Rojo");
		c3.setNumAsientos(5);
		c3.setNumRuedas(4);
		System.out.println(c3);

		// coche gasolina

		CocheGasolina cg1 = new CocheGasolina("9874GZX", "Azul", 7, 4, false, "Nissan", "Diesel", 2000);
		System.out.println(cg1);

		CocheGasolina cg2 = new CocheGasolina();
		cg2.setCombustible("Diesel");
		cg2.setCilindrada(2000);
		cg2.setNombre("Nissan");
		cg2.setMatricula("7684GZX");
		cg2.setItv(false);
		cg2.setColor("Amarillo");
		cg2.setNumAsientos(7);
		cg2.setNumRuedas(4);
		System.out.println(cg2);

	}

}
