package com.instrucciones.main;

import java.util.Scanner;

public class DivisionPorCero {

	public static void main(String[] args) {
		int dividendo = 10;
		int divisor = 0;
		int resultado = 0;

	    
		
		Scanner entradaDividendo = new Scanner(System.in);
		Scanner entradadivisor = new Scanner(System.in);
		System.out.println("ingrese dos numeros");
		dividendo = entradaDividendo.nextInt();
		divisor = entradadivisor.nextInt();
		
		try {
			resultado = dividendo / divisor;
			
			System.out.println("El resultado es :" + resultado);
		} catch (ArithmeticException excepcion) {
			System.out.println("No es posible dividir por 0");
		}
		
		

		
	}

}
