package com.gisele.main;

public class StringGisele {
	//Atributos
	private String cadena;

	//Metodo Constructor
	public StringGisele(String cadenaQueRecibo) {
		//super();
		cadena = cadenaQueRecibo;
	}
	
	//Metodos
	public String canbiarLetra(int indice) {
		char letra;
		char letraaux;
		letra = cadena.charAt(indice);
		//Saber si letra esta en mayuscula o minuscula
		
		if (Character.isLowerCase(letra)) {
			//Cambiar a mayuscula la letra
			letraaux = Character.toUpperCase(letra);
			cadena = cadena.substring(0,indice) + letraaux + cadena.substring(indice + 1);
		}
		else {
			letraaux = Character.toLowerCase(letra);
			cadena = cadena.substring(0,indice) + letraaux + cadena.substring(indice + 1);
		
		}	
		
		return cadena; 
	}
	
}
