package com.Practicas.main;

import java.util.Scanner;

public class ContinuePractica {

	public static void main(String[] args) {
		// imprimir los numeros pares
		int numero = 0;
		String resul = "";

		System.out.print("Ingrese un numero: ");
		Scanner numIn = new Scanner(System.in);

		numero = numIn.nextInt();
		resul = "numeros pares: [";

		for (int i = 0; i <= numero; i++) {

			if (i % 2 != 0) {

				continue;
			}
			resul = resul + i + ", ";
		}
		resul = resul.substring(0, resul.length() - 2) + "].";
		System.out.println(resul);
	}

}
