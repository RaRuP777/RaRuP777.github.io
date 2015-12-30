var texto = document.getElementById("texto");

function enviar(){
	var nombre = document.getElementById("nombre").value;
	var apellidos = document.getElementById("apellidos").value;
	var fecha = document.getElementById("fecha").value;
	var sexo = document.getElementsByName("sexo");
	var email = document.getElementById("email").value;
	var telefono = document.getElementById("telefono").value;
	var dni = document.getElementById("dni").value;
	var experiencia = document.getElementById("experiencia").value;
	var estudios = document.getElementById("experiencia").value;
	var jornada = document.getElementById("jornada").selectedIndex;
	var idiomas = document.getElementsByName("idiomas[]");
	if(validarCampoTextoVacio(nombre)){
		document.getElementById("nombre").focus();
		throw new MyException ("El nombre no ha sido rellenado");
	}
	try {
		texto.innerHTML = nombre;
	} catch (e){
		texto.innerHTML = e.message;
	}
}

function MyException (message){
	this.name = "MyException";
	this.message = message;
}