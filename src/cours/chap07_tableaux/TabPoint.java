package cours.chap07_tableaux;

// Exemple d'utilisation d'un tableau d'objets
//Page 180
public class TabPoint {
	public static void main (String args[]) {
		Point1 [] tp;
		tp = new Point1[3];
		tp[0] = new Point1(1, 2);
		tp[1] = new Point1(4, 5);
		tp[2] = new Point1(8, 9);
		for (int i=0; i <tp.length; i++) {
			tp[i].affiche();
		}
	}
}


class Point1 {
	public Point1(int abs, int ord) {
		x = abs;
		y = ord;
	}

	public void affiche () {
		System.out.println("Point : " + x + " " + y);
	}

	private int x, y;
}
