package cours.chap06;

// Transmision d'arguments primitifs
// Exemple de transmission par valeur ne fonctionnant pas dans la méthode appelante
// Un échange a bien lieu mais il portesur les valeurs des arguments muets a et b de la méthode Echange.
// Les valuers des arguments effectis n et p de la méthode main ne sont pas affectés par l'appe lde la méthode Echange
// Page 148

public class TestTransmissionArgPrimitifs {
	public static void main(String args[]) {
		int n = 10, p = 20;
		System.out.println("Avant appel : " + n + " " + p);
		Util.Echange(n, p);
		System.out.println("Apres appel : " + n + " " + p);
	}
}


class Util {
	public static void Echange(int a, int b) {
		System.out.println("Debut Echange : " + a + " " + b);
		int c;
		c = a ; a = b ; b = c;
		System.out.println("Fin   Echange : " + a + " " + b);
	}
}


