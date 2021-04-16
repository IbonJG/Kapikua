package com.elorrieta.estructurascondicionales;

import java.util.Scanner;

public class EjercicioKapikua {

	public static void main(String[] args) {

		int numero = 0;
		int numeroOriginal = 0;
		int inverso = 0;
		int resto = 0;
		Scanner teclado = new Scanner(System.in);

		System.out.println("Dime un numero entero");
		numero = teclado.nextInt();
		numeroOriginal = numero;

		while (numero > 0) {

			resto = numero % 10;
			inverso = inverso * 10 + resto;
			numero = numero / 10;
		}

		// TODO depurar y solucionar bug
		if (numeroOriginal == inverso) {
			System.out.println("Es kapikua");
		} else {
			System.out.println("NO es kapikua");
		}

		teclado.close();

	}

}
