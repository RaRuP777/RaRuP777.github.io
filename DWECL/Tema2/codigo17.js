function limita(evento, maximoCaracteres) {
	var elemento = document.getElementById("texto");
	var evento = evento || window.event;
	var codigoCaracter = evento.charCode || evento.keyCode;
	if(codigoCaracter == 37 || codigoCaracter == 39) {
		return true;
	}
	if(codigoCaracter == 8 || codigoCaracter == 46) {
		return true;
	}
	else if(elemento.value.length >= maximoCaracteres ) {
		return false;
	}
	else {
		return true;
	}
}
function actualizaInfo(maximoCaracteres) {
	var elemento = document.getElementById("texto");
	var info = document.getElementById("info");
	if(elemento.value.length >= maximoCaracteres ) {
		info.innerHTML = "Máximo "+maximoCaracteres+" caracteres";
	}
	else {
		info.innerHTML = "Puedes escribir hasta "+(maximoCaracteres-elemento.value.length)+"  caracteres adicionales";
	}
}