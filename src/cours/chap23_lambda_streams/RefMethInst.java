package cours.chap23_lambda_streams;
//Exemple d'une référence à une méthode associé à un objet

//P689
interface DistanciableDe { public int distance_a(Point2 p) ; }

public class RefMethInst {

	public static void main(String[] args) {
		Point2 p1 = new Point2(1, 3), 
			p2 = new Point2(3, 8),
			origine = new Point2(0, 0),
			p = new Point2(1, 2);
				
		DistanciableDe distOrig = origine::distance_a;
		// Equivalent à distOrig = pp -> origine.distace_a(pp)
		System.out.println("Distance de p1 a origin = " + distOrig.distance_a(p1));

		DistanciableDe dist_p = p::distance_a;
		// Equivalent à dist_p = pp -> p.distance_a(pp)
		System.out.println("Distance de p2 a p = " + dist_p.distance_a(p2));
	}
}

class Point2 {
	public Point2(int x, int y) {
		this.x = x; this.y = y;
	}
	
	public int distance_a(Point2 p) {
		return p.x - x ;
	}
	
	private int x , y;
}
