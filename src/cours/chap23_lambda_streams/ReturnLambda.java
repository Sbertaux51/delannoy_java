package cours.chap23_lambda_streams;

// Exemple d'une expressions lambda dans une instruction return 
// P683

interface Calculateur5 { public int calcul(int n) ; }
public class ReturnLambda {

	public static void main(String[] args) {
		// On lance 4 fois fabriqueStatique pour tester les differents retours possibles
		for (int i=0; i <= 3 ; i++) {
			traite(4, fabriqueStatique());
		}
	}
	
	// Méthode consommant l'expression lambda
	public static void traite(int n, Calculateur5 cal) {
		int res = cal.calcul(n);
		System.out.println("Calcul (" + n + ") = " + res );
	}

	// Méthode renvoyant une expression lambda
	public static Calculateur5 fabriqueStatique() {
		double x = Math.random();
		if (x < 0.5) return xx -> xx * xx;	// Renvoie une expression lambda
		else return xx -> 2 * xx;			// Renvoie une autre expression lambda
	}
}
