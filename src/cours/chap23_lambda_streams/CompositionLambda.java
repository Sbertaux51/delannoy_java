package cours.chap23_lambda_streams;

// Exemple de composition d'expressions lambda

// P684

interface Calculateur6 { public int calcul(int n) ; }
interface FabriqueCalculateur { Calculateur6 fabrique() ; } // Interface pour créer plusieurs calculateurs 

public class CompositionLambda {

	public static void main(String[] args) {
		// Création  d'une fabrique en fournissant directement la méthode fonctionnelle fabrique
		// sous forme d'une méthode lambda
		// Cette dernière doit à son tour fournir un calculateur sous forme aussi d'expression lambda
		FabriqueCalculateur fabriqueCarre  = () -> (xx -> xx * xx);
		FabriqueCalculateur fabriqueDouble = () -> (xx -> 2 * xx);
		traite(12, fabriqueCarre.fabrique());
		traite(12, fabriqueDouble.fabrique());
	}

	public static void traite(int n , Calculateur6 cal) {
		int res = cal.calcul(n);
		System.out.println("Calcul (" + n + ") = " + res );
	}
}
