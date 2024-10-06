package cours.chap07_tableaux;

import cours.outils.Clavier;

// Exemple d'un programme utilisant un tableau de flottants
// pour déterminer le nombre d'élèves d'une classe ayant
// une note supérieure à la moyenne dela classe
// La définition de la dimension du tableau au moment de sa création
// permet de travailler avec un nom d'élèves quelconque
//
// P177

public class Moyenne {
	public static void main (String args[])
	{
		int i, nbEl, nbElSupMoy;
		double somme;
		double moyenne;
		System.out.print("Combien d'eleves ?");
		nbEl = Clavier.lireInt();
		double notes[] = new double[nbEl]; // Définition dynamique du tableau
		for (i=0 ; i<nbEl ; i++) {
			System.out.print("Donnez la note " + (i+1) + " :");
			notes[i] = Clavier.lireDouble();
		}
		
		for (i=0, somme=0 ; i<nbEl ; i++) somme += notes[i];
		moyenne = somme / nbEl;
		System.out.println("\nmoyenne de la classe : " + moyenne);
		for (i=0, nbElSupMoy=0 ; i<nbEl ; i++)
			if (notes[i] > moyenne) nbElSupMoy++;
		System.out.println(nbElSupMoy + " eleves ont plus de cette moyenne");
		
	}
}
