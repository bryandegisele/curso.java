package com.instrucciones.main;

public class CasePromedios {

	public static void main(String[] args) {
		//utilizar case para los promedios
		//mejorar el codigo
		
		char calificacion = 'Z';
		
		switch(calificacion) {
		case 'A' :
			System.out.println("Exelente");
			break;
		case 'B' : 
		case 'C' :
			System.out.println("Bien hecho");
			break;
		case 'D' :
			System.out.println("Aprobado");
			break;
		case 'F' : 
			System.out.println("Puedes Mejorar");
			break;
		default:
			System.out.println("Calificacion no vlida");
		}
		

	}

}
