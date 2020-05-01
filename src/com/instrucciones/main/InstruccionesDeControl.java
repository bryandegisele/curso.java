package com.instrucciones.main;

public class InstruccionesDeControl {

	public static void main(String[] args) {
		// instrucciones de control
		// condicionales

		/*
		 * En java podemos elegir 3 tipos de instrucciones SELECCION (if)
		 * 
		 * ITERACCION SALTO
		 */

		String lightColor = "Pink";
//multiples condicioneles
		if (lightColor.equals("Green")) {

			System.out.println("Can Carry on ");
		} else if (lightColor.equals("Yellow")) {
			System.out.println("Move slowly");
		} else if (lightColor.equals("Red")) {
			System.out.println(" Stop ");
		} else {
		}
		System.out.println(" Invalid Light Color ");
	}

}
