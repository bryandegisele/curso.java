package com.metodosparastring.main;

public class StringFormat {

	public static void main(String[] args) {
		// metodo Format
	
		
		String mensaje = new String();
		String mensaje2 = new String();
		String mensaje3 = new String();
		mensaje = "C#";
		mensaje2 = "Java";
		mensaje3 = "Git";
				String mensajeFinal;
		float valor =10.8720563f;

		// metodos de los objetos 
		//metodos estaticos son los metodos de la clase
		
		//nuevo strin
			mensajeFinal = String.format("Bienvenido al curso %s %.2f %s",mensaje,valor,mensaje3);
		System.out.println(mensajeFinal);
		
		System.out.println("Bienvenido al curso c#");
		
		System.out.printf("Bienvenido al curso %s %.2f %s",mensaje,valor,mensaje3);
		
		
			
		
			

	}

}
