package cours.chap10_Exceptions;

import cours.outils.Clavier;

// Exemple de traitement d'exceptions standards
// Ici des exceptions implicites (pas nécessaire de les mentionner dans une clause throw) 

// P304

public class ExceptionStandard1 {
	public static void main(String[] args) {
		try {
			int t[];
			System.out.println("taille voulue ? ");
			int n = Clavier.lireInt();
					
			t = new int[n];
			System.out.println("indice ? ");
			int i = Clavier.lireInt();
			t[i] = 12;
			
			System.out.println("*** fin normale");
		} catch (NegativeArraySizeException e) {
			System.out.println("Exception taille tableau negative : " + e.getMessage());
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception indice tableau : " + e.getMessage());
		}
		System.out.println("Apres bloc try main");
	}
}
