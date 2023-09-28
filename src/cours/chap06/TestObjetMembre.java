package cours.chap06;

// Exemple d'une classe Cercle comportant nu objet membre Point
// Un objet membre est un attribut faisant reference a une classe
// page 160


public class TestObjetMembre {
	public static void main(String args[]) {
		Point9 p = new Point9(3, 5);
		p.affiche();
		Cercle9 c = new Cercle9(1, 2, 5.5f);
		c.affiche();
		//System.out.println("Donner un entier positif : ");
	}
}

class Point9 {
	public Point9 (int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void affiche () {
		System.out.println("Je suis un point de coodonnee " + x + " " + y);
	}


	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	// Encapsulation des attributs grace à 'private' 
	// qui permet que les champs ne soient pas accessibles à l'extérieur de la classe
	private int x;
	private int y;
}


class Cercle9 {
	public Cercle9 (int x , int y, float r) {
		c = new Point9 (x, y) ;
		this.r = r;
	}

	public void affiche() {
		System.out.println("Je suis un cercle de rayon " + r);
		System.out.println(" et de centre de coordonees " + c.getX() + "" + c.getY());
	}

	public void deplace (int dx, int dy) {
		c.setX(c.getX() + dx);
		c.setY(c.getY() + dy);
	}

	private Point9 c;	// Centre du cercle ==> objet membre
	private float r;	// Rayon du cercle
}
