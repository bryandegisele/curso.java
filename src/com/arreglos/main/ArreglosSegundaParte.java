package com.arreglos.main;

public class ArreglosSegundaParte {

	public static void main(String[] args) {
		// declarar de otra menera declarar el arreglo con su longitud
		// la longitud del arreglo son la cantidad de posiciones
		int calificaciones[] = { 9, 8, 7, 8, 7, 8, 7, 9, 8, 10 };
		String nombres[] = new String[6];
		

		/*
		 * otramanera de declarar el arreglo la forma es util cuando ya tengo
		 * predeterminado los valores a cargar no sirve cuando el usuario carga los
		 * valores por consola o cuando los valores so tomados desde otro lugar
		 * 
		 * 
		 * String names[] = {"codi1", "codi2", "codi3"}
		 *
		 * 
		 * dentro de las llaves se ordenan solos los valores de las posiciones
		 * 
		 */
		nombres[0] = "Bryan";
		nombres[1] = "Gisele";
		nombres[2] = "Ludmila";
		nombres[3] = "Elizabeth";
		nombres[4] = "Selena";
		nombres[5] = "Isabella";
		// sacar el promedio de las calificaciones
		int suma = 0;
		
// cuando llamamos a un arreglo que no esta vreado aparece un error de ejecucion
//indice ponemos variable i
		for (int i = 0; i < calificaciones.length; i++) {
			suma += calificaciones[i];
		//	System.out.println(calificaciones[i]);
		}
		float promedio = suma / calificaciones.length;
		System.out.println("El promedio es: "+ promedio);
		//el for each nos permite recorrer una COLECCION
		//de un arreglo, en cada ietracion nos permite obtener el valor del indice
		//el indice del for each normalmente es el singular del arreglo
		for (String  nombre : nombres) {
			System.out.println(nombre);
		}
		
	}

}
