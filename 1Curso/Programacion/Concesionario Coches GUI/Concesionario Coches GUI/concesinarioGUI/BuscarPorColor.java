package concesinarioGUI;

import javax.swing.JDialog;

import concesionario.Coche;
import concesionario.Color;
import concesionario.Concesionario;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class BuscarPorColor extends Padre {

	/**
	 * Serial para serializable
	 */
	private static final long serialVersionUID = 8776317465853669836L;
	
	/**
	 * Indice del array de coches
	 */
	private int indice;
	
	/**
	 * Concesionario auxiliar por colores
	 */
	private Concesionario porColor = new Concesionario();	
	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		try {
			BuscarPorColor dialog = new BuscarPorColor();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public BuscarPorColor() {
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
		matricula.setEditable(false);
		comboBoxModelo.setEnabled(false);
		comboBoxMarca.setEnabled(false);
		matricula.setEnabled(false);
		anterior.setEnabled(false);
		siguiente.setEnabled(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(BuscarPorColor.class.getResource("/concesinarioGUI/images/buscar2.png")));
		okButton.setText("Buscar");
		SalirButton.setText("Volver");
		okButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (radioButtonRojo.isSelected()){
					porColor.setAlmacen(Fichero.almacen.getCochesColor(Color.ROJO));
				}else if (radioButtonAzul.isSelected()){
					porColor.setAlmacen(Fichero.almacen.getCochesColor(Color.AZUL));
				}else if (radioButtonPlata.isSelected())
					porColor.setAlmacen(Fichero.almacen.getCochesColor(Color.PLATA));
				mostrarCoche(porColor.get(indice));
				comprobarBotones();
				okButton.setEnabled(false);
			}
		});
		setTitle("Buscar por Color");
		setBounds(100, 100, 450, 300);
	}
	
	/**
	 * Muestra el siguiente coche del array auxiliar de coches por color
	 */
	private void mostrarSiguiente() {
		mostrarCoche(porColor.get(++indice));
		comprobarBotones();
	}

	/**
	 * Muestra el anterior coche del array auxiliar de coches por color
	 */
	private void mostrarAnterior() {
		mostrarCoche(porColor.get(--indice));
		comprobarBotones();
	}

	/**
	 * Muestra un coche del array auxiliar de coches por color
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
	 * Activa/Desactiva los botones siguiente anterior cuando se llega al final o al principio del array
	 */
	private void comprobarBotones() {
		if (porColor.get(indice + 1) == null)
			siguiente.setEnabled(false);
		else
			siguiente.setEnabled(true);

		if (porColor.get(indice - 1) == null)
			anterior.setEnabled(false);
		else
			anterior.setEnabled(true);
	}
}