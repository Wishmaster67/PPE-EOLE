package applicationEole;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.CardLayout;

public class FenetreApplication extends JFrame {
	private static final long serialVersionUID = 8890778608297071873L;
	
	
	
	public FenetreApplication() {
		setBounds(0, 0, 1000, 700);
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new CardLayout(0, 0));
		revalidate();
	}

	
	

	public static void main(String[] args) {
		
		new FenetreApplication();
	}

}
