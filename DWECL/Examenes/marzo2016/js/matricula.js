function Matricula (nombre, apellido1, apellido2, dni, fecha){
	this.nombre = nombre;
	this.apellido1 = apellido1;
	this.apellido2 = apellido2;
	this.dni = dni;
	this.fecha = fecha;
}

Matricula.prototype.mostrar = function(){
	texto.innerHTML = this.nombre + " - " 
					+ this.apellido1 + " - " 
					+ this.apellido2 + " - " 
					+ this.dni + " - " 
					+ this.fecha;
}