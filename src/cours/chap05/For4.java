package cours.chap05;

// Exemple de boucle 'for' avec plusieurs expressions en partie 1 et 3
// Déclaration des variables directement en partie 1
public class For4 {
	public static void main (String args[]) {
		for (int i=1 , j=3 ; i<=5 ; i++, j+=i) { 
			System.out.println("i = " + i + "  j = " + j);
		}	
	}
}
