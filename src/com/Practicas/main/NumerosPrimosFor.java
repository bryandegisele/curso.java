package com.Practicas.main;

import java.util.Scanner;



public class NumerosPrimosFor {

	public static void main(String[] args) {
		// Examen numeros primos;
		// consigna 1 averiguar se "X" es primo

		int numX = 1;
		int i = 2;
		int resto = 0;
		// cuando el numero es primo es verdadero
		boolean resultado = true;

		System.out.print("Ingresa un numero");
		Scanner valorX = new Scanner(System.in);
		numX = valorX.nextInt();

		while (i < numX && resultado) {

			if (numX % i == 0) {
				resultado = false;

			}

			i++;

		}
		if (resultado) {
			System.out.println("El numero " + numX + " es PRIMO.");
		} else {
			System.out.println("El numero " + numX + " es COMPUESTO.");

		}

	}

}
