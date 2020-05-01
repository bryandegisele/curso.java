package com.practicaludmila.main;

public class PracticaDeEvaluacion {

	public static void main(String[] args) {
		// -MuestrasPorConsola-Variables-Comentarios-paquete-DatosPrimitivos-
     //Clasificaccion de datos-Constantes-Casting-operaores-operaoresLogicos-
	//operaoresRacionales-String(-Argumentos-Metodos-)
	 
	//Variab	les,contantes "final"	
  int enteros = 38;		
  short	enteros2 = 53;
  byte eros3 = 12;
  float	flotantes = 5.5f ;	
  String cadenas = "Serpientes en las junglas";
  String cadenas2 = "Costumbres Tipicas de distintos Paises";
  boolean  Resultado1;//booleanos
  boolean  Resultado2;//booleanos
  int Resultado3;//booleanos
  
  
//Operadores relacionales
  Resultado1 = enteros != enteros2 ;
   //>  mayor que ,< menor que,>= mayor o igual que,<=menor o igual que,==es igual,!= distinto;
  //Operadores Logicos
  Resultado2 = 23 - 45  <= 12 && 2 + 1 >= 2;//&&=y  O=or  not=no 
  //Operadores + = mas,- = menos,* = multiplicacion,/=dividir 
  //casting
  Resultado3 = eros3 + (int)flotantes ;
  //String metodos
	cadenas = cadenas.replace("serpientes","6");	  
		 
  //imprimir 		  
		  
   System.out.println(Resultado2);
  System.out.println(Resultado3);
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
	}

}
