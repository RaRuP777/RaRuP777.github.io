//Objeto Usuario
function Usuario (nombre, apellidos, dni){
	this.nombre = nombre;
	this.apellidos = apellidos;
	this.dni = dni;
}

//mostrar añadido con prototype
Usuario.prototype.mostrar = function(){
	var texto = document.getElementById("texto");
	texto.innerHTML = 	"El nombre es: " + this.nombre + "<br/>" + 
						"el apellido: " + this.apellidos + "<br/>" + 
						"el DNI es: " + this.dni;
}

//crearListItem añadido con prototype
Usuario.prototype.crearListItem = function(){
	var ul = document.getElementById("lista");
	var li = document.createElement("li");
	var nodo = document.createTextNode(this.nombre + this.apellidos + this.dni);
	li.appendChild(nodo);
	ul.appendChild(li);
}