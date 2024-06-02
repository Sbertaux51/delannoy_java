package cours.chap09_String_Enum;

// Exemple d'une classe d'énumération dotée d'un champ, d'une méthode et d'un constructeur

// P284

public class EnumMethodes {

	public static void main(String[] args) {
		System.out.println("Noms des valeurs du type jour et leurs abbréviations");
		for (Jour j : Jour.values()) 
			System.out.println(j + " : " + j.abreviation() );
	}

	enum Jour {
		lundi("lu"), 
		mardi("ma"), 
		mercredi("me"), 
		jeudi("je"), 
		vendredi("ve"), 
		samedi("sa"), 
		dimanche("di") ;
		
		private Jour (String a) {	// Constructeur
			abrege = a;
		}
		public String abreviation() {	// Méthode pour connaitre l'abréviation
			return abrege;
		}
		private String abrege;
		
	}
	
}
