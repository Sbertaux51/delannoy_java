package cours.chap23_lambda_streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/* Différentes façons de créer un stream */

// P698
public class SourceStream {

	public static void main(String[] args) {
		
		// Creation à partir d'une collection
		System.out.println("-- Filtrage des >0 avec une collection : ");
		Integer tabObj[] = { 3, 8, 2, -4, 0, 12, 8, -5, 3, -4, 15}; // Creation d'un tableau de valeurs
		List<Integer> liste = Arrays.asList(tabObj);
		liste.stream().filter(ee -> ee > 0).forEach(ee -> System.out.print(ee + " "));

		// Filtrage avec collection en parallèle
		System.out.println("\n-- Filtrage des >0 avec une collection en parallele : ");
		liste.parallelStream().filter(ee -> ee > 0).forEach(ee -> System.out.print(ee + " "));

		// Filtrage avec collection en parallèle
		System.out.println("\n-- Idem (en parallele) avec forEachOrdered : ");
		liste.parallelStream().filter(ee -> ee > 0).forEachOrdered(ee -> System.out.print(ee + " "));
		
		// Filtrage avec forEach
		System.out.println("\n-- Filtrage des pairs avec une liste de valeurs : ");
		Stream.of(1, 8 ,-3, 5 , -11, 3, 7, 12, 5).filter(ee -> 2*(ee/2)==ee).forEach(ee -> System.out.print(ee + " "));
		
		// Filtrage à partir d'un tableau
		System.out.println("\n-- Filtrage des >0 avec un tableau : ");
		Stream.of(tabObj).filter(ee -> ee>0).forEach(ee -> System.out.print(ee + " "));
		
		// Filtrage avec generation de valeurs aleatoires
		System.out.println("\n-- Filtrage avec generation de valeurs aleatoires entieres entre 0 et 9 : ");
		Stream.generate(Math::random).limit(8).map(ee -> (int)(ee*10)).forEach(ee -> System.out.print(ee + " "));
		
		// Filtrage avec méthode itérative
		System.out.println("\n-- Filtrage avec méthode iterative : ");
		Stream.iterate(15, (ee -> 2 * ee)).limit(10).forEach(ee -> System.out.print(ee + " "));
	}

}
