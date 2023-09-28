package cours.chap08_heritage;

// Exemple d'utilisation d'une classe Pointcol dérivée de Point
// Pointcol a accès aux membres publics de sa classe de base
// P194

public class TstPcol1 {
	public static void main(String[] args) {
		Pointcol pc = new Pointcol();
		pc.affiche();
		pc.initialise(3, 5);
		pc.colore((byte)3);
		pc.affiche();
		pc.deplace(2, -1);	
		pc.affiche();
		Point p = new Pointcol();
		p.initialise(6, 9);
		p.affiche();
	}

}
