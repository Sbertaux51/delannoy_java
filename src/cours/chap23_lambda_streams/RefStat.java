package cours.chap23_lambda_streams;

// Exemple d'une référence à une méthode statique

// P687

interface Calculateur8 { public int calcul(int n) ; }
public class RefStat {

	public static void main(String[] args) {
		traite(5, RefStat::carre);		// au lieu de traite(5, x -> x*x)
		traite(12, RefStat::trinome);	// au lieu de traite(5, x -> 2*x*x + 3*x + 5)
	}

	public static void traite(int n , Calculateur8 cal) {
		int res = cal.calcul(n);
		System.out.println("Calcul (" + n + ") = " + res );
	}
	
	public static int carre(int n ) {
		return n * n;
	}
	
	public static int trinome(int n ) {
		return 2*n*n + 3*n + 5;
	}
}
