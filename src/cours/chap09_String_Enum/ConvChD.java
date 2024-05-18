package cours.chap09_String_Enum;

import cours.outils.Clavier;

// Exemple de conversion d'une chaine en double

// P274

public class ConvChD {
	
	public static void main(String[] args) {
		String ch;
		while(true) { // On s'arrete quaund la chaine est vide
			System.out.println("donner une chaine numerique (vide pour finir) :");
			ch = Clavier.lireString();
			if (ch.length()==0) break;
			
			double x = Double.parseDouble(ch);
			System.out.println("\nDouble correspondant " + x); 
		}
	}
}
