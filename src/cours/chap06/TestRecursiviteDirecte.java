package cours.chap06;

import cours.outils.Clavier;

// Exemple d'utilisation d'une méthode statique récursive directe
// Inconvénient : chaque nouvel appel de fac à l'intérieur de fac provoque une nouvelle allocation 
// sans que les emplacements précèdents ne soient libérés. 
// Ce n'est qu'à l'exécution du return que l'espace mémoire est libéré
// Page 156

public class TestRecursiviteDirecte {	
	public static void main(String args[]) {
		int n;
		System.out.println("Donner un entier positif : ");
		n = Clavier.lireInt();
		System.out.println("Voici sa factorielle : " + Util1.fac(n));	
	}
}


// recursivité directe : la méthode s'appelle elle-même
class Util1 {
	public static long fac(long n) {
		if (n>1) return (fac(n-1) * n);
		else return 1;
	}
}