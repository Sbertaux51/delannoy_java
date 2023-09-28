package cours.chap08_heritage;

// Le constructeur de la classe dérivée doit prendre en charge l'intégralité de la construction de l'objet.
// Si un constructeur d'une classe dérivée appelle un constructeur d'une classe de base, il doit obligatoirement s"agir de la première instruction du constructeur et ce dernier est désigné par le mot-clé super.
// P200

class Point3 {
	public Point3(int x, int y) {
		this.x = x;
		this.y = y;
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

class Pointcol3 extends Point3 { // Pointcol dérive de Point
	public Pointcol3(int x, int y, byte couleur) {
		super(x, y); // Appel constructeur classe de base (obligatoirement 1ere instruction)
		this.couleur = couleur;
	}
	
	public void affichec () {
		affiche();
		System.out.println("Et ma couleur est " + couleur);
	}

	private byte couleur; 

}


public class TstPcol3 {
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
