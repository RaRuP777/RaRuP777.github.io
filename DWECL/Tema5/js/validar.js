function validarCampoTextoVacio(texto){
	if( texto == null || texto.length == 0 || /^\s+$/.test(texto)) //no solo espacios en blanco
  		return true;
	return false;
}

function validarFormatoFecha(fecha){
	if( /^[0-9]{2}-[0-9]{2}-[0-9]{4}$/.test(fecha)) //00-00-0000
  		return false;
	return true;
}

function validarCampoNumero(texto) {
	if (typeof(texto) == Number) //Alternativa isNaN(texto)
		return true;
	return false;
}

function validarMatricula(texto){
	if (/^\d{4}\s?[A-Z]{3}$/.test(texto))// 0000AAA
		return true;
	return false;
}

function validarTelefono(texto){
	if (/^\d{9}$/.test(texto))// 000000000
		return false;
	return true;
}

function validarEmail(texto){
	if(/^[_a-z0-9-]+(.[_a-z0-9-]+)*@[a-z0-9-]+(.[a-z0-9-]+)*(.[a-z]{2,4})$/.test(texto))//a-a@.a-a
  		return false;
  	return true;
}

function validarFecha(anno, mes, dia){
	var fecha = new Date(anno, mes, dia);
	if (isNaN(fecha))
		return true;
	return false;
}

function validarDNI(texto){
	var letras = ['T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E', 'T'];
 	if(!(/^\d{8}[A-Z]$/.test(texto))) //00000000A
  		return true;
  	if(texto.charAt(8) != letras[(texto.substring(0, 8))%23])
  		return true;
  	return false;
}

function validarPassword(texto){
	if(!(/^(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{6,15}$/.test(texto)))//mayusculas, minusculas, números, minimo 6, maximo 15 caracteres
  		return false;
  	return true;
}

function validarSelectOption (indice){
	if (indice == null || indice == 0)
		return false;
	return true;
}

function validarCheckbox (opciones){
	var checked = false;
	for (var i=0; i < opciones.length; i++){
		if (opciones[i].checked){
			checked = true;
			return true;
		}
	}
}

function validarRadiobutton (opciones){
	var checked = false;
	for (var i=0; i < opciones.length; i++){
		if (opciones[i].checked){
			checked = true;
			return true;
		}
	}
	return false;
}

function validarUrl(){
    if(!(/^(http|https|ftp)\:\/\/[a-z0-9\.-]+\.[a-z]{2,4}/.test(texto)))
  		return false;
  	return true;
}