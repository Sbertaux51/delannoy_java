package cours.chap09_String_Enum;

import cours.outils.Clavier;
// Fonctionnalités de String
// Exemple d'un programme qui lit une chaine au clavier et l'affiche verticalement

// P258

public class MotCol {
	public static void main(String[] args) {
		String mot ;
		System.out.println("Donner un mot :");

		mot = Clavier.lireString();

		System.out.println("Voici le mot en colonne " );
		for (int i = 0; i < mot.length() ; i++) {
			System.out.println(mot.charAt(i));
		}
	}
}
