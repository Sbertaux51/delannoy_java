package cours.chap08_heritage;

// Exemple d'une classe anonyme inplémentant une interface

// Java permet de définir une classe sans lui donner de nom (utile pour la gestion d'évènements)
// Une classe anonyme ne peut pas introduire de nouvelles méthodes

// P251


interface Affichable {
	public void affiche();
}

public class Anonym2 {

	public static void main(String[] args) {
		
		{
			
			Affichable a ;
			
			// Définition d'une classe anonyme inplémentant l'interface Affichable
			a = new Affichable () {
				public void affiche() {
					System.out.println("Je suis un anonyme inplementant A");
				}
				
			} ;

			a.affiche(); 
			
		}

	}

}

