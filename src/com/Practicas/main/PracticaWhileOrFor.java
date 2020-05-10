package com.Practicas.main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PracticaWhileOrFor {

	public static void main(String[] args) {
		// hacer un programa que me diga cuantos
		// numeros pares hay hasta el numero que ingreso
		int numIn = 0;
		int pares = 0;

		boolean flag = true;

		System.out.print("Ingresa un numero");

		Scanner valorX = new Scanner(System.in);

		do {

			try {
				numIn = valorX.nextInt();
				flag = false;
				for (int i = 0; i <= numIn; i++) {
					if (i % 2 == 0) {
						pares++;
					}
				}
				System.out.println("Haste el numero: " + numIn + " hay " + pares + " numero/s par/es desde el cero. ");

			} catch (InputMismatchException exception) {

				valorX.next();
				System.out.println("El valor ingresado NO es un numero ENTERO ");
				System.out.print("Ingresa un numero correcto ");
				

			}

		} while (flag);
	}

}
