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
import java.awt.Toolkit;

public class AcercaDe extends JDialog {

	/**
	 * Numero de versión para Serializable
	 */
	private static final long serialVersionUID = -932543057722423494L;
	
	/**
	 * Panel para contener los mensajes de info y error
	 */
	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			AcercaDe dialog = new AcercaDe();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public AcercaDe() {
		setResizable(false);
		setModal(true);
		setIconImage(Toolkit.getDefaultToolkit().getImage(AcercaDe.class.getResource("/concesinarioGUI/images/acercade.png")));
		setTitle("Concesionario 1.0");
		setBounds(100, 100, 376, 291);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblGestinDeAlmacen = new JLabel(
					"Gesti\u00F3n de Almacen de Coches\r\n\r\n");
			lblGestinDeAlmacen.setBounds(72, 33, 301, 33);
			contentPanel.add(lblGestinDeAlmacen);
		}
		{
			JLabel lblAuthorPedroJ = new JLabel("Author: Pedro J. Ramos");
			lblAuthorPedroJ.setBounds(92, 62, 301, 33);
			contentPanel.add(lblAuthorPedroJ);
		}
		{
			JLabel lblVersinMayo = new JLabel("Mayo.2015 - Versi\u00F3n 1.0");
			lblVersinMayo.setBounds(92, 94, 301, 33);
			contentPanel.add(lblVersinMayo);
		}
		{
			JLabel lblContactoPedrojonathanramosgmailcom = new JLabel(
					"Contacto: pedro.jonathan.ramos@gmail.com");
			lblContactoPedrojonathanramosgmailcom.setBounds(47, 127, 301, 33);
			contentPanel.add(lblContactoPedrojonathanramosgmailcom);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton Volver = new JButton("Volver");
				Volver.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						setVisible(false);
					}
				});
				Volver.setActionCommand("Cancel");
				buttonPane.add(Volver);
			}
		}
	}
}
