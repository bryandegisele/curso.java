package com.fastTest.main;

public class FastTest {

	public static void main(String[] args) {
		/*
		 * programa que compare dos cadenas return resultado : cadena 1 longitud
		 * longitud cadena 2 
		 * este exemen fue realizado por ... variable
		 *
		 */

		String student;
		String cadena1, cadena2;
		boolean resultado;

		cadena1 = "     Tiene que bañarse mas seguiDa      ";
		cadena2 = "Tiene que bañarse mas seguido";
		student = "Gisele";
		resultado = cadena1.toUpperCase().trim().equals(cadena2.toUpperCase().trim());

		// comparando las cadenas
		System.out.println("La comparacion es:" + resultado);

		// longitud de las cadenas
		System.out.println("la longitud de la cadena 1 es: " + cadena1.length());
		System.out.println("la longitud de la cadena 2 es: " + cadena2.length());

		// mensaje parametrizado
		System.out.println(String.format("Este Test fue realizado por: %s", student));
		System.out.printf(String.format("Este Test fue realizado por: %s", student));
	}

}
