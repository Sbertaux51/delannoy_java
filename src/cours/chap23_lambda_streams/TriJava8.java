package cours.chap23_lambda_streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

// Nouvelles méthodes Java 8 de l'interface Comparator
// Elle facilite la creation d'objets comparateurs : comparing, reversed, reversedOrder et naturalOrder
// Attention : la méthode compareTo ne s'applique quà des objets, d'om les conversions ici en Integer

// P692
public class TriJava8 {

	public static void main(String[] args) {
		List<Point3> liste = new ArrayList<Point3>();
		Point3 tab[] = {new Point3(1, 5),
				new Point3(-2 ,3),
				new Point3(6, -3),
				new Point3(-3, -2)};
		
		// Méthode statique construisant une liste à partir d'un tableau
		liste = Arrays.asList(tab) ; 
		System.out.println("Avant tri : ");
		liste.forEach(pp -> pp.affiche());
		
		liste.sort( (pp1, pp2 ) -> ((Integer)pp1.getX()).compareTo((Integer)pp2.getX()) );
		System.out.println("\nTri abscisse : ");
		liste.forEach(pp -> pp.affiche());

		liste.sort( (pp1, pp2 ) -> ((Integer)pp1.getY()).compareTo((Integer)pp2.getY()) );
		System.out.println("\nTri ordonnees : ");
		liste.forEach(pp -> pp.affiche());
		
		// naturalOrder() possible car Point3 implémente Comparable
		liste.sort( Comparator.naturalOrder() );
		System.out.println("\nTri ordre naturel : ");
		liste.forEach(pp -> pp.affiche());
		
		// comparing() 
		liste.sort( Comparator.comparing(Point3::getY).reversed() );
		System.out.println("\nTri ordonees inverse : ");
		liste.forEach(pp -> pp.affiche());
	}
}




class Point3 implements Comparable<Point3> {
	public Point3(int x, int y) {
		this.x = x; this.y = y;
	}
	
	public void affiche() {
		System.out.println("[" + x + ", " + y + "]");
	}
	
	public int compareTo(Point3 p) {
		return ((Integer)(this.x)).compareTo((Integer)(p.x))  ;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	
	private int x , y;
}
