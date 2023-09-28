package cours.chap06;

// Reprise de la classe TestTransmissionArgObjets
// mais avec une méthode coincide statique pour rendre la fonction symétrique

public class TestTransmissionArgObjetsStatic {
	
	public static void main(String args[]) {
		Point6 a = new Point6(1, 3);
		Point6 b = new Point6(2, 5);
		Point6 c = new Point6(1, 3);

		System.out.println("a et b " + Point6.coincide(a, b) + " " + Point6.coincide(b, a));
		System.out.println("a et c " + Point6.coincide(a, c) + " " + Point6.coincide(a, c));
	}
}


class Point6 {
	public Point6(int abs, int ord) {
		x = abs;
		y = ord;
	}

	// Méthode permettant d'acéder aux champs privés d'un objet de même classe
	public static boolean coincide (Point6 pt1, Point6 pt2) {
		return ((pt1.x == pt2.x) && (pt1.y == pt2.y));
	}
	private int x, y;
}
