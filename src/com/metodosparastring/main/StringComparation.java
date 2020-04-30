package com.metodosparastring.main;

public class StringComparation {

	public static void main(String[] args) {
		// String Comparation
		String cadena1 = new String();
		String cadena2 = new String();
		boolean resultado;
		boolean resultado2;
		
		cadena1 = "hola";
		cadena2 = "   HOLA   ";
		
		resultado = cadena1.toUpperCase().trim().equals(cadena2.toUpperCase().trim());
		
		System.out.println(resultado);
		
		resultado2 = cadena1.trim().equalsIgnoreCase(cadena2.trim());
		System.out.println(resultado2);
		
		
		
	}

}
