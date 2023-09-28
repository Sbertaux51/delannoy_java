package cours.chap08_heritage;

// Exemple de méthodes par défaut et de dérivation d'interfaces
//
// Une méthode par défaut est une méthode disposant dejà d'une implémentation
// Cette méthode peut être utilisée directement par la classe implémentant l'interface 
// ou redéfinie dans une classe dérivée
// P244

interface Afficher {
	default void affiche() { 
		System.out.println("Je suis Afficher = " + this); 
	}
}

interface Afficher1 extends Afficher {} // Utilisation de affiche() de Afficher

interface Afficher2 extends Afficher {  // affiche() devient une méthode abstraite 
	void affiche();
}

interface Afficher3 extends Afficher {	// Redéfinition de affiche()
	default void affiche() {
		System.out.println("Je suis Afficher3 = " + this); 
	}
}

class A3 implements Afficher1 {}

class B3 implements Afficher2 {	// Classe devant implémenter affiche() (car vidée dans Affiche3)
	public void affiche() {
		System.out.println("Je suis un B = " + this); 
	}
}


class C3 implements Afficher3 {}

public class MethDef2 {
	public static void main(String[] args) {
		A3 a = new A3();
		B3 b = new B3();
		C3 c = new C3();
		
		a.affiche();
		b.affiche();
		c.affiche();
	}
}
