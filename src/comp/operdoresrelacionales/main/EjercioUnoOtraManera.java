package comp.operdoresrelacionales.main;

public class EjercioUnoOtraManera {
	
	public static void main(String[] args) {
		/* hacer un programa comparativo de edades
		 * imprimir si es ninio o adulto
		*para que una persona sea mayor tiene que tener 12 años
		*evaluar los integrantes de la familia
		**/
		
		//paso 1: declarar variables 
		
		//datos de Bryan
		String name = "Bryan";
		int age = 37;
		final int edadComparation = 12;
		boolean comparation;
		
		comparation = age < edadComparation;
		System.out.println(name + "¿is a child?" + comparation);
		
		//datos de gisele
		name = "Gisele";
		age = 28;
		
		comparation = age < edadComparation;
		System.out.println(name + "¿is a child?" + comparation);
		
		//datos de Ludmila
				name = "Ludmila";
				age = 11;
				
				comparation = age < edadComparation;
				System.out.println(name + "¿is a child?" + comparation);
		
				//datos de Elizabeth
				name = "Elizabeth";
				age = 8;
				
				comparation = age < edadComparation;
				System.out.println(name + "¿is a child?" + comparation);
				
				//datos de Selena
				name = "Selena";
				age = 6;
				
				comparation = age < edadComparation;
				System.out.println(name + "¿is a child?" + comparation);
				
				//datos de Isabella
				name = "Isabella";
				age = 2;
				
				comparation = age < edadComparation;
				System.out.println(name + "¿is a child?" + comparation);
				
	}

}
