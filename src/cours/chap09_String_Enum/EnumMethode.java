package cours.chap09_String_Enum;

// Exemple d'ajout d'une méthode à un type énuméré

// P283

public class EnumMethode {

	public static void main(String[] args) {
		System.out.println("Noms des valeurs du type jour");
		for (Jour j : Jour.values()) j.affiche();
	}

	enum Jour {
		lundi, mardi, mercredi, jeudi, vendredi, samedi, dimanche ;
		public void affiche() {
			System.out.println(this.toString());
		}
	}
	
}
