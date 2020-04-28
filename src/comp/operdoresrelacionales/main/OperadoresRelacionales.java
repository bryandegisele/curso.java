package comp.operdoresrelacionales.main;

public class OperadoresRelacionales {

	public static void main(String[] args) {
		// operadores relacionales
		int variable1 = 350, variable2 = 350, variable3 = 120, variable4 = 410;
		boolean resultado;

		resultado = variable1 > variable2;
		System.out.println("¿valor 1 > valor 2?  " + resultado);

		resultado = variable1 < variable2;
		System.out.println("¿valor 1 < valor 2?  " + resultado);

		resultado = variable1 >= variable2;
		System.out.println("¿valor 1 >= valor 2?  " + resultado);

		resultado = variable1 <= variable2;
		System.out.println("¿valor 1 <= valor 2?  " + resultado);

		resultado = variable1 == variable2;
		System.out.println("¿valor 1 = valor 2?  " + resultado);

		resultado = variable1 != variable2;
		System.out.println("¿valor 1 no= valor 2?  " + resultado);

	}

}
