package cours.chap06;

// Plusieurs classes dans un meme fichier source
// - une seule classe peut etre publique
// - la classe contenant la methode main doit obligatoirement etre publique
// - une classe n'ayant aucun attribut d'acces (rien ou public) reste accessible 
//    à toutes les classes du meme paquetage, donc, a fortiori, du meme fichier source
public class TestPnt2 {
	public static void main(String args[]) {
		Point2 a ;
		a = new Point2();
		a.initialise(3, 5);
		a.affiche();
		a.deplace(2, 0);
	
		// Idem avec b et d'autres arguments (6 et 8)
		Point2 b = new Point2();
		b.initialise(6, 8);
		b.affiche();
	}
}


class Point2 {
	public void initialise (int abs, int ord) {
		this.x = abs;
		this.y = ord;
	}
	
	public void deplace (int dx, int dy) {
		this.x += dx;
		this.y += dy;
	}
	
	public void affiche () {
		System.out.println("Je suis un point de coodonnee " + x + " " + y);
	}

	// Encapsulation des attributs grace à 'private' 
	// qui permet que les champs ne soient pas accessibles à l'extérieur de la classe
	private int x;
	private int y;
}
