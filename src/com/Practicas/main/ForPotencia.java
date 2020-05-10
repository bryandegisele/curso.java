package com.Practicas.main;

import java.util.Scanner;

public class ForPotencia {

	public static void main(String[] args) {
		// calcular potencia
		
		final int base = 2;
		int exponente = 0;
		
		System.out.print("Cantidad de colores a combinar: ");
		//Recibo valor por consola
		Scanner entrada = new Scanner(System.in);
		//asigna a base el valor
		exponente = entrada.nextInt();
	    // Se inicializa el index # i # que ira recorriendo el ciclo 
		for (int i = 0; i <= exponente ; i++) {
			System.out.println(" Combinando " + i + " Colores, obtengo " + 
		(int)Math.pow(base, i) + " combinaciones");
			/*
			 * int n, base;
System.out.println("Ingrese la base: ");
base = tec.nextInt();
System.out.println("Ingrese el exponente");
n = tec.nextInt();
int resultado = (int) Math.pow(base, n);
System.out.println(base + " elevado a la " + n + " es igual a " + resultado);*/
		}
	}

}
