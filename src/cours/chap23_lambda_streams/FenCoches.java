package cours.chap23_lambda_streams;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
// Exemple d'expression lambda pour un ActionListener :
// Cette interface ne comporte qu'une seule méthode, elle peut donc être considérée
// comme interface fonctionnelle

// Ici on utilsie un écouteru par objet au lieu d'un écouteur unique
// Cette démarche permet d'éviter de recourir à GetSource

//P690
public class FenCoches extends JFrame //implements ActionListener plus nécessaire 
{

	private static final long serialVersionUID = -8142024856927613339L;
	
	public FenCoches() {
		setTitle("Exemple de case a cocher");
		setSize(400, 100);
		Container contenu = getContentPane();
		contenu.setLayout(new FlowLayout());

		coche1 = new JCheckBox("case 1");
		contenu.add(coche1);
		coche1.addActionListener(ee -> System.out.println("action case 1") );
		
		coche2 = new JCheckBox("case 2");
		contenu.add(coche2);
		coche2.addActionListener(ee -> System.out.println("action case 2") );
		
		Etat = new JButton("Etat");
		contenu.add(Etat);
		Etat.addActionListener(ee -> System.out.println("Etat CASES : " 
				+ coche1.isSelected() + " " + coche2.isSelected() ) );
	}
	
	/*@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}*/
/*
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}*/

	private JCheckBox coche1, coche2;
	private JButton Etat;
}

class Cases1 {
	public static void main(String args[]) {
		FenCoches fen = new FenCoches();
		fen.setVisible(true);
	}
}
