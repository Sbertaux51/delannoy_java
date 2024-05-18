package cours.chap09_String_Enum;

// Exemple de tri d'un tableau de chaînes par compareTo()

// P269

public class TriCh {

	public static void main(String[] args) {
		String tabCh[] = { "java", "c", "pascal", "c++", "ada", "basic", "fortran", "cobol", "php", "javascript" };

		String temp; // pour l'échange de deux references
		int i, j;
		int nbCh = tabCh.length;

		for (i = 0; i < nbCh - 1; i++) {
			for (j = i; j < nbCh - 1; j++) {
				// Utilisation de compareTo() (comparaison delon ordre des caracteres)
				if (tabCh[i].compareTo(tabCh[j]) > 0 ) {
					temp = tabCh[i] ;
					tabCh[i] = tabCh[j];
					tabCh[j] = temp;
				}
			}
		}

		System.out.println("Chaines triees: ");
		for (i=0 ; i < nbCh -1 ; i++) {
			System.out.println(tabCh[i]);
		}
	}
}
