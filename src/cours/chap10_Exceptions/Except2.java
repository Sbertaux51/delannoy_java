package cours.chap10_Exceptions;

// Exemple d'utilisation d'un gestionnaire d'exception (contenu du bloc catch)
//  (avec arrêt d'exécution du programme)

// P288

public class Except2 {
	public static void main(String[] args) {
		try {
			Point2 a = new Point2(1, 4); 
			a.affiche();
			a = new Point2(-1, 5); /* Constructeur entrainant une exception */
			a.affiche();
		} catch (ErrConst2 e) {
			System.out.println("Erreur constructeur");

			// Sortie du prog avec un statut d'erreur, 
			// la valeur -1 peut être interprétée comme un indicateur d'échec 
			System.exit(-1); 
		}

	}
}

class Point2 {
	public Point2(int x, int y) throws ErrConst2 {
		if ((x < 0) || (y < 0))
			throw new ErrConst2();
		this.x = x;
		this.y = y;
	}

	public void affiche() {
		System.out.println("Coordonnees : " + x + " " + y);
	}

	private int x, y;
}

class ErrConst2 extends Exception {
	private static final long serialVersionUID = 1L;
}

