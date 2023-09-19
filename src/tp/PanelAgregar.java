package tp;

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;

public class PanelAgregar extends JPanel {

	/**
	 * Create the panel.
	 */
	public PanelAgregar() {
		dibujarControles();
	}

	private static final long serialVersionUID = 1L;
	private JTextField txtCapitulos;
	private JLabel lblNewLabel;
	private JComboBox comboBox;
	private JButton btnNewButton;
	private JLabel label;
	//private DefaultListModel<Libro> listModel;
		
	 

	
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
		
		label = new JLabel("1");
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.anchor = GridBagConstraints.WEST;
		gbc_label.insets = new Insets(0, 0, 5, 5);
		gbc_label.gridx = 2;
		gbc_label.gridy = 1;
		add(label, gbc_label);
		
		JLabel lblCap = new JLabel("Nombre");
		lblCap.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_lblCap = new GridBagConstraints();
		gbc_lblCap.anchor = GridBagConstraints.WEST;
		gbc_lblCap.insets = new Insets(0, 0, 5, 5);
		gbc_lblCap.gridx = 1;
		gbc_lblCap.gridy = 2;
		add(lblCap, gbc_lblCap);
		
		txtCapitulos = new JTextField();
		txtCapitulos.setFont(fuenteComun);
		GridBagConstraints gbc_txtCapitulos = new GridBagConstraints();
		gbc_txtCapitulos.insets = new Insets(0, 0, 5, 5);
		gbc_txtCapitulos.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtCapitulos.gridx = 2;
		gbc_txtCapitulos.gridy = 2;
		add(txtCapitulos, gbc_txtCapitulos);
		txtCapitulos.setColumns(10);
		
		lblNewLabel = new JLabel("Genero");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 3;
		add(lblNewLabel, gbc_lblNewLabel);
		
		comboBox = new JComboBox();
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridx = 2;
		gbc_comboBox.gridy = 3;
		add(comboBox, gbc_comboBox);
		
		btnNewButton = new JButton("Aceptar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton.gridx = 1;
		gbc_btnNewButton.gridy = 4;
		gbc_btnNewButton.fill = GridBagConstraints.HORIZONTAL; 
		add(btnNewButton, gbc_btnNewButton);
	}
}
