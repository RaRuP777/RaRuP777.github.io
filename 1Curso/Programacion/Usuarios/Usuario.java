package Objetos.usuarios;

public class Usuario {
	private int dni=0;
	private String nombre="", apellidos="", direccion="";
	
	Usuario(int dni, String nombre, String apellidos, String direccion) throws cadenaErroneaException {
		setDni(dni);
		setNombre(nombre);
		setApellidos(apellidos);
		setDireccion(direccion);
		
	}

	Usuario(){
	}
	
	long getDni() {
		return dni;
	}

	private void setDni(int dni) {
		this.dni = dni;
	}

	String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) throws cadenaErroneaException {
		if (cadenaErronea(nombre))
			throw new cadenaErroneaException("El dato no es válido");
		this.nombre = nombre;
	}

	/**
	 * Comprueba si la cadena es menor de 2 caracteres o null
	 * @param cadena
	 * @return
	 */
	private boolean cadenaErronea(String cadena) {
		if ((cadena.length()<3)||(cadena==null))
			return true;
		else
			return false;
	}

	String getApellidos() {
		return apellidos;
	}

	private void setApellidos(String apellidos) throws cadenaErroneaException {
		if (cadenaErronea(apellidos))
			throw new cadenaErroneaException("El dato no es válido");
		this.apellidos = apellidos;
	}

	String getDireccion() {
		return direccion;
	}

	void setDireccion(String direccion) throws cadenaErroneaException {
		if (cadenaErronea(direccion))
			throw new cadenaErroneaException("El dato no es válido");
		this.direccion = direccion;
	}
	
	@Override
	public String toString(){
		return "("+dni+") "+nombre+" "+apellidos+" "+direccion;
	}

}
