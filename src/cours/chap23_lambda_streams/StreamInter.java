package cours.chap23_lambda_streams;

import java.util.Comparator;
import java.util.stream.Stream;

/* Différentes façons d'utiliser les méthodes intermédiares d'un stream */

// P700

public class StreamInter {

	public static void main(String[] args) {
		Integer [] tab = { 2, 15, -3, 2, -5, 34, 23, 4, -8, 12};
		System.out.println("-- Carre des negatifs, double des positifs : ");
		Stream.of(tab)
				// A chaque element, on fait correspondre une valeur
				// soit un carr pour les nagatifs, soit un double pour les positifs
				.map(e -> {if (e >0) return 2*e ; 
							else return e*e; })
				.forEach(e -> System.out.print(e + " "));

		System.out.println("-- Valeurs et nombre de negatifs : ");
		long nb_neg = Stream.of(tab)
						.filter(e -> e < 0)
						.peek(e -> System.out.print(e + " ")) // peek laisse le stream inchangé
						.count();
		System.out.println(" **Nombre de negatifs " + nb_neg);

		System.out.println("-- Valeurs triees ordre naturel : ");
		Stream.of(tab)
			.sorted() // reorganise le stream, soit selon l'ordre naturel, soit selon un comparateur
			.forEach(e -> System.out.print(e + " "));
		
		System.out.println("\n-- Valeurs triees ordre naturel en parallele avec forEachOrdered : ");
		Stream.of(tab)
			.parallel()
			.sorted()
			.forEachOrdered(e -> System.out.print(e + " "));

		System.out.println("\n-- Valeurs triees ordre inverse sans doublons : ");
		Stream.of(tab)
			.sorted(Comparator.reverseOrder())
			.distinct() // Suppression des doublons
			.forEach(e -> System.out.print(e + " "));
	}

}
