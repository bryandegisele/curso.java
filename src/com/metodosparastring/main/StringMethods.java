package com.metodosparastring.main;

public class StringMethods {

	public static void main(String[] args) {
		// metodo .toUpperCase imprime la cadena en mayuscula
		String mensaje = "      El dia esta nublado      ";
		String mensaje1;
		mensaje1 = mensaje.trim().substring(7,9);
		
		//metodo string int
		int cantidad;
		cantidad = mensaje.trim().length();
		System.out.println(cantidad);
		

		// .toLowerCase imprime la cadena en minuscula
		System.out.println(mensaje.toLowerCase());
		System.out.println(mensaje.toUpperCase());
		System.out.println(mensaje.toUpperCase().trim());
		System.out.println(mensaje.toUpperCase().trim())
;
		System.out.println(mensaje1);
		
		//concatenacion de metodos
		System.out.println(mensaje.toUpperCase().trim());
		//System.out.printlnSystem.out.println(mensaje.toUpperCase().trim());
		//System.out.pri(mensaje.toUpperCase().toLowerCase());
		
	

	}

}
