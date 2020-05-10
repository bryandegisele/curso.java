package com.instrucciones.main;

public class DeclaracionesDeSalto {

	public static void main(String[] args) {
		/*
		 * declaraciones de salto: hay 3 tipos: BREAK CONTINUE RETURN (para esta
		 * actividad : break and continue break 3 usos permite salir de un ciclo break
		 * puede ser utilizado como got to
		 */

		int valor = 10;

		// "iterar" sinonimo de "recorrer"
		
		switch (valor) {
		case 10:
			System.out.print("es 10");
			break;

		default:
			System.out.println("no es 10");
			break;
		}

		for (int x = 1; x < 101; x++) {

			if (x == 10) {

				break;
			}
	// el PRINT hace imprimir todos los print en la misma linea
			System.out.print(x);

		}
		
			System.out.println(" Ciclo terminado");
			
			
			//otro ciclo dentro de otro ciclo
		for (int i = 0; i < 3; i++) {
			System.out.print("siguiente " + i + ": ");

			for (int j = 0; j < 100; j++) {
				if (j == 10) {
				break;
				}
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

}
