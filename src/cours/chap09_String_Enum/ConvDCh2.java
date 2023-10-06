package cours.chap09_String_Enum;

import cours.outils.Clavier;

//Exemple de conversion d'un int en String

//P269

public class ConvDCh2 {

	public static void main(String[] args) {
		
		double x;
		while(true) {
			System.out.println("donner un double (0 pour finir) :");
			x = Clavier.lireFloat();
			if (x==0) break;
			
			String ch = String.valueOf(x);
			System.out.println(" chaine correspondante de longueur " + ch.length() + " : " + ch); 
		}
	}
}
