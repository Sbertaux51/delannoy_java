package cours.chap10;

// Exemple de transmission au gestionnaire d'exception 
// par l'objet fourni à l'instruction throw

// P292

public class Exinfo1 {
	public static void main(String[] args) {
		try {
			Point4 a = new Point4(1, 4);
			a.affiche();
			a = new Point4(-3, 5); /* Constructeur entrainant une exception */
			a.affiche();
		} catch (ErrConst4 e) {
			System.out.println("Erreur constructeur");
			System.out.println(" coordonnees souhaitees : " + e.abs + " " + e.ord);
			// Sortie du prog avec un statut d'erreur,
			// la valeur -1 peut être interprétée comme un indicateur d'échec
			System.exit(-1);
		}

	}
}

class Point4 {
	public Point4(int x, int y) throws ErrConst4 {
		if ((x < 0) || (y < 0))
			throw new ErrConst4(x, y);
		this.x = x;
		this.y = y;
	}

	public void affiche() {
		System.out.println("Coordonnees : " + x + " " + y);
	}

	private int x, y;
}

class ErrConst4 extends Exception {
	private static final long serialVersionUID = 1L;

	ErrConst4(int abs, int ord) {
		this.abs = abs;
		this.ord = ord;
	}

	public int abs, ord;
}
