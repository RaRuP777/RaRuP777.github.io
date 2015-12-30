package Objetos;

public class Posicion {
	private int x, y;
			
		Posicion(int x, int y){
			setX(x);
			setY(y);
	}
	private int getX() {
		return x;
	}
	private void setX(int x) {
		this.x = x;
	}
	private int getY() {
		return y;
	}
	private void setY(int y) {
		this.y = y;
	}
	Posicion copiarObjeto () {
		Posicion copia = new Posicion (x,y);
		return copia;
	}
	void decrementoX() {
		x--;
	}
	void decrementoY() {
		y--;
	}
	void incrementoX() {
		x++;
	}
	void incrementoY() {
		y++;
	}
	void setXY(int x2, int y2){
		setX(x2);
		setY(y2);
	}
	@Override
	public String toString() {
		return "las cordenadas son "+x+" y "+y;
	}
}