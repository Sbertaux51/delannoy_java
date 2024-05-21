package cours.chap09_String_Enum;

// Programme récupérant les arguments de la ligne de commande
// Essayer le programme en pasant des arguments vai 'Run configuration'

// P 275
public class ArgMain {

	public static void main(String args[]) {
		
		int nbArgs = args.length;
		
		if (nbArgs == 0) System.out.println("Pas d'arguments");
		
		for (int i=0; i<nbArgs; i++) 
			System.out.println("Argument numero " + (i+1) + " = " + args[i]);
	}

}
