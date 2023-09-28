package cours.chap23_lambda_streams;

// Exemple d'utilisation d'une expression lambda remplaçant la classe anonyme de l'exercice IntroLambda1

// P676

// Interface ne contenant qu'une seule méthode
interface Calculateur2 { public int calcul(int n) ;}

public class IntroLambda2 {
	public static void main(String[] args) {
		int n1 = 5;
		int n2 = 3;

		// Expression lambda
		Calculateur2 carre = (n -> n * n) ;

		int res = carre.calcul(n1);

		System.out.println("Carre de " + n1 + " = " + res);
		System.out.println("Carre de " + n2 + " = " + carre.calcul(n2));
	}
}
