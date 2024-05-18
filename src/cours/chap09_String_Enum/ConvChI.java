package cours.chap09_String_Enum;

import cours.outils.Clavier;

// Exemple de conversion d'une chaine en int

// P273

public class ConvChI {
	
	public static void main(String[] args) {
		String ch;
		while(true) { // On s'arrete quaund la chaine est vide
			System.out.println("donner une chaine numerique (vide pour finir) :");
			ch = Clavier.lireString();
			if (ch.length()==0) break;
			
			int x = Integer.parseInt(ch);
			System.out.println("\nInt correspondant " + x); 
		}
	}
}
