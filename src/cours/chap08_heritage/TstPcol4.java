package cours.chap08_heritage;

// Exemple de redéfinition de la méthode affiche dans une classe dérivée Pointcol4
// avec utilisation du mot-clé super 
// P207

class Point4 {
	public Point4(int x, int y) {
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

class Pointcol4 extends Point4 { // Pointcol dérive de Point
	public Pointcol4(int x, int y, byte couleur) {
		super(x, y); // Appel constructeur classe de base (obligatoirement 1ere instruction)
		this.couleur = couleur;
	}
	
	// Redéfintion de affiche de la super-classe
	public void affiche () {
		super.affiche();
		System.out.println("Et ma couleur est " + couleur);
	}

	private byte couleur; 

}


public class TstPcol4 {
	public static void main(String[] args) {
		Pointcol4 pc = new Pointcol4(3, 5 , (byte)3);
		pc.affiche();	// Ici il s'agit de affiche de Pointcol4
		pc.deplace(1, -3);	
		pc.affiche();
	}

}
