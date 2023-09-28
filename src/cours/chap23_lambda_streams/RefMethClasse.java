package cours.chap23_lambda_streams;

// Exemple d'une référence à une méthode de classe

// P687

interface Distanciable { public int distance(Point p1, Point p2) ; }
public class RefMethClasse {

	public static void main(String[] args) {
		
		Point p1 = new Point(1 , 3) , p2 = new Point(3, 8);
		
		Distanciable dLamb = (pp1 , pp2) -> pp2.getX() - pp1.getX();
		System.out.println("Distance entre p1 et p2 = " + dLamb.distance(p1, p2) );
		
		Distanciable dl = Point::distance1;	// OK deux arguments type Point, retour int
		System.out.println("Distance1 entre p1 et p2 = " + dl.distance(p1, p2) );

		Distanciable d2 = Point::distance2;	// OK deux arguments type Point, retour int
		System.out.println("Distance2 entre p1 et p2 = " + d2.distance(p1, p2) );
		//traite(5, RefMethClasse::carre);		// au lieu de traite(5, x -> x*x)
		//traite(12, RefMethClasse::trinome);	// au lieu de traite(5, x -> 2*x*x + 3*x + 5)
	}
}


class Point{
	public Point(int x, int y) {this.x=x ; this.y=y ;}
	public int distance1 (Point p) { return p.x - x;}
	public int distance2 (Point p) { return p.y - y;}
	public int getX() {return this.x;}
	public int getY() {return this.y;}
	int x;
	int y;
}
