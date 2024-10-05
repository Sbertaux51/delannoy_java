package cours.chap10;

// Exemple de transmission au gestionnaire d'exception 
// par le constructeur de la classe d'exception
// (avec arrêt d'exécution du programme)

// P294

public class Exinfo2 {
	public static void main(String[] args) {
		try {
			Point5 a = new Point5(1, 4);
			a.affiche();
			a = new Point5(-3, 5); /* Constructeur entrainant une exception */
			a.affiche();
		} catch (ErrConst5 e) {
			System.out.println(e.getMessage());
			// Sortie du prog avec un statut d'erreur,
			// la valeur -1 peut être interprétée comme un indicateur d'échec
			System.exit(-1);
		}

	}
}

class Point5 {
	public Point5(int x, int y) throws ErrConst5 {
		if ((x < 0) || (y < 0))
			throw new ErrConst5("Erreur constructeur avec coordonnees " + x + " " + y); /* Message explicatif */
		this.x = x;
		this.y = y;
	}

	public void affiche() {
		System.out.println("Coordonnees : " + x + " " + y);
	}

	private int x, y;
}

class ErrConst5 extends Exception {
	private static final long serialVersionUID = 1L;

	ErrConst5(String mes) {
		super(mes); /* Message retransmis  la super-classe Exception */
	}

	public int abs, ord;
}
