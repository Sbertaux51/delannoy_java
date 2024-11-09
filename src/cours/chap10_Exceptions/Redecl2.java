package cours.chap10_Exceptions;

// Exemple d'une exception qui en déclenche une autre (rarement utilisé) 

// P300

public class Redecl2 {
	public static void main(String[] args) {
		try {
			Point8 a = new Point8(1, 4);
			a.f();
		} catch (ErrConstructeur8 e) {
			System.out.println("dans catch (ErrConstructeur8) de main");
		} catch (ErrBidon8 e) {
		 System.out.println("dans catch (ErrBidon8) de main");
		}
		System.out.println("Apres bloc try main");
	}
}

class Point8 {
	public Point8(int x, int y) throws ErrConstructeur8 {
		if ((x <= 0) || (y <= 0))
			throw new ErrConstructeur8();
		this.x = x;
		this.y = y;
	}

	public void f() throws ErrConstructeur8, ErrBidon8 {
		try {
			Point8 p = new Point8(-3, 2);
		} catch (ErrConstructeur8 e) {
			System.out.println("dans catch (ErrConstructeur8) de f");
			throw new ErrBidon8(); // On lance une nouvelle exception
		}
	}

	private int x, y;
}

class ErrConstructeur8 extends Exception {
	private static final long serialVersionUID = 1L;
}

class ErrBidon8 extends Exception {
	private static final long serialVersionUID = 1L;
}
