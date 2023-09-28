package cours.chap08_heritage;

// Exemple de classe abstraite
// Une classe abstraite ne permet pas d'instancier des objets :
// elle contient des méthodes et des champs dont héritera toute classe dérivée
// P237

abstract class Affichable1 {
	// Méthode abstraite : on ne fournit que la signature et le type de valeur de retour
	abstract public void affiche() ; 
}

class Entier extends Affichable1 {
	public Entier(int n) {
		valeur = n;
	}
	
	public void affiche() {
		System.out.println("Je suis un entier de valeur " + valeur);
	}

	private int valeur;
}


class Flottant extends Affichable1 {
	public Flottant (float n) {
		valeur = n;
	}

	public void affiche() {
		System.out.println("Je suis un flottant de valeur " + valeur);
	}

	private float valeur;
}



public class TabHeter3 {

	public static void main(String[] args) {
		Affichable1 [] tab;
		tab = new Affichable1[3];
		tab[0] = new Entier (25);
		tab[1] = new Flottant (1.25f);
		tab[2] = new Entier (42);
		
		int i;
		for (i=0 ; i < tab.length ; i++)
			tab[i].affiche();
	}

}
