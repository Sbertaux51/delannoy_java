package cours.chap06;

//Exemple classe contenant un champ et une méthode de classe (statiques) permettant de contenir le nombre d'objet crees
class Obj2{
	public Obj2() {
		System.out.print("++ creation objet Obj2 : ");
		nb++;
		System.out.println("il y a maintenant " + nb);
	}
	
	public static long nbObj2() {
		return nb;
	}
	
	private static long nb = 0;
}

public class TstObj2 {
	public static void main(String args[]) {
		Obj2 a;
		System.out.println("Main 1 : nb objets = " + Obj2.nbObj2());
		a = new Obj2();
		System.out.println("Main 2 : nb objets = " + Obj2.nbObj2());
		Obj2 b;
		System.out.println("Main 3 : nb objets = " + Obj2.nbObj2());
		b = new Obj2();
		Obj2 c = new Obj2();
		System.out.println("Main 4 : nb objets = " + Obj2.nbObj2());
	}
}
