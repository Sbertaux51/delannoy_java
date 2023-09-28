package cours.chap06;

// Exemple classe contenant un champ de classe (statique) permettant de contenir le nombre d'objet crees
class Obj{
	private static long nb = 0;
	
	public Obj() {
		System.out.print("++ creation objet Obj : ");
		nb++;
		System.out.println("il y a maintenant " + nb);
	}
}


public class TstObj {
	public static void main(String args[]) {
		Obj a;
		System.out.println("Main 1");
		a = new Obj();
		System.out.println("Main 2");
		Obj b;
		System.out.println("Main 3");
		b = new Obj();
		Obj c = new Obj();
		System.out.println("Main 4");
	}
}
