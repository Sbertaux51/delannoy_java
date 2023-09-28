package cours.chap08_heritage;

// Exemple de polymorphisme avec un tableau hétérogène de type d'objets avec une méthode indiquant la nature de l'objet
//
// Java permet d'affecter à une variable objet non seulement la référence à un objet du type correspondant,
// mais aussi une référence à un objet d'u bntype dérivé
// C'est une conversion implicite d'une référence à un type classe T en une référence à un type ascendant T'.
// Le polymorphisme permet d'obtenir un comportmeent adapté à chaque type d'objet sans avoir besoin de tester sa nature.
//
// Le choix de la méthode au moment de l'exécution porte le nom de ligature dynamique
// P221

class Point7 {
	public Point7 (int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void affiche() {
		identifie();
		System.out.println("Mes coordonnees sont "  + x + " " + y);
	}
	
	public void identifie() {
		System.out.println("Je suis un point");
	}

	private int x , y;
}


class Pointcol7 extends Point7 {
	public Pointcol7 (int x, int y , byte couleur) {
		super (x, y ); // Obligatoirement comme première instruction
		this.couleur = couleur;
	}

	public void identifie() {
		System.out.println("Je suis un point colore de couleur " + couleur);
	}

	private byte couleur;
}


public class TabHeter2 {
	public static void main(String[] args) {
		Point7 [] tabPts = new Point7 [4];
		tabPts[0] = new Point7(0, 2);
		tabPts[1] = new Pointcol7 (1 , 5, (byte)3);
		tabPts[2] = new Pointcol7 (2 , 8, (byte)9);
		tabPts[3] = new Point7(1, 2);
		
		for (int i=0; i<tabPts.length ; i++) {
			tabPts[i].affiche();
		}
	}
}