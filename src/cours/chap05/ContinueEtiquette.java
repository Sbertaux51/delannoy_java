package cours.chap05;

// Exemple de 'break' avec etiquette :
// sortie de la boucle au niveau de l'étiquette
public class ContinueEtiquette {
	public static void main (String args[]) {
		int i=1 , j;
		repeat : while (i<=10)  {
			for (j=1 ; j<=5 ; j++) {
				System.out.println("debut tour " + j);
				if (j==4) continue repeat;
				System.out.println("fin tour " + j);
				i++;
			}
			
			System.out.println("apres la boucle int");
			i++;
		}
		System.out.println("apres la boucle while");
	}
}
