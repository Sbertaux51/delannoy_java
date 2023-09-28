package cours.chap23_lambda_streams;

// Utilisation d'une expression lambda 
// avec une interface fonctionnelle standard fournie par Java

// P680

import java.util.function.*; // Pour IntUnaryOperator
// Functional interfaces provide target types for lambda expressions and method references.

public class LambdaRappel2 {
	public static void main(String[] args) {
		traite (5 , x -> x *x);
		traite (12, x -> 2*x*x + 3*x + 5);
	}
	
	public static void traite(int n,  IntUnaryOperator cal) {
		// applyAsInt est la méthode fonctionnelle de l'interface fonctionnelle IntUnaryOperator
		int res = cal.applyAsInt(n); 
		System.out.println("Calcul (" + n + ") = " + res );
	}
}
