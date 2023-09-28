package cours.chap06;

import cours.outils.Clavier;

// Exemple d'utilisation d'une méthode statique récursive directe
// Inconvénient : chaque nouvel appel de fac à l'intérieur de fac provoque une nouvelle allocation 
// sans que les emplacements précèdents ne soient libérés. 
// Ce n'est qu'à l'exécution du return que l'espace mémoire est libéré
// Ici on suit, les empilements/dépilement succesifs
// Attention , une méthode récursive est souvent moins efficace
// q'une méthode itérative
// Page 157

public class TestRecursiviteSuiviEmpilements {	
	public static void main(String args[]) {
		int n;
		System.out.println("Donner un entier positif : ");
		n = Clavier.lireInt();
		System.out.println("Voici sa factorielle : " + Util2.fac(n));
	}
}


// Recursivité directe : la méthode s'appelle elle-même
class Util2 {
	public static long fac(long n) {
		long res;
		System.out.println("**entree dans fac : n = " + n);
		if (n <= 1) res = 1;
		else res = fac(n-1) * n;
		System.out.println("**sortie de fac : res = " + res);
		return res;
	}

	// Equivalent à la méthode itérative suivante 
	/*public static long fac2(long n) {
		long res=1;
		for (long i=1; i<=n ; i++) 
			res*= i;
		return res;
	}*/
}