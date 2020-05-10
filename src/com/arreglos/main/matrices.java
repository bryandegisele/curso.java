package com.arreglos.main;

public class matrices {

	public static void main(String[] args) {
		/* matrices:4
		 * un areglo multidimencional es un arreglo de arreglos
		 * en lugar de que en un indice se almacene un valor se almacena un arreglo
		 * arreglos bidimencionales : MATRICES
		 * arreglos de dos dimenciones
		 * una MATRIZ es una tabla que posee  filas y columnas (dos dimenciones)
		 * 
		 */
		/* para generar una MATRIZ seguir la seguiente estructura
		 * colocar tipo de dato
		 * nombre 
		 * y dos corchetes [] [] por filas y columnas
		 * en el ejemplo tenemos una tabla de 4 x 3
		 * el primer valor corresponde a las FILAS
		 * el segundo valor corresponede a las COLUMNAS
		 * se veria asi
		 * 
		 *      COLUMNAS
		 * [0 0] [0 1] [0 2] [0 3]   
		 * [1 0] [1 2] [1 2] [1 3]   FILAS 
		 * [2 0] [2 1] [2 2] [2 3]
		  */
		 int matriz[][] = new int [4][3];
		 //para trabajar con una celde en especifico de la tabla 
		 //nos posicionamos con las cordenadas ( x; y) [x][y]
		 
		 //insertar valor a la tabla:
		 //x = 0 ; y = 0;
		 matriz[0][0] = 1 ;
		 matriz[0][1] = 2 ;
		 matriz[0][2] = 3 ;
		 
		 matriz[1][0] = 1 ;
		 matriz[1][1] = 2 ;
		 matriz[1][2] = 3 ;
		 
		 matriz[2][0] = 1 ;
		 matriz[2][1] = 2 ;
		 matriz[2][2] = 3 ;
		 
		 matriz[3][0] = 1 ;
		 matriz[3][1] = 2 ;
		 matriz[3][2] = 3 ;
		 
		 //recorrer una matriz usando el ciclofor
		 //como es una matriz usamose un ciclo for anidado
		 //el primer cclo recorre las filas
		 //el segundo ciclo recorre las columnas
		 for(int posX = 0 ; posX< matriz.length ; posX++) {
			 for( int posY = 0 ; posY < matriz[posY].length; posY ++) {
				matriz[posX][posY] = posY + 1;
			 }
		 }
		 //ciclos for tardicional
		 			 //insertar valores a la matriz
		 //hacer un refacto
//			 for(int posX = 0 ; posX< matriz.length ; posX++) {
//				 for( int posY = 0 ; posY < matriz[posY].length; posY ++) {
//					 System.out.println(matriz[posX][posY]);
//				 }
//		 }
		 //
		 for(int[] fila : matriz) {
			 for (int celda : fila) {
				 System.out.println(celda);
			 }
		 }
				 
		 
		 
		 
		 
       
}

}
