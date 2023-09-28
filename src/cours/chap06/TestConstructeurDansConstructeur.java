package cours.chap06;

//Exemple illustrant qu'une méthode renvoie une copie de la référence à un objet  
// Méthode fournissant en retour la symétrique d'un Point
// Page 155

public class TestConstructeurDansConstructeur {	
	public static void main(String args[]) {
		Point8 a = new Point8(1, 2);
		Point8 b = new Point8();
	}
}


class Point8 {
	public Point8(int abs, int ord) {
		x = abs;
		y = ord;
		System.out.println("Constructeur a deux arguments " + x + " " + y);
	}

	public Point8() {
		this(0,0); // appel Point8(0,0), doit être la première instruction
		System.out.println("Constructeur sans argument");
	}

	private int x, y;
}
