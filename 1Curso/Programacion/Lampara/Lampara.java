package Lampara;

class Lampara { 
	boolean encendida = false;
	
	void encender(){ 
		encendida = true; 
		System.out.println("Ilumninando");
		}
	void apagar(){ 
		encendida = false; 
		System.out.println("Oscuridad");
	}
}

