package cours.chap05;

import cours.outils.Clavier;

// Exemple de Switch complet (mais sans bloc) avec nouveauté apportée en Java 14
// - BREAK n'est plus nécessaire
// - l'étiquette CASE peut énumérer plusieurs valeurs
public class Switch3Java14 {
	public static void main (String args[]) {
		int n;
		System.out.println("Donner un nombre entier >= 0 : ");
		n = Clavier.lireInt();

		switch (n) {
			case 0       -> System.out.println("nul");
			case 1, 2    ->	{
					System.out.println("petit");
					System.out.println("moyen");
			}
			case 3, 4, 5 -> System.out.println("moyen");
			default      -> System.out.println("grand");
		}
		System.out.println("Au revoir");
	}
}
