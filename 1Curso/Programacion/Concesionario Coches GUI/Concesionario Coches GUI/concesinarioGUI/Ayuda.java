package concesinarioGUI;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;

public class Ayuda extends JDialog {
	
	/**
	 * Serial para serializable 
	 */
	private static final long serialVersionUID = 8436476518973338453L;
	
	/**
	 * Panel para contener los mensaje de info y error
	 */
	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Ayuda dialog = new Ayuda();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Ayuda() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Ayuda.class.getResource("/concesinarioGUI/images/ayuda2.png")));
		setTitle("Ayuda...");
		setBounds(100, 100, 450, 520);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(Color.LIGHT_GRAY);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblAadir = new JLabel("A\u00F1adir Coche");
		lblAadir.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblAadir.setForeground(Color.RED);
		lblAadir.setBounds(10, 11, 109, 14);
		contentPanel.add(lblAadir);
		
		JTextArea txtrParaAadirUn = new JTextArea();
		txtrParaAadirUn.setBackground(Color.LIGHT_GRAY);
		txtrParaAadirUn.setText("Para a\u00F1adir un coche debe tener una matr\u00EDcula de 4 \r\nd\u00EDgitos y 3 letras sin Q ni vocales");
		txtrParaAadirUn.setBounds(10, 36, 414, 39);
		contentPanel.add(txtrParaAadirUn);
		
		JLabel lblEliminar = new JLabel("Borrar Coche");
		lblEliminar.setForeground(Color.RED);
		lblEliminar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblEliminar.setBounds(10, 86, 109, 14);
		contentPanel.add(lblEliminar);
		
		JTextArea txtrParaEliminarUn = new JTextArea();
		txtrParaEliminarUn.setBackground(Color.LIGHT_GRAY);
		txtrParaEliminarUn.setText("Para eliminar un coche hay que especificar la \r\nmatr\u00EDcula del coche");
		txtrParaEliminarUn.setBounds(10, 111, 414, 39);
		contentPanel.add(txtrParaEliminarUn);
		
		JLabel lblBuscarCochePor = new JLabel("Buscar Coche por Matr\u00EDcula");
		lblBuscarCochePor.setForeground(Color.RED);
		lblBuscarCochePor.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblBuscarCochePor.setBounds(10, 161, 313, 20);
		contentPanel.add(lblBuscarCochePor);
		
		JTextArea txtrParaBuscarUn = new JTextArea();
		txtrParaBuscarUn.setBackground(Color.LIGHT_GRAY);
		txtrParaBuscarUn.setText("Para buscar un coche debes proporcionar su \r\nmatr\u00EDcula");
		txtrParaBuscarUn.setBounds(10, 192, 414, 49);
		contentPanel.add(txtrParaBuscarUn);
		
		JLabel lblBuscarCochePor_1 = new JLabel("Buscar Coche por Color");
		lblBuscarCochePor_1.setForeground(Color.RED);
		lblBuscarCochePor_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblBuscarCochePor_1.setBounds(10, 236, 313, 33);
		contentPanel.add(lblBuscarCochePor_1);
		
		JTextArea txtrAlProporcionarUn = new JTextArea();
		txtrAlProporcionarUn.setText("Al proporcionar un color se muestran todos los coches de ese color");
		txtrAlProporcionarUn.setBackground(Color.LIGHT_GRAY);
		txtrAlProporcionarUn.setBounds(10, 265, 414, 22);
		contentPanel.add(txtrAlProporcionarUn);
		
		JLabel lblMostrarConcesionario = new JLabel("Mostrar Concesionario");
		lblMostrarConcesionario.setForeground(Color.RED);
		lblMostrarConcesionario.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblMostrarConcesionario.setBounds(10, 298, 313, 33);
		contentPanel.add(lblMostrarConcesionario);
		
		JTextArea txtrMuestraTodosLos = new JTextArea();
		txtrMuestraTodosLos.setBackground(Color.LIGHT_GRAY);
		txtrMuestraTodosLos.setText("Muestra todos los coches contenidos en el concesionario");
		txtrMuestraTodosLos.setBounds(10, 327, 414, 22);
		contentPanel.add(txtrMuestraTodosLos);
		
		JLabel lblContarConcesionario = new JLabel("Contar Concesionario");
		lblContarConcesionario.setForeground(Color.RED);
		lblContarConcesionario.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblContarConcesionario.setBounds(10, 360, 313, 33);
		contentPanel.add(lblContarConcesionario);
		
		JTextArea txtrMuestraElTotal = new JTextArea();
		txtrMuestraElTotal.setBackground(Color.LIGHT_GRAY);
		txtrMuestraElTotal.setText("Muestra el total de coches almacenados en el concesionario");
		txtrMuestraElTotal.setBounds(10, 393, 414, 22);
		contentPanel.add(txtrMuestraElTotal);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBackground(Color.LIGHT_GRAY);
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("Volver");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						setVisible(false);
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
		}
	}
}
