package cours.chap09_String_Enum;

// Exemple d'utilisation de StringBuffer
// (Depuis Java, il existe une classe StringBuilder qui fait la même chose,
// mais dont les méthodes ne sont pas synchronisées (plus efficace si on n'utilise pas de thread) 

// P 277
public class TstStB {

	public static void main(String[] args) {
		String ch = "la java";
		
		StringBuffer chBuf = new StringBuffer(ch);
		System.out.println(chBuf);
		chBuf.setCharAt(3 , 'J');System.out.println(chBuf);
		chBuf.setCharAt(1 , 'e');System.out.println(chBuf);
		chBuf.append(" 2");System.out.println(chBuf);
		chBuf.insert(3, "langage ");System.out.println(chBuf);
	}

}
