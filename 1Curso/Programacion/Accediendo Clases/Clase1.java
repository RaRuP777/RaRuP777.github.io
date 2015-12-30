package AccediendoCampos;

public class Clase1 {
	private int campo1;
	private String campo2;
	private Clase2 campo3;
	
	Clase1(int campo1, String campo2, Clase2 campo3){
		setCampo1(campo1);
		setCampo2(campo2);
		setCampo3(campo3);
	}

	int getCampo1() {
		return campo1;
	}

	private void setCampo1(int campo1) {
		this.campo1 = campo1;
	}

	String getCampo2() {
		return campo2;
	}

	private void setCampo2(String campo2) {
		this.campo2 = campo2;
	}

	Clase2 getCampo3() {
		return campo3;
	}

	private void setCampo3(Clase2 campo3) {
		this.campo3 = campo3;
	}
	
}
