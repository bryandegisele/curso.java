package com.metodosparastring.main;

public class StringConcatenacion {

	public static void main(String[] args) {
		// concatenacion de String
		
		String name,
		 curso;
				
		name = "Gisele";
		curso = "Curso de Java 9";
		String mensaje = "Hola bienvenido ".concat(name);
		
		//concatenando mas d una vez
		mensaje= mensaje.concat(" al ");
		mensaje = mensaje.concat(curso);
		mensaje = mensaje.concat(".");
		
		System.out.println(mensaje);
		
		
		//simplificacion de concatenaciones
	mensaje = "Hola bienvenido/a " + name + " al " + curso + ".";
	System.out.println(mensaje);
	
	}
		
		

	}


