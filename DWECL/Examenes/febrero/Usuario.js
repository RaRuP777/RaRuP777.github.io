//Objeto Usuario
function Usuario (nombre, apellidos, dni){
	this.nombre = nombre;
	this.apellidos = apellidos;
	this.dni = dni;
}

//mostrar añadido con prototype
Usuario.prototype.mostrar = function(){
	var texto = document.getElementById("texto");
	texto.innerHtml = 	"El nombre es: " + this.nombre + "<br/>" + 
						"el apellido: " + this.apellidos + "<br/>" + 
						"el DNI es: " + this.dni;
}

//crearListItem añadido con prototype
Usuario.prototype.crearListItem = function(){
	elemento = document.createElement("li");
	usuario = document.createTextNode(this.nombre + this.apellidos + this.dni);
	elemento.appendChild(usuario);
	document.body.insertBefore(texto, document.body.lastElementChild);
}