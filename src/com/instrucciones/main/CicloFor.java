package com.instrucciones.main;

import java.util.Scanner;

public class CicloFor {

	public static void main(String[] args) {
		// ciclo For
		// para saber la cantidad de iteraciones
		// forma tradicional "For"; y otra es "Foreach"
		// for (Inicializacion; Condicion; Iteracion) {}
		/*
		 * inicializacion: declarar e inicialzar las variables del ciclo LAS VARIBLES
		 * DEBEN SER DEL MISMO TIPO condicion : poner una condicion iteracion: una o mas
		 * sentecias pequeñas que se ejecuten en cada iteracion
		 */
		// CREAR UN PROGRAMA: tabla de multiplicar un numero

		int entradaIn = 0;
		
		// PRINT solo para imprimir en la misma linea
		System.out.print("Tabla del ");
		Scanner entrada = new Scanner(System.in);
				
		entradaIn = entrada.nextInt();
		
		
		for ( int x = 1; x < 11; x++) {
			
			//PRINTLN hace un salto de linea
			System.out.println(entradaIn + " x " + x + " = " + entradaIn * x);

		}

	}

}
