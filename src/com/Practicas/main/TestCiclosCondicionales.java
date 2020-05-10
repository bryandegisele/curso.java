package com.Practicas.main;

import java.util.Scanner;

public class TestCiclosCondicionales {

	public static void main(String[] args) {
		/*ejercicio 1
		 * Dados 3 numeros enteros, mostrar en consola los numeros
		 * de forma ascendente, de menor a mayor 
		 * Ejemplo Numeros = 9 , 50, 4 salida = 4,9,50
		 * 
		 * */
		
		int numIn1 = 18;
		int numIn2 = 1 ;
		int numIn3 = 23;
		int contador = numIn1 + numIn2 + numIn3;
		int flag = 0 ;
		int iter = 0;
		String mensaje = "";
//		System.out.print("¿Cuantos numeros quiere ordenar? ");
//		Scanner entrada = new Scanner(System.in);
//		cant = entrada.nextInt();
//		
//		
//		for(int n = 0; n<= cant; n++) {
//			System.out.println("Ingrese el numero ");
//			
		
//		}
		mensaje =  "Numeros ordenados: ";
		for (int x = 0 ; x < contador; x++) {
			
			if (x == numIn1 || x == numIn2 || x == numIn3) {
				
				mensaje = mensaje + x  + ", ";
				flag ++;
				
				
				if (flag == 3) {
					break;
					
				}
			} 
			iter++;
			
		}
		
		System.out.println(mensaje );
		System.out.println("cantidad de iteraciones: " + iter);
	}

}
