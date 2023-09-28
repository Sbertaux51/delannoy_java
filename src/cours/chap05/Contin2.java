package cours.chap05;

import cours.outils.Clavier;

// Exemple de 'continue' :
// permet de passer prématurément au tour de boucle suivant
public class Contin2 {
	public static void main (String args[]) {
		double x;
		do
		{
			System.out.println("donner un flottant > 0 (0 pour finir) : ");
			x = Clavier.lireDouble();
			if (x < 0) {
				System.out.println(" ce nombre n'est pas > 0");
				continue;
			}
			System.out.println(" sa racine est " + Math.sqrt(x));
		}
		while (x!=10);
	}
}
