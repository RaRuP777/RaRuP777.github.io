package concesinarioGUI;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

import java.awt.Color;

import javax.swing.JList;
import javax.swing.ButtonGroup;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

import concesionario.Marca;
import concesionario.Modelo;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.util.ArrayList;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class Padre extends JDialog {

	/**
	 * Serial para serializable
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Etiqueta para matr&iacute;cula
	 */
	protected JLabel lblMatrcula = new JLabel("Matr\u00EDcula");
	
	/**
	 * Campo de texto para escribir la matr&iacute;cula
	 */
	protected JTextField matricula;

	/**
	 * Bot&oacute;n OK
	 */
	protected JButton okButton = new JButton("OK");
	
	/**
	 * Bot&oacute;n Salir
	 */
	protected JButton SalirButton = new JButton("Salir");

	/**
	 * RadioButton para Color Azul
	 */
	protected JRadioButton radioButtonAzul = new JRadioButton("Azul");
	
	/**
	 * RadioButton para Color Plata
	 */
	protected JRadioButton radioButtonPlata = new JRadioButton("Plata");
	
	/**
	 * RadioButton para Color Rojo
	 */
	protected JRadioButton radioButtonRojo = new JRadioButton("Rojo");
	
	/**
	 * Agrupa los botones de Color
	 */
	private final ButtonGroup buttonGroup = new ButtonGroup();
	
	/**
	 * Combo Box de Marcas
	 */
	protected JComboBox<Marca> comboBoxMarca = new JComboBox<Marca>();
	
	/**
	 * Combo Box de Modelos
	 */
	protected JComboBox comboBoxModelo = new JComboBox(getModelo(comboBoxMarca));

	/**
	 * JPanel para mostrar los mensajes de info y error
	 */
	protected final JPanel contentPanel = new JPanel();
	protected JPanel buttonPane = new JPanel();
	protected JPanel Colores = new JPanel();
	protected JList list = new JList();
	
	/**
	 * Anterior para mostrar m&uacute;ltiples registros
	 */
	protected JButton anterior = new JButton("<");
	
	/**
	 * Siguiente para mostrar m&uacute;ltiples registros
	 */
	protected JButton siguiente = new JButton(">");
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Padre dialog = new Padre();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Padre() {
		setResizable(false);
		setModal(true);
		setBounds(100, 100, 417, 307);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			matricula = new JTextField();
			matricula.addFocusListener(new FocusAdapter() {
				@Override
				public void focusGained(FocusEvent e) {
					matricula.setForeground(java.awt.Color.BLACK);
				}
			});
			matricula.setBounds(178, 11, 86, 20);
			contentPanel.add(matricula);
			matricula.setColumns(10);
		}

		lblMatrcula.setBounds(109, 14, 86, 14);
		contentPanel.add(lblMatrcula);

		Colores.setBorder(new TitledBorder(UIManager
				.getBorder("TitledBorder.border"), "Colores",
				TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLACK));
		Colores.setBounds(36, 46, 143, 115);
		contentPanel.add(Colores);
		Colores.setLayout(null);

		radioButtonAzul.setBounds(6, 16, 109, 23);
		Colores.add(radioButtonAzul);
		buttonGroup.add(radioButtonAzul);
		radioButtonAzul.setForeground(Color.BLUE);
		{
			radioButtonPlata.setBounds(6, 42, 109, 23);
			Colores.add(radioButtonPlata);
			buttonGroup.add(radioButtonPlata);
			radioButtonPlata.setForeground(Color.DARK_GRAY);
		}
		{
			radioButtonRojo.setBounds(6, 68, 109, 23);
			Colores.add(radioButtonRojo);
			buttonGroup.add(radioButtonRojo);
			radioButtonRojo.setForeground(Color.RED);
		}

		list.setBounds(36, 48, 143, 113);
		contentPanel.add(list);

		comboBoxModelo.setModel(new DefaultComboBoxModel());
		comboBoxModelo.setBounds(208, 127, 86, 34);
		contentPanel.add(comboBoxModelo);
		comboBoxMarca.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				comboBoxModelo.setModel(new DefaultComboBoxModel(
						getModelo(comboBoxMarca)));
			}
		});

		comboBoxMarca.setModel(new DefaultComboBoxModel(Marca.values()));
		comboBoxMarca.setBounds(208, 48, 86, 34);
		contentPanel.add(comboBoxMarca);

		//anterior.setBounds(36, 190, 58, 23);
		//contentPanel.add(anterior);

		//siguiente.setBounds(109, 190, 58, 23);
		//contentPanel.add(siguiente);
		{
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			
					buttonPane.add(anterior);
			buttonPane.add(siguiente);
			{
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				SalirButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						setVisible(false);
					}
				});
				SalirButton.setActionCommand("Cancel");
				buttonPane.add(SalirButton);
			}
		}

	}
	
	/**
	 * Metodo que sincroniza el Comobo Box de Modelo
	 * 
	 * @param comboBoxMarca Marcas de los Coches
	 * @return Arrays de M&oacute;delos por marcas
	 */
	private Object[] getModelo(JComboBox<Marca> comboBoxMarca) {
		Marca marca = (Marca) comboBoxMarca.getSelectedItem();
		ArrayList<Modelo> modelos = new ArrayList<Modelo>();
		for (Modelo m : Modelo.values()) {
			if (m.getMarca() == marca) {
				modelos.add(m);
			}
		}
		return modelos.toArray();
	}
}