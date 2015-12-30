package Objetos;

public class Circulo {
	
	private int radio;
	private Punto centro;
	
	Circulo(int radio, Punto centro)throws RadioInvalidoException{
		setRadio(radio);
		setCentro(centro);
}

	public int getRadio() {
		return radio;
	}

	public void setRadio(int radio) throws RadioInvalidoException {
		if (esErroneo(radio))
			throw new RadioInvalidoException("El radio no es valido");
		this.radio = radio;
	}

	public Punto getCentro() {
		return centro;
	}

	public void setCentro(Punto centro) {
		this.centro = centro;
	}
	private boolean esErroneo(int radio) {
		if (radio > 0)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Mi radio es "+radio+" y mi centro esta en "+centro;
	}
}
