package cours.chap10;

// Exemple d'une classe Point dont le constructeur déclenche une exception ErrConst

// P287 

public class Point {
	public static void main(String[] args) {
		Point p;
		try {
			p = new Point(-1, 0);
			p.affiche();
		} catch (ErrConst e) {
			System.out.println("Exception : " + e);
		}

	}

	public Point(int x, int y) throws ErrConst {
		if ((x < 0) || (y < 0))
			throw new ErrConst();
		this.x = x;
		this.y = y;
	}

	public void affiche() {
		System.out.println("Coordonnees : " + x + " " + y);
	}

	private int x, y;
}

class ErrConst extends Exception {
	private static final long serialVersionUID = 1;
}
