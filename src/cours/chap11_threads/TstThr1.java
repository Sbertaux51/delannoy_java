package cours.chap11_threads;

// Exemple de programme lancant 3 threads, objets d'une classe dérivée de Thread
// CAS 1 : Classe dérivée de Thread

// P309

public class TstThr1 {

	public static void main(String[] args) {

		// La création des objets thread peut se faire
		// depuis n'importe quel endroit du programme
		Ecrit e1 = new Ecrit("bonjour ", 10, 5);
		Ecrit e2 = new Ecrit("bonsoir ", 12, 10);
		Ecrit e3 = new Ecrit("\n", 5, 15);

		// Lacement des threads grace à start()
		e1.start();
		e2.start();
		e3.start();
	}

}

// Création d'une classe dérivée de Thread
class Ecrit extends Thread {

	public Ecrit(String texte, int nb, long attente) {
		this.texte = texte;
		this.nb = nb;
		this.attente = attente;
	}

	// Méthode lancée lorsque start() est invoqué
	public void run() {
		try {
			for (int i = 0; i < nb; i++) {
				System.out.print(texte);
				// mise en pause du thread permettnt de donner la main à un autre thread
				sleep(attente);
			}
		} catch (InterruptedException e) {
			// Imposé par sleep
		}
	}

	private String texte;
	private int nb;
	private long attente;
}
