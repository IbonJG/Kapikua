package com.elorrieta.excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio82 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		try {
			int num1, num2;
			System.out.println("Ingrese primer valor entero (dividendo):");
			num1 = Integer.parseInt(teclado.nextLine());
			System.out.println("Ingrese segundo valor entero (divisor):");
			num2 = teclado.nextInt();
			int resu = num1 / num2;
			System.out.print("La divisi�n de " + num1 + " / " + num2 + " es " + resu);
		} catch (InputMismatchException ex) {
			System.out.println("Debe ingresar obligatoriamente n�meros enteros");
		} catch (ArithmeticException ex) {
			System.out.println("No se puede dividir por cero");
		}

	}

}
