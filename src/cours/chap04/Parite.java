package cours.chap04;

import cours.outils.Clavier;

// Programme qui décide si un entier est pair ou impair 
// en examinant le dernier bit de sa représentation binaire
public class Parite {
	public static void main (String args[]) {
		int n;
		System.out.println("Donner un entier : ");
		n = Clavier.lireInt();
		if ( (n & 1) == 1) 
			System.out.println("Il est impair");
		else
			System.out.println("Il est pair");
	}
}
