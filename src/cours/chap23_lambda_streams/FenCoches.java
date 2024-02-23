package cours.chap23_lambda_streams;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

// Exemple de programmation evenementielle où une interface ne possède qu'une seule méthode abstraite
// faisant office d'interface fonctionnelle
// Exemple : ActionListener, ItemListener, ListSelectionListener

// P690

public class FenCoches extends JFrame {

	private static final long serialVersionUID = 1L;
	
	public FenCoches() {
		
		setTitle("Exemple de case à cocher");
		setSize(400, 100);
		Container contenu = getContentPane();
		contenu.setLayout(new FlowLayout());

		coche1 = new JCheckBox("case 1") ;
		contenu.add(coche1);
		coche1.addActionListener(ee -> System.out.println("Action case 1"));

		coche2 = new JCheckBox("case 2") ;
		contenu.add(coche2);
		coche2.addActionListener(ee -> System.out.println("Action case 2"));

		etat = new JButton("Etat");
		contenu.add(etat);
		etat.addActionListener(ee -> System.out.println("Etat CASES " 
				+ coche1.isSelected() + " " 
				+ coche2.isSelected()));
	}

	private JCheckBox coche1, coche2;
	private JButton etat;
}

class Cases1 {
	public static void main(String arg[]) {
		FenCoches fen = new FenCoches();
		fen.setVisible(true);
	}
}