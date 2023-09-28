package cours.chap08_heritage;

// Exemple de polymorphisme avec un tableau hétérogène de type d'objets
//
// Java permet d'affecter à une variable objet non seulement la référence à un objet du type correspondant,
// mais aussi une référence à un objet d'un type dérivé
// C'est une conversion implicite d'une référence à un type classe T en une référence à un type ascendant T'.
// Le polymorphisme permet d'obtenir un comportmeent adapté à chaque type d'objet sans avoir besoin de tester sa nature.
//
// Le choix de la méthode au moment de l'exécution porte le nom de ligature dynamique
// P218

class Point6 {
	public Point6 (int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void affiche() {
		System.out.println("Je suis en " + x + " " + y);
	}

	private int x , y;
}


class Pointcol6 extends Point6 {
	public Pointcol6 (int x, int y , byte couleur) {
		super (x, y ); // Obligatoirement comme première instruction
		this.couleur = couleur;
	}

	public void affiche() {
		super.affiche();
		System.out.println(" et ma couleur est : " + couleur);
	}

	private byte couleur;
}


public class TabHeter {
	public static void main(String[] args) {
		Point6 [] tabPts = new Point6 [4];
		tabPts[0] = new Point6(0, 2);
		tabPts[1] = new Pointcol6 (1 , 5, (byte)3);
		tabPts[2] = new Pointcol6 (2 , 8, (byte)9);
		tabPts[3] = new Point6(1, 2);
		
		for (int i=0; i<tabPts.length ; i++) {
			tabPts[i].affiche();
		}
	}
}