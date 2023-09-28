package cours.chap09_String_Enum;

// Fonctionnalités de String
// Utilisation de la fonctionnalité bloc de texte (Java 14) 
// Elle permet d'écrire du texte sur plusieurs lignes en conservant les retours à la ligne,
// elle permet aussi de conserver les indentations 

// P263


public class Applet {

	public static void main(String[] args) {
		// Début du bloc de texte 
		String applet = """ 		
		<HTML>
			<BODY>
				<APPLET
					CODE="App2Bout.class"
					WIDTH=250
					HEIGHT=100
					>
				</APPLET>
			</BODY>
		</HTML>
		"""	;		
		// Fin du bloc de texte
				
		System.out.println(applet);
	}

}
