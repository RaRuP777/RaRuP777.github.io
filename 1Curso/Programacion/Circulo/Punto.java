package Objetos;

public class Punto {
	private int x, y;
			
		Punto(int x, int y){
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
	@Override
	public String toString() {
		return "las cordenadas son "+x+" y "+y;
	}
}