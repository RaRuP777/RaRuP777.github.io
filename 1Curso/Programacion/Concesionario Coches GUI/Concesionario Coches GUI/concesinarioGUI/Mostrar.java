package concesinarioGUI;

import javax.swing.JDialog;

import concesionario.Coche;

import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Mostrar extends Padre {

	/**
	 * Serial para serializable
	 */
	private static final long serialVersionUID = 8485212631149748892L;
	
	/**
	 * Indice del arraylist de coches
	 */
	private int indice;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Mostrar dialog = new Mostrar();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Mostrar() {
		mostrarCoche(Fichero.almacen.get(indice));
		comprobarBotones();
		anterior.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mostrarAnterior();
			}
		});
		siguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				mostrarSiguiente();
			}
		});
		SalirButton.setText("Volver");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Mostrar.class.getResource("/concesinarioGUI/images/almacen.png")));
		setTitle("Mostrar Concesionario");
		setBounds(100, 100, 450, 300);
		comboBoxModelo.setEnabled(false);
		comboBoxMarca.setEnabled(false);
		radioButtonAzul.setEnabled(false);
		radioButtonRojo.setEnabled(false);
		radioButtonPlata.setEnabled(false);
		matricula.setEnabled(false);
		okButton.setVisible(false);
	}

	/**
	 * Muestra el siguiente coche del concesionario
	 */
	private void mostrarSiguiente() {
		mostrarCoche(Fichero.almacen.get(++indice));
		comprobarBotones();
	}

	/**
	 * Muestra el anterior coche del concesionario
	 */
	private void mostrarAnterior() {
		mostrarCoche(Fichero.almacen.get(--indice));
		comprobarBotones();
	}

	/**
	 * Muestra un coche del concesionario
	 * 
	 * @param coche Coche a mostrar
	 */
	private void mostrarCoche(Coche coche) {
		matricula.setText(coche.getMatricula());
		switch (coche.getColor()) {
		case PLATA:
			radioButtonPlata.setSelected(true);
			break;
		case ROJO:
			radioButtonRojo.setSelected(true);
			break;
		case AZUL:
			radioButtonAzul.setSelected(true);
		}
		comboBoxMarca.addItem(coche.getModelo().getMarca());
		comboBoxMarca.setSelectedItem(coche.getModelo().getMarca());
		comboBoxModelo.setSelectedItem(coche.getModelo());
	}

	/**
	 * Habilita/deshabilita los botones siguiente y anterior cuando se llega al final o principio del arraylist
	 */
	private void comprobarBotones() {
		if (Fichero.almacen.get(indice + 1) == null)
			siguiente.setEnabled(false);
		else
			siguiente.setEnabled(true);

		if (Fichero.almacen.get(indice - 1) == null)
			anterior.setEnabled(false);
		else
			anterior.setEnabled(true);
	}
}