package com.Practicas.main;

public class DibujoSystemoutPrint {

	public static void main(String[] args) {
		// replicar arbol de navidad
		/*                 *
		 *               ***
		 *             *****
		 *           *******
		 *         *********
		 * */
		String dibujo = "*";
		String espacio = "                                               ";
		int contador = 23;
		
		for (int x = 0; x < contador ; x++ ) {
				espacio = espacio.substring(0 ,espacio.length()-2);
					
			System.out.println(espacio+ dibujo);
					
			dibujo = dibujo + "**";
			
			
		}
		
		
	}

}
