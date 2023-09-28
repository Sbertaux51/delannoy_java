package cours.chap23_lambda_streams;

//Exemple d'expression lambda constitué d'un bloc complexe 
// (plusieurs instructions, plusieurs return, etc.)

// P678
interface Calculateur3 {public int calcul(int n) ; }

public class CalculComplique {
	public static void main(String[] args) {
		int n1 = 5, n2 = 4, n3 = -5;
		
		Calculateur3 complique = x -> {	if (x>0 && 2*(x/2)==x) return x;
										else if (x>0) return x+1;
										else return -x;
										};
		
		int res = complique.calcul(n1);
		
		System.out.println("Complique de " + n1  + " = " + res);
		System.out.println("Complique de " + n2  + " = " + complique.calcul(n2));
		System.out.println("Complique de " + n3  + " = " + complique.calcul(n3));
	}

}
