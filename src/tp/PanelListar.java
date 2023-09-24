package tp;

import javax.swing.JPanel;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;

public class PanelListar extends JPanel {

	private JList<Pelicula> lista;
	private DefaultListModel<Pelicula> dlmPelicula;
	public PanelListar() {
		setLayout(null);
		JLabel lblListar = new JLabel("Listar");
		lblListar.setBounds(36, 22, 69, 20);
		add(lblListar);
		
		lista = new JList<Pelicula>();
		lista.setBounds(35, 55, 338, 175);
		add(lista);
		
	}
	
	public void setDefaultListModel(DefaultListModel<Pelicula> dlmPelicula) {
		this.dlmPelicula = dlmPelicula;
		lista.setModel(dlmPelicula);
	}
}
