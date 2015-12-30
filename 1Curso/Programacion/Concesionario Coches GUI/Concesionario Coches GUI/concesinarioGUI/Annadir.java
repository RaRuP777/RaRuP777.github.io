package concesinarioGUI;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

import concesionario.CocheYaExisteException;
import concesionario.Color;
import concesionario.ColorNoValidoException;
import concesionario.MatriculaNoValidaException;
import concesionario.Modelo;
import concesionario.ModeloNoValidoException;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import java.awt.event.FocusAdapter;

public class Annadir extends Padre {

	/**
	 * Numero de serie para serializable
	 */
	private static final long serialVersionUID = 5170919629068147689L;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Annadir dialog = new Annadir();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Annadir() {
		super();
		matricula.addFocusListener(new FocusAdapter() {
		});
		anterior.setVisible(false);
		siguiente.setVisible(false);
		SalirButton.setText("Volver");
		okButton.setText("A\u00F1adir");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Annadir.class.getResource("/concesinarioGUI/images/annadir.png")));
		okButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Fichero.almacen.annadir(matricula.getText(), getColor(),(Modelo) comboBoxModelo.getSelectedItem());
					JOptionPane.showMessageDialog(contentPanel,"Coche añadido", "Info",JOptionPane.INFORMATION_MESSAGE);
				} catch (MatriculaNoValidaException | ColorNoValidoException
						| ModeloNoValidoException | CocheYaExisteException e1) {
					matricula.setForeground(java.awt.Color.RED);
					JOptionPane.showMessageDialog(contentPanel,e1.getMessage(), "Fallido",JOptionPane.ERROR_MESSAGE);
				}

			}
		});
		setTitle("A\u00F1adir Coche");
		setBounds(100, 100, 450, 300);

	}

	/**
	 * Devuelve el color seleccionado en los radio button
	 * @return el Color seleccionado
	 */
	private Color getColor() {
		if (radioButtonPlata.isSelected())
			return concesionario.Color.PLATA;
		else if (radioButtonRojo.isSelected())
			return concesionario.Color.ROJO;
		else if (radioButtonAzul.isSelected())
			return concesionario.Color.AZUL;
		else
			return null;
	}
}