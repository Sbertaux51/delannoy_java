package cours.chap05;

// Exemple de 'break' avec etiquette :
// sortie de la boucle au niveau de l'étiquette
public class BreakEtiquette {
	public static void main (String args[]) {
		int i=1;
		repeat : while (i<=10)  {
			int j;
			for (j=1 ; j<=10 ; j++) {
				System.out.println("debut tour " + j);
				System.out.println("bonjour");
				if (j==3) break repeat;
				System.out.println("fin tour " + j);
			}
			System.out.println("apres la boucle int");
		}
		System.out.println("apres la boucle while");
	}
}
