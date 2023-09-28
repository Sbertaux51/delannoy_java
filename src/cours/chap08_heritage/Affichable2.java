package cours.chap08_heritage;

// Exemple d'interface : elle définit des en-têtes de méthods et des constantes
// 
// En implémentant une interface, une classe doit redéfinir ses méthodes
// rappel sur la redéfinition : c'est la modification du comportement d’une classe fille par rapport à sa classe mère
//
// Remarque : l'interface a été déclarée avec un droit paquetage et non avec l'attribut public,
// ce qui a permis de placer sa définition dans le même fichier source que les autres classes.
// P240

public interface Affichable2 {
	void affiche();
}

class Entier2 implements Affichable2 {
	public Entier2 (int n) {
		valeur = n;
	}
	
	public void affiche() {
		System.out.println("Je suis un entier de valeur " + valeur);
	}
	public int valeur;
}


class Flottant2 implements Affichable2 {
	public Flottant2 (float n) {
		valeur = n;
	}
	
	public void affiche() {
		System.out.println("Je suis un flottant de valeur " + valeur);
	}
	public float valeur;
}

class TabHeter4 {
	public static void main(String[] args) {
		Affichable2 [] tab;
		tab = new Affichable2 [3];
		tab[0] = new Entier2 (25);
		tab[1] = new Flottant2 (1.25f);
		tab[2] = new Entier2 (42);
		
		int i;
		for (i=0 ; i < tab.length ; i++)
			tab[i].affiche();
	}
}