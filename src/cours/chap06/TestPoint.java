package cours.chap06;

// Emploi de la classe 'Point' depuis une autre classe
public class TestPoint {
	public static void main(String args[]) {
		
		// appel de la methode 'initialise' de type Point 
		// en l'appliquant à l'objet de reference a 
		// en lui transmettant les arguments 3 et 5
		Point a;
		a = new Point();
		a.initialise(3, 5);
		a.affiche();
		a.deplace(2, 0);
		
		// Idem avec b et d'autres arguments (6 et 8)
		Point b = new Point();
		b.initialise(6, 8);
		b.affiche();
	}
}
