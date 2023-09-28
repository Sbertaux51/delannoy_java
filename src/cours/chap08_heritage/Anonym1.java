package cours.chap08_heritage;

// Exemple d'une classe anonyme
// Java permet de définir une classe sans lui donner de nom (utile pour la gestion d'évènements)
// Une classe anonyme ne peut pas introduire de nouvelles méthodes

// P250

public class Anonym1 {

	public static void main(String[] args) {
		
		{
			// Définition d'une classe anonyme dérivée de A4
			// Compte-tenu du type de référence a, affiche() doit avoir été déclaré dans la super-classe

			A4 a ;
			a = new A4() {
				public void affiche() {
					System.out.println("Je suis un anonyme derive de A");
				}
			} ;
			
			a.affiche(); 
			
			//A4b ab = new A4b();
			//ab.affiche();
		}

	}

}

class A4 {
	public void affiche() {
		System.out.println("Je suis un A");
		
	}
}

/*
class A4b extends A4 {
	public void affiche() {
		System.out.println("Je suis aussi un anonyme derive de A");
		
	}
}
*/