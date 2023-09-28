package cours.chap05;

import cours.outils.Clavier;

// Exemple de Switch complet
public class Switch3 {
	public static void main (String args[]) {
		int n;
		System.out.println("Donner un nombre entier >= 0 : ");
		n = Clavier.lireInt();
		
		switch (n) {
		
			case 0:
				System.out.println("nul");
				break;
				
			case 1:
			case 2:
				System.out.println("petit");
				// break;
				
			case 3:
			case 4:
			case 5:
				System.out.println("moyen");
				break;
				
			default: 
				System.out.println("grand");
		}
		System.out.println("Au revoir");
	}
}
