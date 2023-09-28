package cours.chap06;

//Exemple illustrant qu'une méthode renvoie une copie de la référence à un objet  
// Méthode fournissant en retour la symétrique d'un Point
// Page 153

public class TestTransmissionRetourObjet {	
	public static void main(String args[]) {
		Point7 a = new Point7(1, 2);
		a.affiche();

		Point7 b = a.symetrique();
		b.affiche();
	}
}


class Point7 {
	public Point7(int abs, int ord) {
		x = abs;
		y = ord;
	}

	// Renvoie la symétrique d'un point
	public Point7 symetrique() {
		Point7 res;
		res = new Point7(y ,x); // la référence continue d'exister à travers b
		return res;
	}
	
	public void affiche () {
		System.out.println("Coordonees " + x + " " + y);
	}

	private int x, y;
}
