package cours.chap08_heritage;

// Exemple artificiel de duplication de champs :
// la classe dérivée définit un champ portant le même nom qu'un champ de la super-classe
// P214

class A1 {
	public int n = 4;
}

class B1 extends A1 {
	
	// La champs n 
	public float  n = 4.5f;
	
	public void f() {
		n = 5.25f; // n désigne le champ n (float) de B	
		super.n = 3; // tandis que super.n désigne le champ n de la super-classe
	}
}

public class DupChamp1 {
	public static void main(String[] args) {
		A1 a1 = new A1();
		B1 b1 = new B1();
		a1.n = 5; 	// a.n désigne ici le champ n(int) de la classe A
		b1.n = 3.5f;// b.n désigne ici le champ n(flaot) de la classe B
		
		System.out.println("a.n = " + a1.n);
		System.out.println("b.n = " + b1.n);
	}
}
