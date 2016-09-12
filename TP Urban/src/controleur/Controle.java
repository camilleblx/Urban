package controleur;

import vue.EntreeJeu ;
import javax.swing.JFrame;

public class Controle {
	private EntreeJeu frmEntreeJeu ;
	public static void main(String[] args) {
		new Controle ();
	}

	//Le constructeur
	
	public Controle () {
		frmEntreeJeu = new EntreeJeu();
		frmEntreeJeu.setVisible(true);
	}
	
	public void evenementVue (JFrame uneFarme, Object info) {
		if (uneFarme instanceof EntreeJeu) {
			evenementEntreeJeu (info);
			
		}
		
	}
	
	private void evenementEntreeJeu(Object info) {	
	}
}
