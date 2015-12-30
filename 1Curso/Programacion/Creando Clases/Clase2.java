package AccediendoCampos;

public class Clase2 {
	private int [][] campo1;
	private char campo2;
	
	Clase2(int[][] campo1, char campo2){
		setCampo1(campo1);
		setCampo2(campo2);
	}

	int[][] getCampo1() {
		return campo1;
	}

	private void setCampo1(int[][] campo1) {
		this.campo1 = campo1;
	}

	char getCampo2() {
		return campo2;
	}

	private void setCampo2(char campo2) {
		this.campo2 = campo2;
	}

	@Override //siempre que invoques a la Clase2, en su lugar ponme esto:
	public String toString() {
		return "Clase2 [campo1=" + campo1ToString() + ", campo2="
				+ campo2 + "]";
	}

	String campo1ToString() {
		String cadena="";
		for(int i=0;i<campo1.length;i++){
        	for (int j = 0; j < campo1[i].length; j++) {
        		cadena+=campo1[i][j];
    		}
        }
		return cadena;
	}
	
}
