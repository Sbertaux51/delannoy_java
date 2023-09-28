package cours.chap06;

// Test des classes Point et Cercle
public class TestCerc {

	public static void main(String args[]) {
		Point p = new Point(3 , 5);
		p.affiche();
		
		Cercle c = new Cercle(1 , 2 , 5.5f) ;
		c.affiche();
	}
}
