package com.practicaludmila.main;

import java.util.Scanner;

public class Evaluaccion {

	public static void main(String[] args) {
		/*Temas =
		 * Calificacion/ 
		 * numeros ascendentes
		 * multiplicasion
		 * 10 numeros de la serie Fibonacc
		 * primos
		 * multiplos
		 * factorial
		 * constante e
		 * */

		
		int calificacion = 50;
		int almacen = 0;
	
	Scanner entrada= new Scanner(System.in);
	System.out.print("Calificaccion del alumno =");
	
	almacen = entrada.nextInt();
	
	if (calificacion > almacen) {
		System.out.println("desaprovado o descalificado");
		
	}else if (calificacion == almacen) {
		System.out.println("casi lo logras, buen intento");
	}else {
		System.out.println("¡Excelente!");
	}
	
	
	}

}
