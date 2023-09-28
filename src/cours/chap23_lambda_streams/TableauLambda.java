package cours.chap23_lambda_streams;

// Exemple de tableau d'expressions lambda

// P 684

interface Calculateur7 { public int calcul(int n) ; }

public class TableauLambda {

	public static void main(String[] args) {
		
		// Tablea ude'expressions lambda
		Calculateur7 [] tabCal = {
			x -> x*x,
			x -> 2*x,
			x -> (int) Math.sqrt(x)
		};
		
		for (Calculateur7 calc : tabCal) 
			traite (15, calc);
	}

	public static void traite(int n , Calculateur7 cal) {
		int res = cal.calcul(n);
		System.out.println("Calcul (" + n + ") = " + res );
	}
}
