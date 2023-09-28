package cours.chap05;

import cours.outils.Clavier;

// Exemple de boucle 'do...while' exécutée tant que la condition est vraie
// La condition est examinée après la boucle (le 'do' est exécuté au moins une fois)
public class Do1 {
	public static void main (String args[]) {
		int n;
		do {
			System.out.println("Donner un nombre >0 : ");
			n =Clavier.lireInt();
			System.out.println("vous avez fourni " + n);
		}

		while (n <= 0) ;
		System.out.println("Reponse correcte");
	}
}
