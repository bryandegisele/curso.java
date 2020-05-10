package com.instrucciones.main;

public class Continue {
	public static void main(String[] args) {

		// break and continue
		//continue NO SALE DEL FOR 
		//PERMITE QUE SALTA A LA SIGUIENTE ITERACION

		for (int x = 0; x < 10; x++) {
			if (x == 5) {
				continue;
			}
		System.out.println(x);
		}
	}
}
