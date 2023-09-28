package cours.chap08_heritage;

// Exemple artificiel de duplication de champs :
// la classe dérivée définit un champ portant le même nom qu'un champ de la super-classe
// P214

class A2 {
	public int n = 4;
}

class B2 extends A2 {
	
	// La champs n 
	public float  n = 4.5f;
}

public class DupChamp2 {
	public static void main(String[] args) {
		A2 a = new A2();
		B2 b = new B2();
		
		System.out.println("a.n = " + a.n);
		System.out.println("b.n = " + b.n);
	}
}
