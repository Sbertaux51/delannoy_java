package cours.chap09_String_Enum;

import cours.outils.Clavier;

// Exemple de lecture des valeurs d'un type énuméré

// P282

public class EnumLire {

	public static void main(String[] args) {
		
		String chJour;
		System.out.println("Donner un jour de la semaine : ");
		chJour = Clavier.lireString();

		// Premiere demarche :
		// Provoque une exception si la valeur de chJour ne représente pas une valeur de type Jour
		Jour courant = Jour.valueOf(chJour);
		int numJour = courant.ordinal();
		
		System.out.println("Méthode 1 : " + courant + "  est le jour de rang " + numJour);
		
		// Deuxieme demarche :
		for (Jour j : Jour.values()) {
			if (chJour.equals(j.toString())) {
				numJour = j.ordinal();
				System.out.println("Méthode 2 : " + courant + "  est le jour de rang " + numJour);
			}
		}
	}

	enum Jour {lundi, mardi, mercredi, jeudi, vendredi, samedi, dimanche}

}
