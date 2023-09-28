package cours.chap07_tableaux;

// Exemple de programme utilisant un tableau à 2 dimensions
// La fonction reçoit la référence au tableau
// La méthode agit directement sur le tableau et non une copie
// (idem que pour les objets)
// Page 185

class Util2 {
	// Initalisation du tableau à 2 dimensions
	// (for...ech non applicable car modification des valeurs de t)
	static void raz(int t[] []) {
		int i, j;
		for (i=0; i<t.length; i++) {
			for (j=0; j<t[i].length; j++) {
				t[i][j] = 0;
			}
		}
	}

	// Affichage du tableau
	static void affiche(int t[] []) {
		for (int i=0; i<t.length; i++) {
			System.out.print("ligne de rang " + i + " = ");
			for (int j=0; j<t[i].length; j++) {
				System.out.print(t[i][j] + " ");
			}
			System.out.println();
		}
	}
}


public class Tab2Ind1 {
	public static void main (String args[]) {
		int t[] [] = { {1, 2, 3} , {11, 12} , {21, 22, 23, 24}  };
		System.out.println("t avant : ");
		Util2.affiche(t);
		Util2.raz(t);
		System.out.println("\nt apres : ");
		Util2.affiche(t);
	}
}
