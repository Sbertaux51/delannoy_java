package cours.chap08_heritage;

// Classe servant de super-classe aux autres exercices
// P192

public class Point {
	
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

	// Encapsulation des attributs grace à 'private' 
	// qui permet que les champs ne soient pas accessibles à l'extérieur de la classe
	private int x;
	private int y;
}
