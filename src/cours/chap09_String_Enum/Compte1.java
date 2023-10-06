package cours.chap09_String_Enum;

import cours.outils.Clavier;

// Exemple de comptage du nombre d'un caractère donné dans une chaine de caractère

// P264
public class Compte1 {

	public static void main(String[] args) {
		final char car = 'e';
		int i, posCar;
		int  nbCar = 0;
		String ch;
		System.out.println("Donner un mot : ");
		ch = Clavier.lireString();
		i = 0;
		do 
		{	posCar = ch.indexOf(car, i); // recherche à partir du caractère de rang i
			if (posCar >= 0) {
				nbCar++;
				i = posCar + 1;
			}
		}
		while (posCar>=0); // Quand caractère non trouve, renvoie de -1

		System.out.println("Votre mot comporte " + nbCar + " fois le caractere " + car);
		
	}

}
