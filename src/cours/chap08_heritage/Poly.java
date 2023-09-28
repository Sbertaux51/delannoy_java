package cours.chap08_heritage;

// Exemple de polymorphisme :
//
// Java permet d'affecter à une variable objet non seulement la référence à un objet du type correspondant,
// mais aussi une référence à un objet d'u bntype dérivé
// C'est une conversion implicite d'une référence à un type classe T en une référence à un type ascendant T'.
// 
// Le polymorphisme permet permet de manipuler des objets
// sans en connaître tout à fait le type tout en se basant sur la relation d’héritage.
//
// Il permet ainsi d'obtenir un comporteùent adapté à chaque type d'objet sans avoir besoin de tester sa nature.
//
// Le choix de la méthode au moment de l'exécution porte le nom de ligature dynamique
// P217

class Point5 {
	public Point5 (int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void affiche() {
		System.out.println("Je suis en " + x + " " + y);
	}

	private int x , y;
}


class Pointcol5 extends Point5 {
	public Pointcol5 (int x, int y , byte couleur) {
		super (x, y ); // Obligatoirement comme première instruction
		this.couleur = couleur;
	}

	public void affiche() {
		super.affiche();
		System.out.println(" et ma couleur est : " + couleur);
	}

	private byte couleur;
}


public class Poly {
	public static void main(String[] args) {
		Point5 p = new Point5(3, 5);
		p.affiche();				// Appel affiche() de Point
		Pointcol5 pc = new Pointcol5 (4 , 8, (byte)2);
		p = pc; 					// p de type Point référence un objet de type Pointcol
		p.affiche();				// Appel affiche() de Pointcol
		p = new Point5(5, 7); 		// p référence à nouveau un objet de type Point
		p.affiche(); 				// Appel affiche de Point()
	}
}