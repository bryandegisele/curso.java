package com.Practicas.main;

public class UnicaSentancia {

	public static void main(String[] args) {
		// eliminacion de {} para 1 sola sentencia
		// cuando hay una SOLA LINEA DE CODIGO
		//OMITIR EL USO DE {} DEL CICLO, DEL ELSE, Y DE LA CONDICION
		//IMPORTANTE ; solo funciona cuando hay 1 linea de cogido
		//si tengo dos sentencias las {} SON OBLIGATORIAS.
		
		boolean valor = true;

		if (valor) {
			System.out.println("¡Es verdadero!");

		} else {
			System.out.println("¡Es falso!");
		}
		for (int x = 0; x < 10; x++)
			;
		{
			System.out.println("Mensaje");
		}

	}

}
