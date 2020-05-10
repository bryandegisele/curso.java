package com.arreglos.main;

public class Arreglos {

	public static void main(String[] args) {
		// clase de arreglos
		/*
		 * arreglos caracteristicas: es una estructura de datos permite almacenar datos
		 * del mismo tipo la longitud ES INMUTABLE se define con un tipo se parece a una
		 * lista a todos los datos que se almacenen en el arreglo les corresponde un
		 * indice los arreglos comienzan en el inndice cero el INDICE es la POSICION los
		 * arreglos pueden representar entidades de n dimensiones podemos almacenar un
		 * tipo primitivo o clases paso 1: declarar el arreglo tipo nombre y [] paso 2 :
		 * inicializar, colocar un numero dentro de los [x]
		 * 
		 */
		// declaracion de arreglo tipo String su nombre y []
		// cunado le ponemos [] al lado del nombre java entiende
		// que se trata de un arreglo

		String nombres[];

		/*
		 * inicializacion . dentro de los corchetes va el numero que indica la cantidad
		 * datos que puede recibir nuestro arreglo
		 */
		nombres = new String[6];

		// para cargar las posiciones colocar nombre [] y la posicion numerica
		// dentro de loc corchetes
		// una vez creado e inicializado el arrgelo podemos leer ,insertar y modificar elementos
		
		nombres[0] = "Bryan";
		nombres[1] = "Gisele";
		nombres[2] = "Ludmila";
		nombres[3] = "Elizabeth";
		nombres[4] = "Selena";
		nombres[5] = "Isabella";
		// visualizar un arreglo poner nombre y el indice dento de los corchetess
		System.out.println(nombres[0]+" "+nombres[1]+" "+nombres[2]);
		System.out.println(nombres[3]+" "+nombres[4]+" "+nombres[5]);
	}

}
