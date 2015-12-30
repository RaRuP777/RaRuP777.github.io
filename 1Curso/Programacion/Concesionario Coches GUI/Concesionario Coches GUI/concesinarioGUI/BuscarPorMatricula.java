package concesinarioGUI;

import javax.swing.JDialog;
import javax.swing.JOptionPane;
import concesionario.Coche;
import concesionario.CocheNoExisteException;
import concesionario.MatriculaNoValidaException;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class BuscarPorMatricula extends Padre {

	/**
	 * Serial para serializable
	 */
	private static final long serialVersionUID = 6749905962322030692L;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			BuscarPorMatricula dialog = new BuscarPorMatricula();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public BuscarPorMatricula() {
		super();
		comboBoxModelo.setEnabled(false);
		comboBoxMarca.setEnabled(false);
		radioButtonAzul.setEnabled(false);
		radioButtonRojo.setEnabled(false);
		radioButtonPlata.setEnabled(false);
		anterior.setVisible(false);
		siguiente.setVisible(false);
		okButton.setText("Buscar");
		setIconImage(Toolkit.getDefaultToolkit().getImage(BuscarPorMatricula.class.getResource("/concesinarioGUI/images/buscar2.png")));
		okButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {
					Coche coche = Fichero.almacen.get(matricula.getText());
					matricula.setText(coche.getMatricula());
					comboBoxMarca.setSelectedItem(coche.getModelo().getMarca());
					comboBoxModelo.setSelectedItem(coche.getModelo());
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
				} catch (CocheNoExisteException | MatriculaNoValidaException e1) {
					matricula.setForeground(java.awt.Color.RED);
					JOptionPane.showMessageDialog(contentPanel,e1.getMessage(), "Fallido",JOptionPane.ERROR_MESSAGE);
				}

			}
		});
		setTitle("Buscar por Matricula");
		setBounds(100, 100, 450, 300);
	}
}