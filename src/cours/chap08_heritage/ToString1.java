package cours.chap08_heritage;

// Exemple d'utilsiation de la méthode toString()
// P230

class Point8 {
	public Point8 (int x, int y) {
		this.x = x;
		this.y = y;
	}

	private int x , y;
}


public class ToString1 {
	public static void main(String[] args) {
		Point8 a  = new Point8 (1,2);
		Point8 b  = new Point8 (5,6);
		System.out.println("a = " + a.toString());
		System.out.println("b = " + b.toString());
	}

}
