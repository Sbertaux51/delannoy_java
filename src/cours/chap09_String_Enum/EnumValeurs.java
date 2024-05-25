package cours.chap09_String_Enum;

// Exemple d'itération sur les valeurs d'un type énuméré

// P281

public class EnumValeurs {

	public static void main(String[] args) {
		
		System.out.println("Liste des valeurs du type Jour");
		
		for (Jour j : Jour.values()) {
			System.out.println(j.toString());
		}
	}

	enum Jour {lundi, mardi, mercredi, jeudi, vendredi, samedi, dimanche}

}
