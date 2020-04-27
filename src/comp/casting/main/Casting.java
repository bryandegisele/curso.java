package comp.casting.main;

public class Casting {

	public static void main(String[] args) {

		int valorx = 20, valory = 10, solucion;
		float valorf = 2.5f;
		float resultado;
		String nombre = "22", frase;

		resultado = valorx + valorf;
		System.out.println("tipo decimal " + resultado);

		// combiertiendo tipos de datos CASTING
		solucion = valorx + (int) valorf;
		System.out.println("cast" + solucion);

		//solucion = (int) nombre;
		//System.out.println(solucion);
		
		resultado = valorx + valory;
		System.out.println(resultado);
	}

}
