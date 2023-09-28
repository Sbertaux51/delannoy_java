package cours.chap02_generalites;

// Exemple de programe Java simple 
// P21

public class Exemple 
{
	public static void main (String args[])
	{
		// Déclarations de variables
		int n;		// nombre entier
		double x;	// nombre flottant
		
		// Affectations
		n = 5;
		x = 2*n + 1.5;

		// Instructions
		System.out.println("n = " + n);
		System.out.println("x = " + x);
		
		
		double y;									// Declaration
		y = n * x + 12;								// Affectation
		System.out.println("valeur de y = " + y);	// Instruction
	}
}
