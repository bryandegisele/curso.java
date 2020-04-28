package comp.operdoresrelacionales.main;

public class OperadoresLogicos {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// operadorse logicos AND (y) OR(o) NOT(no)
		boolean resultado;
		
		// and = && (todas las comparciones verdaderas)
		resultado = 5 > 5  && 10 > 9;
		System.out.println(resultado);

		// or =  (una de las comparaciones debe ser verdadera)
		resultado = 5 > 5  || 10 >9 ;
		System.out.println(resultado);
		
		resultado= (5>=(2*3) || true) && ( true && 10 > 5 );
		System.out.println(resultado);

		System.out.println(!resultado);
		
		System.out.println(!!resultado);
	}
	

}
