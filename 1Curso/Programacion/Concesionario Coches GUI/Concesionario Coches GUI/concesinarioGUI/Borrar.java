package concesinarioGUI;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

import concesionario.Coche;
import concesionario.CocheNoExisteException;
import concesionario.MatriculaNoValidaException;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import java.awt.event.FocusAdapter;

public class Borrar extends Padre {

	/**
	 * Serial para serializable
	 */
	private static final long serialVersionUID = 7730701877207153150L;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Borrar dialog = new Borrar();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Borrar() {
		super();
		okButton.setText("Borrar");
		matricula.addFocusListener(new FocusAdapter() {
		});
		anterior.setVisible(false);
		siguiente.setVisible(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(Borrar.class.getResource("/concesinarioGUI/images/borrar.png")));
		okButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Coche coche;
				try {
					coche = Fichero.almacen.get(matricula.getText());
				} catch (CocheNoExisteException | MatriculaNoValidaException e1) {
					coche = null;
					matricula.setForeground(java.awt.Color.RED);
					JOptionPane.showMessageDialog(contentPanel,e1.getMessage(), "Fallido", JOptionPane.ERROR_MESSAGE);	
				}
				if (coche !=null){
					try {
						Fichero.almacen.eliminar(matricula.getText());
						JOptionPane.showMessageDialog(contentPanel,"Coche borrado", "Info",JOptionPane.INFORMATION_MESSAGE);
					} catch (MatriculaNoValidaException | CocheNoExisteException e1) {
					}
				}
			}		
		});
		setTitle("Borrar Coche");
		setBounds(100, 100, 450, 300);
		comboBoxModelo.setEnabled(false);
		comboBoxMarca.setEnabled(false);
		radioButtonAzul.setEnabled(false);
		radioButtonRojo.setEnabled(false);
		radioButtonPlata.setEnabled(false);
	}
}