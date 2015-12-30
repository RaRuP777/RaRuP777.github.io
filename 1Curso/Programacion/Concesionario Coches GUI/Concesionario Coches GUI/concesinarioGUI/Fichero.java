package concesinarioGUI;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import concesionario.Concesionario;

public class Fichero {

	/**
	 * Arraylist que almacena los objetos del tipo Coche
	 */
	public static Concesionario almacen = new Concesionario();

	/**
	 * File para almacenar el concesionario
	 */
	public static File file = new File("Sin_titulo.obj");

	/**
	 * Ventana para elegir un fichero del equipo
	 */
	private static JFileChooser fileChooser = new JFileChooser();

	/**
	 * Frame para conener los mensajes de info y errores
	 */
	private static JFrame jFrame = new JFrame();

	/**
	 * Filtro para limitar los objetos a abrir o guardar a la extensi&oacute;n
	 * .obj
	 */
	private final static Filtro filtro = new Filtro(".obj", "Objeto");

	/**
	 * Método para crear un nuevo File
	 * 
	 * @param nombre
	 */
	public static void setFile(String nombre) {
		file = new File(nombre + ".obj");
	}

	/**
	 * Crea un nuevo concesionario y un nuevo file
	 */
	public static void nuevo() {
		file = new File("Sin_titulo.obj");
		almacen = new Concesionario();
	}

	/**
	 * Devuelve el nombre del fichero cargado actualmente
	 */
	public static String getName() {
		return file.getName();
	}

	/**
	 * Abre un fichero ya existente y carga sus datos del concesionario
	 */
	public static void abrir() {
		fileChooser.setAcceptAllFileFilterUsed(false);
		fileChooser.addChoosableFileFilter(filtro);
		if (fileChooser.showOpenDialog(jFrame) == JFileChooser.APPROVE_OPTION) {
			file = fileChooser.getSelectedFile();
			try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(file))) {
				almacen = (Concesionario) in.readObject();
				almacen.setEsModificado(false);
			} catch (ClassNotFoundException | IOException e) {
				JOptionPane.showMessageDialog(jFrame, e.getMessage(),"Fallido", JOptionPane.ERROR_MESSAGE);
			}
		}
	}

	/**
	 * Guarda el concesionario actual en el fichero abierto
	 */
	public static void guardar() {
			try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file))) {
				out.writeObject(Fichero.almacen);
				almacen.setEsModificado(false);
				JOptionPane.showMessageDialog(jFrame, "Archivo Guardado","Info", JOptionPane.INFORMATION_MESSAGE);
			} catch (IOException e) {
				JOptionPane.showMessageDialog(jFrame, e.getMessage(),"Fallido", JOptionPane.ERROR_MESSAGE);
			}
	}

	/**
	 * Guarda el concesionario actual en el fichero abierto con un nombre nuevo
	 */
	public static void guardarComo() {
		fileChooser.setAcceptAllFileFilterUsed(false);
		fileChooser.addChoosableFileFilter(filtro);
		if (fileChooser.showSaveDialog(jFrame) == JFileChooser.APPROVE_OPTION) {
			file = fileChooser.getSelectedFile();
			try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(Fichero.file))) {
				out.writeObject(Fichero.almacen);
				almacen.setEsModificado(false);
				JOptionPane.showMessageDialog(jFrame, "Archivo Guardado","Info", JOptionPane.INFORMATION_MESSAGE);
			} catch (IOException e) {
				JOptionPane.showMessageDialog(jFrame, e.getMessage(),"Fallido", JOptionPane.ERROR_MESSAGE);
			}
		}
	}
}