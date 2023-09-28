package cours.chap03;

// Affichage de tous les caractères Unicode
// compris entre codeDeb et codeFin
public class TestUni {
	public static void main (String args[])
	{
		final char carDeb=200, carFin=300;
		char c;
		for (c=carDeb ; c<carFin ; c++) {
			System.out.print((int)c + "-");
			System.out.print(c + " ");
		}
		
	}
}

