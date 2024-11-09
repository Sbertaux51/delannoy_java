package cours.chap10_Exceptions;

// Exemple de redeclenchement d'une exception à un niveau supérieur

// P299

public class Redecl {
	public static void main(String[] args) {
		try {
			Point7 a = new Point7(1, 4);
			a.f();
		} catch (ErrConstructeur7 a) {
			System.out.println("dans catch (ErrConstructeur7) de main");
		}
		System.out.println("Apres bloc try main");
	}
}

class Point7 {
	public Point7(int x, int y) throws ErrConstructeur7 {
		if ((x <= 0) || (y <= 0))
			throw new ErrConstructeur7();
		this.x = x;
		this.y = y;
	}

	public void f() throws ErrConstructeur7 {
		try {
			Point7 p = new Point7(-3, 2);
		} catch (ErrConstructeur7 e) {
			System.out.println("dans catch (ErrConstructeur7) de f");
			throw e; // On repasse l’exception à un niveau superieur
		}
	}

	private int x, y;
}

class ErrConstructeur7 extends Exception {
	private static final long serialVersionUID = 1L;
}

class ErrDeplacement7 extends Exception {
	private static final long serialVersionUID = 1L;
}