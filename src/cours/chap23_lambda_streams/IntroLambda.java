package cours.chap23_lambda_streams;

// Exemple d'utilisation d'une classe anonyme pour paramétrer l'appel d'une fonction

// P676

// Interface ne contenant qu'une seule méthode
interface Calculateur1 { public int calcul(int n) ;}

public class IntroLambda {
	public static void main(String[] args) {
		int n1 = 5;
		int n2 = 3;
		
		// Implémentation de l'interface sous forme de classe anonyme
		// la variable 'carre' prend la référence de la classe anonyme
		Calculateur1 carre = new Calculateur1() {
			public int calcul(int n) { return n*n; }
		};
		
		// la variable 'carre' permet l'appel de la méthode calcul
		int res = carre.calcul(n1);
		
		System.out.println("Carre de " + n1 + " = " + res);
		System.out.println("Carre de " + n2 + " = " + carre.calcul(n2));
	}
}
