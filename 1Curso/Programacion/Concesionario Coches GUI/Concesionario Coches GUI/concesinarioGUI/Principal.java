package concesinarioGUI;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JSeparator;
import javax.swing.JLabel;
import javax.swing.KeyStroke;

import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;
import java.awt.Toolkit;

public class Principal {

/**
 * JFrame para contener los mensajes de info y errores
 */
private JFrame jFrame = new JFrame();

/**
 * JFrame que contiene la ventana principal
 */
private JFrame principal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal window = new Principal();
					window.principal.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Principal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		principal = new JFrame();
		principal.setResizable(false);
		principal.setIconImage(Toolkit.getDefaultToolkit().getImage(Principal.class.getResource("/concesinarioGUI/images/car.png")));
		principal.setTitle("Concesionario IES Gran Capit\u00E1n");
		principal.setBounds(100, 100, 450, 300);
		principal.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		
		WindowListener exitListener = new WindowAdapter() {

            @Override
            public void windowClosing(WindowEvent e) {
                int confirm = JOptionPane.showOptionDialog(null, "¿Desea Guardar el trabajo actual antes de salir?", "Salir", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
                if (confirm == 0){
                	Fichero.guardarComo();
                }
                if (confirm == 1)
                   System.exit(0);
            }
        };
        principal.addWindowListener(exitListener);
        
		principal.getContentPane().setLayout(null);

		JLabel Portada = new JLabel("",createImageIcon("images/ico.gif", "IES Gran Capitán") , JLabel.CENTER);
		Portada.setBounds(10, 22, 251, 180);
		principal.getContentPane().add(Portada);

		JLabel lblConcesionario = new JLabel("Concesionario");
		lblConcesionario.setBounds(296, 73, 128, 14);
		principal.getContentPane().add(lblConcesionario);

		JLabel lblIesgranCapitn = new JLabel("IES \"Gran Capit\u00E1n\"");
		lblIesgranCapitn.setBounds(296, 135, 128, 14);
		principal.getContentPane().add(lblIesgranCapitn);

		JMenuBar menuBar = new JMenuBar();
		principal.setJMenuBar(menuBar);

		JMenu mnCoche = new JMenu("Ficheros");
		mnCoche.setMnemonic('F');
		menuBar.add(mnCoche);

		JMenuItem mntmNuevo = new JMenuItem("Nuevo");
		mntmNuevo.setIcon(new ImageIcon(Principal.class.getResource("/concesinarioGUI/images/nuevo.png")));
		mntmNuevo.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,InputEvent.CTRL_MASK | InputEvent.SHIFT_MASK));
		mntmNuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Fichero.almacen.getEsModificado()) {
					JOptionPane.showMessageDialog(jFrame, "No has guardado!!!","Fallido", JOptionPane.ERROR_MESSAGE);
					Fichero.guardarComo();
				}
				Fichero.nuevo();
				principal.setTitle(Fichero.getName());
			}
		});
		mnCoche.add(mntmNuevo);

		JMenuItem mntmAbrir = new JMenuItem("Abrir");
		mntmAbrir.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A,InputEvent.CTRL_MASK));
		mntmAbrir
				.setIcon(new ImageIcon(Principal.class.getResource("/concesinarioGUI/images/abrir.png")));
		mntmAbrir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Fichero.abrir();
				principal.setTitle(Fichero.getName());
			}
		});
		mnCoche.add(mntmAbrir);

		JMenuItem mntmGuardar = new JMenuItem("Guardar");
		mntmGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (Fichero.file.getName() == "Sin_titulo.obj") {
					JOptionPane.showMessageDialog(jFrame, "No has guardado!!!","Fallido", JOptionPane.ERROR_MESSAGE);
					Fichero.guardarComo();
				} else
				Fichero.guardar();
			}

		});
		mntmGuardar
				.setIcon(new ImageIcon(Principal.class.getResource("/concesinarioGUI/images/guardar.png")));
		mntmGuardar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,InputEvent.CTRL_MASK));
		mnCoche.add(mntmGuardar);

		JMenuItem mntmGuardarComo = new JMenuItem("Guardar como...");
		mntmGuardarComo.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,InputEvent.CTRL_MASK | InputEvent.SHIFT_MASK));
		mntmGuardarComo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Fichero.guardarComo();
				principal.setTitle(Fichero.getName());
			}
		});
		mnCoche.add(mntmGuardarComo);

		JSeparator separator = new JSeparator();
		mnCoche.add(separator);

		JMenuItem mntmNewMenuItem = new JMenuItem("Salir");
		mntmNewMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F4, InputEvent.ALT_MASK));
		mntmNewMenuItem.setIcon(new ImageIcon(Principal.class.getResource("/concesinarioGUI/images/salir2.png")));
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (Fichero.almacen.getEsModificado())
					JOptionPane.showMessageDialog(jFrame,"No has guardado!!!","Fallido", JOptionPane.ERROR_MESSAGE);
					Fichero.guardarComo();
				System.exit(0);
			}
		});
		mnCoche.add(mntmNewMenuItem);

		JMenu mnConcesionario = new JMenu("Coches");
		mnConcesionario.setMnemonic('C');
		menuBar.add(mnConcesionario);

		JMenuItem mntmAadir = new JMenuItem("A\u00F1adir Coche");
		mntmAadir.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F2, 0));
		mntmAadir
				.setIcon(new ImageIcon(Principal.class.getResource("/concesinarioGUI/images/annadir.png")));
		mntmAadir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Annadir annadir = new Annadir();
				annadir.setVisible(true);
			}
		});
		mnConcesionario.add(mntmAadir);

		JMenuItem mntmBorrar = new JMenuItem("Borrar Coche");
		mntmBorrar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F3, 0));
		mntmBorrar
				.setIcon(new ImageIcon(Principal.class.getResource("/concesinarioGUI/images/borrar.png")));
		mntmBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (Fichero.almacen.size() == 0)
					JOptionPane.showMessageDialog(jFrame,"El almacen esta vacio", "Error",JOptionPane.ERROR_MESSAGE);
				else {
					Borrar borrar = new Borrar();
					borrar.setVisible(true);
				}
			}
		});
		mnConcesionario.add(mntmBorrar);

		JMenu mnBuscar = new JMenu("Buscar por...");
		mnBuscar.setIcon(new ImageIcon(Principal.class.getResource("/concesinarioGUI/images/buscar2.png")));
		mnConcesionario.add(mnBuscar);

		JMenuItem mntmBuscar = new JMenuItem("Matricula");
		mnBuscar.add(mntmBuscar);

		JMenuItem mntmBuscarPorColor = new JMenuItem("Color");
		mnBuscar.add(mntmBuscarPorColor);
		mntmBuscarPorColor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (Fichero.almacen.size() == 0)
					JOptionPane.showMessageDialog(jFrame,"El almacen esta vacio", "Error",JOptionPane.ERROR_MESSAGE);
				else {
					BuscarPorColor mostrarPorColor = new BuscarPorColor();
					mostrarPorColor.setVisible(true);
				}
			}
		});
		mntmBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (Fichero.almacen.size() == 0)
					JOptionPane.showMessageDialog(jFrame,"El almacen esta vacio", "Error",JOptionPane.ERROR_MESSAGE);
				else {
					BuscarPorMatricula buscar = new BuscarPorMatricula();
					buscar.setVisible(true);
				}
			}
		});

		JSeparator separator_2 = new JSeparator();
		mnConcesionario.add(separator_2);

		JMenu mnNewMenu = new JMenu("Almac\u00E9n...");
		mnNewMenu
				.setIcon(new ImageIcon(Principal.class.getResource("/concesinarioGUI/images/almacen.png")));
		mnConcesionario.add(mnNewMenu);

		JMenuItem mntmMostrarConcesionario = new JMenuItem("Mostrar");
		mnNewMenu.add(mntmMostrarConcesionario);

		JMenuItem mntmContarConcesionario = new JMenuItem("Contar");
		mnNewMenu.add(mntmContarConcesionario);
		mntmContarConcesionario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (Fichero.almacen.size() == 0)
					JOptionPane.showMessageDialog(jFrame,"El almacen esta vacio", "Error",JOptionPane.ERROR_MESSAGE);
				else {
					JOptionPane.showMessageDialog(jFrame, "Hay "+ Fichero.almacen.size() + " coches en el almacen","Info", JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});
		mntmMostrarConcesionario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (Fichero.almacen.size() == 0)
					JOptionPane.showMessageDialog(jFrame,"El almacen esta vacio", "Error",JOptionPane.ERROR_MESSAGE);
				else {
					Mostrar mostrar = new Mostrar();
					mostrar.setVisible(true);
				}
			}
		});

		JMenu mnAyuda = new JMenu("Ayuda");
		mnAyuda.setMnemonic('A');
		menuBar.add(mnAyuda);

		JMenuItem mntmVerAyuda = new JMenuItem("Ver Ayuda");
		mntmVerAyuda.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F1, 0));
		mntmVerAyuda
				.setIcon(new ImageIcon(Principal.class.getResource("/concesinarioGUI/images/ayuda2.png")));
		mntmVerAyuda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ayuda ayuda = new Ayuda();
				ayuda.setVisible(true);
			}
		});
		mnAyuda.add(mntmVerAyuda);

		JSeparator separator_1 = new JSeparator();
		mnAyuda.add(separator_1);

		JMenuItem mntmAcercaDe = new JMenuItem("Acerca de...");
		mntmAcercaDe.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F12, 0));
		mntmAcercaDe
				.setIcon(new ImageIcon(Principal.class.getResource("/concesinarioGUI/images/acercade.png")));
		mntmAcercaDe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AcercaDe acercade = new AcercaDe();
				acercade.setVisible(true);
			}
		});
		mnAyuda.add(mntmAcercaDe);
	}

	protected ImageIcon createImageIcon(String path, String description) {
		java.net.URL imgURL = getClass().getResource(path);
		if (imgURL != null) {
			return new ImageIcon(imgURL, description);
		} else {
			System.err.println("Couldn't find file: " + path);
			return null;
		}
	}
}