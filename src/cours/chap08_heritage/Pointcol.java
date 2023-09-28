package cours.chap08_heritage;

// Classe dérivant d'une autre classe :
// Pointcol peut faire appel 
// - aux méthodes publiques de Pointcol (colore)
// - aux méthodes publiques de Point (initialize, deplace, affiche), sa classe de base
// P193

public class Pointcol extends Point { // Pointcol dérive de Point
	public void colore (byte couleur) {
		this.couleur = couleur;
	}
	
	private byte couleur; 

}
