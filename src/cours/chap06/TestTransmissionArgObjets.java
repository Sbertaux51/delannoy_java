package cours.chap06;

// Transmision de type classe
// Cas où l'unité d'encapsulation est la classe et non l'objet : 
// l'objet a peut aux champs privés d'un autre objet b de la même classe  
// Ca ne marche pas si les classes sont différentes

public class TestTransmissionArgObjets {
	
	public static void main(String args[]) {
		Point5 a = new Point5(1, 3);
		Point5 b = new Point5(2, 5);
		Point5 c = new Point5(1, 3);

		System.out.println("a et b " + a.coincide(b) + " " + b.coincide(a));
		System.out.println("a et c " + a.coincide(c) + " " + c.coincide(a));
	}
}


class Point5 {
	public Point5(int abs, int ord) {
		x = abs;
		y = ord;
	}

	// Méthode permettant d'acéder aux champs privés d'un objet de même classe
	public boolean coincide (Point5 pt) {
		return ((pt.x == x) && (pt.y == y));
	}
	private int x, y;
}
