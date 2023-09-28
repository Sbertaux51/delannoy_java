package cours.chap06;

// Exemple de surdéfinition d'un constructeur
public class Surdef2 {
	public static void main(String args[]) {
		Point4 a = new Point4();		// Appel du constructeur 1
		a.affiche();

		Point4 b = new Point4(5);		// Appel du constructeur 2
		b.affiche();

		Point4 c = new Point4(3 , 9);	// Appel du constructeur 3
		c.affiche();
	}
	
}


class Point4 {
	public Point4() {					// Constructeur 1 (sans argument)
		x=0;
		y=0;
	}
	
	public Point4(int abs) { 			// Constructeur 2 (un argument)
		this.x = abs;
	}
	
	public Point4(int abs, int ord) {	// Constructeur 3 (deux arguments)
		this.x = abs;
		this.y = ord;
	}
	
	public void affiche() {
		System.out.println("Coordonnees : " + x + " " + y);
	}

	private int x, y;
}
