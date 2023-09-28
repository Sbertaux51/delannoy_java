package cours.chap06;

// Exemple de surdéfinition et droits d'accès
// Les méthodes privées ne sont pas accessibles en dehors de la classe,
// ainsi, un même appel peut conduire à l'appel d'une méthode différente
// Page 146
public class SurdfAcces {
	public static void main(String args[]) {
		A a = new A();
		a.g();
		
		System.out.println("--- dans main");
		int n=2; 
		float x=2.5f;
		a.f(n); // Appel de la méthode publique f(float x) car f(int n) non accessible
		a.f(x); // Appel de la méthode publique f(float x)  
	}
}


class A {
	private void f(int n) {
		System.out.println("f(int) n = " + n);
	}

	public void f(float x) {
		System.out.println("f(float) x = " + x);
	}

	public void g() {
		int n=1;
		float x=1.5f;
		System.out.println("--- dans g");
		f(n); // Appel de la méthode privéee  f(int n)
		f(x); // Appel de la méthode publique f(float x)
	}
}