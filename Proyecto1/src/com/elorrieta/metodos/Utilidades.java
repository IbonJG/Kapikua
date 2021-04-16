package com.elorrieta.metodos;

public class Utilidades {

	// main es un metodo donde vamos a ejecutar el programa
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// llamamos al metodo saludar y los que hemos creado
		saludar();
		saludarnombre("Ibon");
		saludarnombre("Goiko");
		saludar("Ibon", "castellano");
		saludar("Aitor", "eus");

		float precio = calcularIva(100f, 21f);
		System.out.println("El precio con IVA es " + precio);

		int resultado = suma(18, 5);
		System.out.println("El resultado es: " + resultado);

		int resultado2 = numeroMayor(25, 12, 38);
		System.out.println("El numero mayor es: " + resultado2);

		System.out.println("Es kapikua el numero 2223222 ?" + isKapikua(2223222));
		System.out.println("Es kapikua el numero 123 ?" + isKapikua(123));

	}

	// Vamos a declarar nuevos metodos
	/**
	 * Esto es un metodo publico que no retorna nada "void", saluda por consola
	 */
	public static void saludar() {
		System.out.println("Aupa ahi, que tal?");
	}

	/**
	 * Metodo para saludar por consola. nombre string con la persona a saludar
	 * pueden llevar el mismo nombre "saludar" mientras los parametros sean
	 * diferentes pero a mi me parece mas comodo llamarlos diferente
	 */
	public static void saludarnombre(String nombre) {

		System.out.println("Aupa ahi!! Que tal estas " + nombre + "?");
	}

	/**
	 * Metodo que saluda por consola nombre String con el nombre de la persona a
	 * saludar idioma String, si pones castellano saluda en castellano, cualquier
	 * otro valor en euskera
	 * 
	 * 
	 */
	public static void saludar(String nombre, String idioma) {
		if ("castellano".equals(idioma)) {
			System.out.println("Hola " + nombre);
		} else {
			System.out.println("Kaixo " + nombre);
		}
	}

	/**
	 * Calcular el IVA precios sin iva float iva float el precio mas el iva
	 */
	public static float calcularIva(float precioSinIva, float iva) {

		return precioSinIva + (precioSinIva * iva / 100);
	}

	/**
	 * 
	 * @param num1
	 * @param num2
	 * @return
	 */
	public static int suma(int num1, int num2) {

		return num1 + num2;
	}

	/**
	 * 
	 * @param num1
	 * @param num2
	 * @param num3
	 * @return
	 */
	public static int numeroMayor(int num1, int num2, int num3) {
		int resultadoMayor = 0;
		if (num1 > num2 && num1 > num3) {
			resultadoMayor = num1;

		} else {
			if (num2 > num3) {
				resultadoMayor = num2;
			} else {
				resultadoMayor = num3;
			}
		}
		return resultadoMayor;
	}

	/**
	 * 
	 * @param numero
	 * @return
	 */
	public static boolean isKapikua(int numero) {

		// declaracion de variables
		int numeroOriginal = numero;
		int inverso = 0;
		int resto = 0;

		// programa
		while (numero > 0) {

			resto = numero % 10;
			inverso = inverso * 10 + resto;
			numero = numero / 10;
		}

		return numeroOriginal == inverso;
	}

}
