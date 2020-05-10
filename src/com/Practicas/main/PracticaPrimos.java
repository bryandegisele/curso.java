package com.Practicas.main;

import java.util.Scanner;

public class PracticaPrimos {

	public static void main(String[] args) {
		// saber si un numero es primo o no

		int num = 0;
		boolean primo = true;
		

		Scanner numIn = new Scanner(System.in);
		System.out.print("Ingrese el numero: ");
		num = numIn.nextInt();

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {				
				primo = false;
				break;
			}
			

		}
		if (primo) {
		System.out.print("El numero 	ES PRIMO: " + num);
		} else {
			System.out.print("El numero es compuesto " + num);
			
		}
	

	}

}
