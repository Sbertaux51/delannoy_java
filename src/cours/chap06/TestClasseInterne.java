package cours.chap06;

// Exemple d'une classe Centre, interne à Cercle
// Cercle a accès aux champs privés de l'objet Centre associé
// page 160

public class TestClasseInterne {
	public static void main(String args[]) {;
		Cercle10 c1 = new Cercle10(1, 3, 5.5f);
		c1.affiche();
		c1.deplace(4, -2);
		c1.affiche();
	}
}


class Cercle10 {
	class Centre10 {	// Définition classe interne à Cercle
		public Centre10(int x, int y) {
			this.x = x;
			this.y = y;
		}
		
		public void affiche() {
			System.out.println(x + " , " + y);
		}
		private int x, y;
	}
	
	public Cercle10 (int x , int y, double r) {
		c = new Centre10(x, y) ;
		this.r = r;
	}

	public void affiche() {
		System.out.print("Cercle de rayon " + r + " de centre ");
		c.affiche();
	}

	public void deplace (int dx, int dy) { // Ici on a bien accès à x et y de la classe interne
		c.x += dx;
		c.y += dy;
	}

	private Centre10 c;	// Centre du cercle ==> objet membre
	private double r;	// Rayon du cercle
}
