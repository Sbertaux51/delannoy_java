package cours.chap05;

import cours.outils.Clavier;

// Exemple de boucle conditionnelle 'while' exécutée tant que la condition est vraie
// La condition est examinée avant la boucle
public class While1 {
	public static void main (String args[]) {
		int n, som;
		som = 0;
		while (som < 100) {
			System.out.println("Donner un nombre : ");
			n = Clavier.lireInt();
			som += n;
		}

		System.out.println("Somme obtenue : " + som);
	}
}
