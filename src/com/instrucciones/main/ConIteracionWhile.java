package com.instrucciones.main;

public class ConIteracionWhile {

	public static void main(String[] args) {
		// ITERACION SALTO *ISTRUCCION
		
	 /*WHILE no es un metodo; para declarar o usar el while debo crear 
	  * una variable CONTADOR de tipo INT
	  */
		int contador = 1;
		
		//IMPRIMIR REPETICIONES:
		/* ciclo infinito:
		* while(contador < 11 ) {
		*	System.out.println("Hola Mundo");{}
			
		*/
		
		
		 while(contador < 11 ) {
			 
			System.out.println("Hola Mundo" + contador );
			
			contador++;
		}
		
		
		

	}

}
