package cours.chap04;

// Exemples de conversions numériques 
public class RegConv {
	public static void main (String args[]) {

		float x; double y; int n ; short p;
		
		// double --> float : conversion dégradante (Arrondi au plus proche)
		y=1e-100;
		x=(float) y; System.out.println("A-double-float : " + y + " --> " + x);

		y=-1e-100;
		x=(float) y; System.out.println("B-double-float : " + y + " --> " + x);

		y=1e+300;
		x=(float) y; System.out.println("C-double-float : " + y + " --> " + x);

		
		// float --> int : conversion dégradante (Arrondi au plus proche dans le type long ou int (si byte, char, short ou int)
		// puis si nécessaire, conversion en byte, short ou char en conservant les octets les moins significatifs)
		x=123456789.f;
		n=(int) x; System.out.println("D-float-int    : " + x + " --> " + n);
		p=(short) x; System.out.println("E-float-short  : " + x + " --> " + p);

		x=1.23456789e15f;
		n=(int) x; System.out.println("F-float-int    : " + x + " --> " + n);
		p=(short) x; System.out.println("G-float-short  : " + x + " --> " + p);

		x=32771.f;
		n=(int) x; System.out.println("H-float-int    : " + x + " --> " + n);
		p=(short) x; System.out.println("I-float-short  : " + x + " --> " + p);
	}
}
