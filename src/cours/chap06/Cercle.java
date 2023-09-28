package cours.chap06;

// Exemple de classe possedant un objet membre de type point,
// cette dernière etant dotee des fonctions d'acces et d'alteration necessaires
public class Cercle {

	public Cercle (int x , int y, float r) {
		c = new Point (x, y) ;
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

	private Point c;
	private float r;
}
