package Vue;

import java.awt.Color;

// la classe qui contient la publicit� 

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CalculatricePub extends JFrame{
	
	private JLabel affichagePub = new JLabel("PUBLICITE");
	private JPanel fenetrePub = new JPanel();
	
	public CalculatricePub() {
		
		// param�trage de l'ihm
		
		this.setTitle("PUBLICITE");
		this.setExtendedState(JFrame.MAXIMIZED_BOTH); // plein �cran par d�faut
		fenetrePub.setBackground(Color.yellow);
		this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		this.setVisible(true);
		
		// ajout des objets graphiques au jpanel
		
		fenetrePub.add(affichagePub);
		this.add(fenetrePub);	
		
	}

}