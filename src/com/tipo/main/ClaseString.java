package com.tipo.main;

public class ClaseString {

	public static void main(String[] args) {
		// String = clase ( una clase es un molde)
		//es Strin no es un tipo de dato primitivo , sino una clase compuesta

		
		//crear String objeto
		//NEW palabra reservada para crear objetos
		String mensaje2 = new String ("creando objetos con string");
		System.out.println(mensaje2);
		
		// el metodo length devuelve un NUMERO ENTERO con la cantidad de caracteres
		 int cantidad = mensaje2.length();
		 System.out.println(cantidad);
		 
		 //crear variable si lo necesito almacenar
		 //se puede explicitar el metodo directamente en el print
		 char indexvalor = mensaje2.charAt(20);
		 System.out.println(mensaje2.charAt(20));
		 
		 // imprimir desde una posicion hasta el final del string
		 System.out.println(mensaje2.substring(8));
		 //imprimir una parte del string con posicion inicio y fianl
		System.out.println(mensaje2.substring(8,14));

		//los metodos terminan con ) y ;
		//pasar la cadena de minusculas a mayusculas
		System.out.println(mensaje2.toUpperCase());
		
		
		//cambiar una letra de toda la cadena
		//un solo caracter entre comillas simples
		System.out.println(mensaje2.replace('o','@' ));
		
		// una cadena de caracteres entre COMILLAS DOBLES.
		System.out.println(mensaje2.replace("creando","started" ));
		
		//son tomadas en cuenta las mayusculas y la sminusculas
		System.out.println(mensaje2.contains("hola"));
		System.out.println(mensaje2.contains("con"));
		System.out.println(mensaje2.contains("Con"));
		
		
		//
		System.out.println(mensaje2.startsWith("creando"));
		System.out.println(mensaje2.endsWith("string"));
		
		//concatenar es UNIR
		//CONCAT NO une las cadenas de caracteres por un ESPACIO solo
		System.out.println(mensaje2.concat(" estamos en el curso de java"));
			
	}

}
