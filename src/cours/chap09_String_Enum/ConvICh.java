package cours.chap09_String_Enum;

import cours.outils.Clavier;

// Exemple de conversion d'une chaine en int

// P270

public class ConvICh {
	
	public static void main(String[] args) {
		int n;
		while(true) {	// On s'arrete quand n == 0
			System.out.println("donner un entier (0 pour finir) :");
			n = Clavier.lireInt();
			if (n==0) break;
			
			String ch = String.valueOf(n);
			System.out.println(" chaine correspondante de longueur " + ch.length() + " : " + ch); 
		}
	}
}
