package cours.chap10_Exceptions;

// Exemple d'utilisation de deux exceptions 
// La premiere exception ErrDeplacement provoque la sortie du bloc try
// (avec arrêt d'exécution du programme)

// P290

public class Except3 {
	public static void main(String[] args) {
		try {
			Point3 a = new Point3(1, 4); 
			a.affiche();
			a.deplace(-3, 5);
			a = new Point3(-3, 5); /* Constructeur entrainant une exception */
			a.affiche();
		} catch (ErrConstante e) {
			System.out.println("Erreur constructeur");
			// Sortie du prog avec un statut d'erreur, 
			// la valeur -1 peut être interprétée comme un indicateur d'échec 
			System.exit(-1); 
		} catch (ErrDeplacement e) {
			System.out.println("Erreur deplacement");
			// Sortie du prog avec un statut d'erreur, 
			// la valeur -1 peut être interprétée comme un indicateur d'échec 
			System.exit(-1); 
		}

	}
}

class Point3 {
	public Point3(int x, int y) throws ErrConstante {
		if ((x < 0) || (y < 0))
			throw new ErrConstante();
		this.x = x;
		this.y = y;
	}

	public void affiche() {
		System.out.println("Coordonnees : " + x + " " + y);
	}

	public void deplace(int dx, int dy) throws ErrDeplacement{
		if (((x+dx)< 0) || ((y+dy) < 0))
			throw new ErrDeplacement();
		x += dx ; y += dy;
	}
	
	private int x, y;
}

class ErrConstante extends Exception {
	private static final long serialVersionUID = 1L;
}

class ErrDeplacement extends Exception {
	private static final long serialVersionUID = 1L;
}
