 package tp;

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import tp.Pelicula;

import javax.swing.JComboBox;

public class PanelAgregar extends JPanel {

	/**
	 * Create the panel.
	 */
	public PanelAgregar() {
		dibujarControles();
	}

	private static final long serialVersionUID = 1L;
	private static int id=1;
	private JTextField TxtNombre;
	private JComboBox<Categoria> CBGenero;
	private JButton Button;
	private JLabel LVID;
	private DefaultListModel<Pelicula> Lista_Peliculas;
		
	 

	
	public void dibujarControles() {
		Font fuenteComun = new Font("Tahoma", Font.PLAIN, 22);	
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{53, 199, 179, 32, 0};
		gridBagLayout.rowHeights = new int[]{0, 49, 48, 49, 37, 30, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, 1.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblNombreProducto = new JLabel("ID");
		lblNombreProducto.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_lblNombreProducto = new GridBagConstraints();
		gbc_lblNombreProducto.anchor = GridBagConstraints.WEST;
		gbc_lblNombreProducto.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombreProducto.gridx = 1;
		gbc_lblNombreProducto.gridy = 1;
		add(lblNombreProducto, gbc_lblNombreProducto);
		
		LVID = new JLabel(Integer.toString(id));
		GridBagConstraints gbc_LVID = new GridBagConstraints();
		gbc_LVID.anchor = GridBagConstraints.WEST;
		gbc_LVID.insets = new Insets(0, 0, 5, 5);
		gbc_LVID.gridx = 2;
		gbc_LVID.gridy = 1;
		add(LVID, gbc_LVID);
		
		JLabel lblCap = new JLabel("Nombre");
		lblCap.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_lblCap = new GridBagConstraints();
		gbc_lblCap.anchor = GridBagConstraints.WEST;
		gbc_lblCap.insets = new Insets(0, 0, 5, 5);
		gbc_lblCap.gridx = 1;
		gbc_lblCap.gridy = 2;
		add(lblCap, gbc_lblCap);
		
		TxtNombre = new JTextField();
		TxtNombre.setFont(fuenteComun);
		GridBagConstraints gbc_txtCapitulos = new GridBagConstraints();
		gbc_txtCapitulos.insets = new Insets(0, 0, 5, 5);
		gbc_txtCapitulos.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtCapitulos.gridx = 2;
		gbc_txtCapitulos.gridy = 2;
		add(TxtNombre, gbc_txtCapitulos);
		TxtNombre.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Genero");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 3;
		add(lblNewLabel, gbc_lblNewLabel);
		
		CBGenero = new JComboBox<Categoria>();
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridx = 2;
		gbc_comboBox.gridy = 3;
		add(CBGenero, gbc_comboBox);
		CBGenero.addItem(new Categoria("Seleccione un genero"));
		CBGenero.addItem(new Categoria("Terror"));
		CBGenero.addItem(new Categoria("Accion"));
		CBGenero.addItem(new Categoria("Suspenso"));
		CBGenero.addItem(new Categoria("Romantica"));
		
		
		Button = new JButton("Aceptar");
		Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(CBGenero.getSelectedIndex()==0) return;
				if(!TxtNombre.getText().isEmpty()) {
					Categoria selectedValue = (Categoria)CBGenero.getSelectedItem();
					Pelicula peli = new Pelicula(id++,selectedValue,TxtNombre.getText().toString());
					Lista_Peliculas.addElement(peli);
					TxtNombre.setText("");
					LVID.setText(Integer.toString(id));
					}
			}
		});
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton.gridx = 1;
		gbc_btnNewButton.gridy = 4;
		gbc_btnNewButton.fill = GridBagConstraints.HORIZONTAL; 
		add(Button, gbc_btnNewButton);
	}
	
	public void setDefaultListModel(DefaultListModel<Pelicula> peli) {
		this.Lista_Peliculas = peli;
	}
}
