package cours.chap23_lambda_streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

// Les nouvelles méthodes Java 8 de l'interface Comparator

// P692

public class SourceStream {
	public static void main(String[] args) {
		Integer tabObj [] = {3 , 8 , 2 , -4 , 0 , 12 , 8 , -5 , 3 , -4 , 15};
		List<Integer> liste = Arrays.asList(tabObj);

		System.out.println("-- Filtrage des >0 avec une collection") ;
		liste.stream().filter(ee -> ee > 0).forEach(ee -> System.out.print(ee + " ")) ;

		System.out.println("\n-- Filtrage des >0 avec une collection en parallèle") ;
		liste.parallelStream().filter(ee -> ee > 0).forEach(ee -> System.out.print(ee + " ")) ;

		System.out.println("\n-- Idem (en parallelle) avec forEachOrdered") ;
		liste.parallelStream().filter(ee -> ee > 0).forEachOrdered(ee -> System.out.print(ee + " ")) ;

		System.out.println("\n-- Filtrage nombres pairs avec une liste de valeurs") ;
		Stream.of(1 , 8 , -3 , 5 , -22 , 3 , 7 , 12 , 5)
			.filter(ee -> 2*(ee/2)==ee)
			.forEachOrdered(ee -> System.out.print(ee + " ")) ;		

		System.out.println("\n-- Filtrage des >0 avec un tableau") ;
		Stream.of(tabObj)
			.filter(ee -> ee >0)
			.forEach(ee -> System.out.print(ee + " ")) ;

		System.out.println("\n-- Avec generation de valeurs aleatoires entieres entre 0 et 9") ;
		Stream.generate(Math::random)
			.limit(8)
			.map(ee -> (int) (ee*10))
			.forEach(ee -> System.out.print(ee + " ")) ;

		System.out.println("\n-- Avec methode iterative") ;
		Stream.iterate(15, (ee -> 2 * ee))
			.limit(10)
			.forEach(ee -> System.out.print(ee + " ")) ;
			;
	}
}
