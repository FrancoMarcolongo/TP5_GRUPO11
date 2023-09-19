package tp;

import javax.swing.JPanel;
import javax.swing.JLabel;

public class PanelListar extends JPanel {

	/**
	 * Create the panel.
	 */
	public PanelListar() {
		setLayout(null);
		
		JLabel lblListar = new JLabel("Listar");
		lblListar.setBounds(174, 56, 69, 20);
		add(lblListar);
	}
}
