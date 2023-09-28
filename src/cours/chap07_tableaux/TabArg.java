package cours.chap07_tableaux;

// Exemple de fonction recevant un tableau en argument 
// La fonction reçoit la référence au tableau
// La méthode agit directement sur le tableau et non une copie
// (idem que pour les objets)
// Page 181
public class TabArg {
	public static void main (String args[]) {
		
		int t[] = {1, 3, 5, 7};
		System.out.print("t avant : ");
		Util.affiche(t);
		Util.raz(t);
		System.out.print("\nt apres : ");
		Util.affiche(t);
		
	}
}


class Util {
	// Initalisation du tableau
	static void raz(int t[]) {
		for (int i=0; i<t.length; i++) {
			t[i] = 0;
		}
	}

	// Affichage du tableau
	static void affiche(int t[]) {
		//for (int i=0; i<t.length; i++) {
		for (int v : t) {
			System.out.print(v + " ");
		}
	}
}
