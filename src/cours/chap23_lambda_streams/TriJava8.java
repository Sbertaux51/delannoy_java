package cours.chap23_lambda_streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

// Les nouvelles méthodes Java 8 de l'interface Comparator

// P692

public class TriJava8 {
	public static void main(String[] args) {
		List<Point3> liste = new ArrayList<Point3>();
		Point3 tab[] = {
				new Point3 (2 , 5),
				new Point3 (-2, 3),
				new Point3 (6, -3),
				new Point3 (-3, -2)
		};

		// Méthode statique construisant une liste à partir d’un tableau
		liste = Arrays.asList(tab);

		System.out.print("Avant tri : ") ;
		liste.forEach(pp -> pp.affiche());

		// Avec une classe Point3 dotée d'une méthode getX, on peut fournir à une méthode de tri
		// un comparateur basé sur les abcisess
		liste.sort( (pp1 , pp2) -> (((Integer) (pp1.getX())).compareTo((Integer) (pp2.getX()))));
		System.out.print("\nTri abcisses : ") ;
		liste.forEach(pp -> pp.affiche());

		// Avec Comparing, il suffit de mentionner l'élément sur lequel on souhaite 
		// effectuer les comparaisons
		liste.sort(Comparator.comparing(Point3::getY));
		System.out.print("\nTri ordonnees : ") ;
		liste.forEach(pp -> pp.affiche());

		// naturalOrder() fournit un comparateur basé sur l'ordre naturel (correspond à compareTo() )
		liste.sort(Comparator.naturalOrder()); // possible parce que Point3 implemente Comparable
		System.out.print("\nTri ordre naturel : ") ;
		liste.forEach(pp -> pp.affiche());

		// reversed() permer d'inverser l'ordre naturel
		liste.sort(Comparator.comparing(Point3::getY).reversed());
		System.out.print("\nTri ordonnees inverse : ") ;
		liste.forEach(pp -> pp.affiche());
	}
}

class Point3 implements Comparable<Point3> // Comparable pour naturalOrder
{
	private int x , y;
	
	public Point3(int x, int y) {
		this.x = x ; this.y = y;
	}

	public void affiche( ) {
		System.out.print("[" + x + "," + y + "]" ) ; 
	}

	public int getX() { return x;}

	public int getY() {return y;}

	public int compareTo (Point3 p) {
		return (((Integer) (this.x)).compareTo ((Integer) (p.x)));
	}
	
}