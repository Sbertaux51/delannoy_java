package cours.chap04;

public class IEEE {
	public static void main (String args[]) {
		// Exemple avec avec affectation d'Infinity (Float.MAX_VALUE) au résultat d'une opération
		float x = 1e30f; 
		float y;
		y=x*x; // Produit dépassant la valeur max du Float, on lui attribue Float.POSITIVE_INFINITY 
		System.out.println(x + " a pour carre : " + y);

		// Division par zero autorisé en Float
		float zero = 0.f;
		float z = y/zero;
		System.out.println(y + " divise par 0 = " + z);
		y=15;
		System.out.println(y + " divise par 0 = " + z);

		// Les constantes INFINITY donnent NaN lorqu'on les utilise dans les calculs
		float x1 = Float.POSITIVE_INFINITY; // +infini
		float x2 = Float.NEGATIVE_INFINITY; // -infini		
		z = x1/x2;
		System.out.println(x1 + "/" + x2 + " = " + z);
	}

}
