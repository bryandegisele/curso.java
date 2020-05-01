package com.instrucciones.main;

public class ClasePromedio {

	public static void main(String[] args) {
		/*
		 * el promedio minimo para aprobar es 7 si el promedio es 10 = Muchas
		 * Felicidades Si el promedio es aprobatorio pero menor a 10 = Felicidades Si el
		 * promedio No es aprobatorio = Es necesario repasar bloques
		 */
		int promedio = 8;

		if (promedio == 10) {
			System.out.println("Muchas Felicidades");

		} else if (promedio >= 7) {
			System.out.println("Felicidades");
		} else {
			// El promedio no es aprobatorio
			System.out.println("Es necasario repasar bloques");
		}
		
		
		
		

	}

}
