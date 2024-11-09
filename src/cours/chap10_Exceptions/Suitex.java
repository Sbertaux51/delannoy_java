package cours.chap10_Exceptions;

// Exemple de poursuite d'exécution après le gestionnaire d'exception

// P295

public class Suitex {

	public static void main(String[] args) {
		System.out.println("Avant bloc try");
		
		try {
			Point6 a = new Point6 (1 , 4);
			a.affiche();
			a.deplace(-3 , 5);
			a.affiche();
		} catch (ErrConstructeur6 e) {
			System.out.println("Erreur construction ");
		} catch (ErrDeplacement6 e) {
			System.out.println("Erreur deplacement ");
		}
		System.out.println("Apres bloc try");
	}

}


class Point6 {
	public Point6(int x, int y) throws ErrConstructeur6 {
		if ((x < 0) || (y < 0))
			throw new ErrConstructeur6();
		this.x = x;
		this.y = y;
	}

	public void affiche() {
		System.out.println("Coordonnees : " + x + " " + y);
	}

	public void deplace(int dx, int dy) throws ErrDeplacement6{
		if (((x+dx)< 0) || ((y+dy) < 0))
			throw new ErrDeplacement6();
		x += dx ; y += dy;
	}
	
	private int x, y;
}


class ErrConstructeur6 extends Exception {
	private static final long serialVersionUID = 1L;
}

class ErrDeplacement6 extends Exception {
	private static final long serialVersionUID = 1L;
}