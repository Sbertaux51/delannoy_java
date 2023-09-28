package cours.chap06;

// Exemple de surdéfinition de la méthode deplace() de la classe Point
public class Surdef1 {
	public static void main(String args[]) {
		Point3 a = new Point3(1 , 2);
		a.deplace(1, 3);	//Appel de deplace(int, int)
		a.deplace(2);       //Appel de deplace(int)
		
		short p=3;
		a.deplace(p);       //Appel de deplace(short)
		
		byte b=2;
		a.deplace(b);		//Appel de deplace(short) après conversion de byte en short
	}
}


class Point3 {
	public Point3(int abs, int ord) {
		this.x = abs;
		this.y = ord;
	}

	public void deplace (int dx, int dy) {	// deplace(int, int)
		x += dx;
		y += dy;
		System.out.println("deplace(int, int)");
	}

	public void deplace (int dx) {		// deplace(int)
		x += dx;
		System.out.println("deplace(int)");
	}

	public void deplace (short dx) {	// deplace(short)
		x += dx;
		System.out.println("deplace(short)");
	}

	private int x, y;
}
