package cours.chap09_String_Enum;

// Exemple d'utilisation d'un type énuméré avec une instruction switch

// P279 

public class EnumSwitch {

	public static void main(String[] args) {
		Jour courant ;
		
		courant = Jour.vendredi;
		
		switch (courant) {
			case lundi : // pas la peine de préfixer par jour
			case mardi :
			case mercredi :
			case jeudi :
				System.out.println("On bosse");
				break;
			case vendredi :
				System.out.println("Bientot le week-end");
				break;
			case samedi :
			case dimanche :
				System.out.println("C'est le week-end");
		}
	}
	
	enum Jour {lundi, mardi, mercredi, jeudi, vendredi, samedi, dimanche}

}
