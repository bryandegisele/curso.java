package com.practicaludmila.main;

public class trabajoPractico {

	public static void main(String[] args) {
		/*
		 * Un programa que compare la longitud de dos cadenas y que muestre por consola
		 * el ganador "if"
		 */
		String ca1 = " Buen dia  ";
		String ca2 = "  como esta   ";
		

		if (ca1.length() > ca2.length()) {
			System.out.println("el ganador es ca1 = " );
		} else if (ca2.length() > ca1.length()) {
			System.out.println("el ganador es ca2 = " );
		} else {
			System.out.println(" empataron ca1 y ca2");

		}
	}
}
