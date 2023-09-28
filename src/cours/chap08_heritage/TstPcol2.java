package cours.chap08_heritage;

// Exemple d'acces aux membres publics/privés de la classe de base
// -> une méthode d'une classe dérivée n'a pas accès aux membres privés de sa classe de base (ici x et y)
// -> une méthode d'une classe drivée a accès aux membre publicx de sa classe de base
// P196

class Point2 {
	
	public void initialise (int abs, int ord) {
		this.x = abs;
		this.y = ord;
	}
	
	public void deplace (int dx, int dy) {
		x += dx;
		y += dy;
	}
	
	public void affiche () {
		System.out.println("Je suis en " + x + " " + y);
	}

	// Encapsulation des attributs grace à 'private' 
	// qui permet que les champs ne soient pas accessibles à l'extérieur de la classe
	private int x;
	private int y;
}

class Pointcol2 extends Point2 { // Pointcol dérive de Point
	public void colore (byte couleur) {
		this.couleur = couleur;
	}
	
	public void affichec () {
		affiche();
		System.out.println("Et ma couleur est " + couleur);
	}
	
	public void initialise (int x, int y, byte couleur) {
		initialise(x,y);
		this.couleur = couleur;
	}

	private byte couleur; 

}


public class TstPcol2 {
	public static void main(String[] args) {
		Pointcol2 pc1 = new Pointcol2();
		pc1.initialise(3, 5);
		pc1.colore((byte)3);
		pc1.affiche();	// Attention ici affiche
		pc1.affichec();	// et ici affichec

		Pointcol2 pc2 = new Pointcol2();
		pc2.initialise(5, 8, (byte)2);	
		pc2.affichec();
		pc2.deplace(1, -3);	
		pc2.affichec();
	}

}
