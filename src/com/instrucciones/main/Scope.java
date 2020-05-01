package com.instrucciones.main;

public class Scope {

	public static void main(String[] args) {
		// Scope = Alcance

		int promedio = 4;
		if (promedio >= 7) {
			String mensaje = "Felicidades, tu promedio es de " + promedio;
			if (promedio == 10) {
				System.out.println(mensaje);
			}
		}

	}

}
