package com.instrucciones.main;

public class DoWhile {

	public static void main(String[] args) {
		// El ciclo Do While debe de ejecutarse por lo menos 1 vez
		int contador = 10;
		 
		//while primero se evalua y luego se ejecuta el bloque
		while( contador < 10) {
			System.out.println(contador);
			contador++;
		}
		
		//do while primero se ejecuta y luego se evalua
		do {
			System.out.println(contador);
			contador++;
			
		} while (contador<10);

	}

}
