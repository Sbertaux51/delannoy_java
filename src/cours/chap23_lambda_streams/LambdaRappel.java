package cours.chap23_lambda_streams;

// Utilisation d'une expression lambda en argument d'une méthode

// P678
interface Calculateur4 { public int calcul(int n) ; }

public class LambdaRappel {
	public static void main(String[] args) {
		traite (5 , x -> x *x);
		traite (12, x -> 2*x*x + 3*x + 5);
	}
	
	public static void traite(int n,  Calculateur4 cal) {
		int res = cal.calcul(n);
		System.out.println("Calcul (" + n + ") = " + res );
	}
}
