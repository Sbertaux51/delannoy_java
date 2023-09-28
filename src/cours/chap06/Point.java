package cours.chap06;

// Classe avec constructeur
// A partir du moment, où une classe dispose d'un constructeur,
// il n'est plus possible de creer un objet sans l'appeler.
public class Point {
	
	public Point() {
	}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void initialise (int abs, int ord) {
		this.x = abs;
		this.y = ord;
	}
	
	public void deplace (int dx, int dy) {
		x += dx;
		y += dy;
	}
	
	public void affiche () {
		System.out.println("Je suis un point de coodonnee " + x + " " + y);
	}
	
	// Méthodes d'accès à x et y
	public int getX() {
		return this.x;
	}

	public int getY() {
		return this.y;
	}

	// Méthodesd'altérarion 
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}

	// Encapsulation des attributs grace à 'private' 
	// qui permet que les champs ne soient pas accessibles à l'extérieur de la classe
	private int x;
	private int y;
}
