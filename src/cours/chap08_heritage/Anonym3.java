package cours.chap08_heritage;

// Exemple d'une classe anonyme inplémentant une interface

// Java permet de définir une classe sans lui donner de nom (utile pour la gestion d'évènements)
// Une classe anonyme ne peut pas introduire de nouvelles méthodes

// P251


interface Englobante {
	public void f();
	
	final int TOTAL = 5; // vraie variable finale
	int n = 20; // Variable finale de manière implicite pour classe anonyme inplémentant Englobante
	int p = 1;	// Variable finale de manière implicite pour classe anonyme inplémentant Englobante
}


public class Anonym3 {

	
	public static void main(String[] args) {
		{
			// Définition d'une classe anonyme inplémentant l'interface Englobante
			Englobante a = new Englobante () {
				public void f() {
					// Ici, on peut utiliser TOTAL mais pas n et p (sauf depuis java 8 mais on ne pourra pas les modifier)
					
					int p = 2; // Variable locale appartenant à la classe anonyme
							// sans rapport avec la variable p de la classe englobante Englobante
					System.out.println("TOTAL : " + TOTAL);
					System.out.println("n : " + n);
					System.out.println("p : " + p);

				}
			} ;

			a.f(); 
			
		}

	}

}

