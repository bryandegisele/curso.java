package com.instrucciones.main;

import java.util.Scanner;

public class ProgramaWhile {

	public static void main(String[] args) {
		// programa: cuantos digitos posee un numero

		int numeroIn = 0;
		int resto = 0;
		int resultado = 0;

		//String numStr = String.valueOf(numeroIn);

		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Ingrese el numero: ");
		
		numeroIn = entrada.nextInt();
		
		resto = numeroIn ;
		
		while (resto > 0) {
			resto = resto / 10;
			resultado++;

		}
		System.out.println("El numero tiene " + resultado + " cifras.");
		//System.out.println("El numero tiene " + numStr.length() + " cifras.");

	}

}
