package com.practicaludmila.main;

public class Switch {

	public static void main(String[] args) {
		// switch
		
        int numero = 56;
		String mes ;
		String estacion ;

		switch (numero) {
		case 1:
			mes = " Enero ";estacion = "Verano";
			break;
		case 2:
			mes = "Febrero";estacion = "Verano";
			break;
		case 3:
			mes = "Marzo"; estacion ="Verano";
			break;
		case 4:
			mes ="Abril"; estacion = "Otono";
			break;
		case 5:    
			mes = "Mayo"; estacion = "Otono"; 
			break;
		case 6:
			mes = "Junio"; estacion = "Otono"; 
			break;
		case 7:
			mes = "Julio"; estacion = "Invierno"; 
			break;
		case 8:
			mes = "Agosto"; estacion = "Invierno";
			break;
		case 9:
			mes = "Septiembre"; estacion = "Invierno";
            break;
		case 10:
			mes = "Octubre"; estacion = "Primavera";
            break;		
		case 11:
		    mes = "Septiembre"; estacion = "Primavera"; 
	    break;
		case 12:
			mes = "Diciembre"; estacion = "Primavera";
			break;
		default:

       System.out.println("error not exists thris month and station ");
		}
	}
}
