package cours.chap09_String_Enum;

import cours.outils.Clavier;

// Exemple de conversion d'une chaine en type primitif, ici en double

// P274

public class ConvChD {

	public static void main(String[] args) {
		
		String ch ;
		while(true) {
			System.out.println("donner une chaine (vide pour finir) :");
			ch = Clavier.lireString();
			if (ch.length()==0) break;
			
			double x = Double.parseDouble(ch);
			System.out.println(" entier correspondant " + x); 
		}
	}
}
