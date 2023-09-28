package cours.chap07_tableaux;

import cours.chap06.Point;

// Exemple d'ellipse (méthode à nombre variables d'arguments)
// avec plusieurs arguments 
// L'ellipse doit alors être unique et en fin de liste
// Page 189

public class EllipsePlusieursArguments {

	public static void main(String args[]) {
		int n=2;
		float f = 0.5f;
		Point p = new Point(2 , 5);
				
		System.out.println("Somme : " + somme (n, f, p, 2, 8, 9) );
		System.out.println("Somme : " + somme (n, f, p ) );
		System.out.println("Somme : " + somme (n, f, p, 3) );
	}

	static int somme(int n, float f, Point p, int... valeurs) {
		System.out.println("n : " + n);
		System.out.println("f : " + f);
		p.affiche();

		int s = 0 ;
		for (int v : valeurs)
			s += v;
		
		return s;
	}
}
