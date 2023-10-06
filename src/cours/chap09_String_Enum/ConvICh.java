package cours.chap09_String_Enum;

import cours.outils.Clavier;

//Exemple de conversion d'un double (type primitif) en String

//P269

public class ConvICh {
	
	public static void main(String[] args) {
		int n;
		while(true) {
			System.out.println("donner un entier (0 pour finir) :");
			n = Clavier.lireInt();
			if (n==0) break;
			
			String ch = String.valueOf(n);
			System.out.println(" chaine correspondante de longueur " + ch.length() + " : " + ch); 
		}
	}
}
