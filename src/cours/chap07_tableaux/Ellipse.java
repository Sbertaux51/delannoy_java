package cours.chap07_tableaux;

// Exemple d'ellipse (méthode à nombre variables d'arguments)
// Page 188

public class Ellipse {

	public static void main(String args[]) {
		System.out.println(somme (2, 8, 9) );
		System.out.println(somme () );
		System.out.println(somme (3) );
	}

	static int somme(int... valeurs) {
		int s = 0 ;
		for (int v : valeurs)
			s += v;
		
		return s;
	}
}
