package cours.chap23_lambda_streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

// Les méthodes intermédiaires d'un stream :
// elles s'appliquent à un stream et fournissent un stream

// P699

public class SourceStream {
	public static void main(String[] args) {
		Integer[] tab = {2, 15, -3, 2, -5, 34, 23, 4, -8, 12};

		// map(): a chaque element, on affecte un int et on obtient un stream de int 
		System.out.println("--- Carres des negatifs, double des positifs") ;
		Stream.of(tab).map( e -> { 
			if (e > 0) return 2*e ; else return e*e; 
		}).forEach(e -> System.out.print (e + " "));

		// peek () : elle laisse le stream inchangé mais lui applique un Consumer (System.out.print)
		System.out.println("\n--- Valeurs et nombre de negatifs") ;
		long nb_reg = Stream.of(tab)
				.filter(e -> e<0)
				.peek(e -> System.out.print(e + " "))
				.count();
		System.out.println("--- Nombre de negatifs : " + nb_reg) ;
		
		// sorted () : elle reorganise le stream en effectuant un tri naturel
		System.out.println("\n--- Valeurs triees par ordre naturel") ;
		Stream.of(tab).sorted().forEach(e -> System.out.print(e + " "));
	
		// parallel : stream en parallèle, tri avec forEachOrdered (indispensable avec stream parallele
		System.out.println("\n--- Valeurs triees par ordre naturel en parallele avec forEachOrdered") ;
		Stream.of(tab).parallel().sorted().forEachOrdered(e -> System.out.print(e + " "));
		
		// distinct () : suppression des doublons et ordre inverse
		System.out.println("\n--- Valeurs triees par ordre inverse, sans doublon") ;
		Stream.of(tab).sorted(Comparator.reverseOrder()).distinct().forEach(e -> System.out.print(e + " "));

	}
}
