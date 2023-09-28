package cours.chap04;

// Exemple de conversion forcée ne respectant pas les hiérarchies de type 
public class ErrAffE1 {
	public static void main (String args[]) {
		byte b=10;
		int n = 10000;
		b+=n;
		System.out.println("b = " + b); // Affiche 26 à la place de 10010
	}

}
