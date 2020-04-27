package com.constante.main;

public class Aritmetica {

	public static void main(String[] args) {
		int vari1 = 25, vari2 = 69, resultado;
		System.out.println("x= " + vari1 + "   y= " + vari2);

		resultado = vari1 + vari2;
		System.out.println("suma: " + resultado);

		resultado = vari1 - vari2;
		System.out.println("resta: " + resultado);

		resultado = vari1 / vari2;
		System.out.println("division: " + resultado);

		resultado = vari1 * vari2;
		System.out.println("multiplicacion: " + resultado);

		//adicion de unidades

		vari1 = vari1 + 2;
		System.out.println("2 unidades mas de 'X': " + vari1);

		vari1++;
		System.out.println(vari1);
		
		vari1 += 3;
		System.out.println(vari1);
	}

}
