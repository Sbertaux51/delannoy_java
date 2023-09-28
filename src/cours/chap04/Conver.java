package cours.chap04;

public class Conver {
	public static void main (String args[]) {
		// Promotion numérique de byte en int
		byte b1 = 50, b2 = 100;
		int n;
		n = b1 * b2;
		// b1 et b2 sont convertis en int avant qu'on fasse le produit (en int), 
		// le resultat aurait dépassé la capacoté de type byte mais il est correct
		System.out.println(b1 + "*" + b2 + " = " + n);

		// Promotion numérique de int en long
		int n1 = 100000, n2 = 200000 ;
		long p;
		p = n1*n2;
		// ATTENTION : les produit est calculé en int, il conduit à un dépassement 
		// le résultat erroné est affecté à p
		System.out.println(n1 + "*" + n2 + " = " + p);
	}
}
