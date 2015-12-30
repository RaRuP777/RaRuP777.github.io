function validarCampoTextoVacio(texto){
	var patron = "/^\s+$"; //No solo espacios en blanco
	if (texto.length != 0 || patron.test(texto))
		return true;
	return false;
}

function validarCampoNumero(texto) {
	if (typeof(texto) == Number) //Alternativa isNaN(texto)
		return true;
	return false;
}

function validarMatricula(texto){
	var patron = "/^\d{4}\s?[A-Z]{3}$/"; // 0000AAA
	if (patron.test(texto))
		return true;
	return false;
}

function validarTelefono(texto){
	var patronTelefono = "/^\d{9}$/"; // 000000000
	if (patronTelefono.test(texto))
		return true;
	return false;
}

function validarEmail(texto){
	var patronEmail = "/\w+([-+.']\w+)*@\w+([-.]\w+)*\.\w+([-.]\w+)/"; //a-a@.a-a
	if( !(patronEmail.test(texto)))
  		return true;
  	return false;
}

function validarFecha(anno, mes, dia){
	var fecha = new Date(anno, mes, dia);
	if (isNaN(fecha))
		return true;
	return false;
}

function validarDNI(texto){
	var letras = ['T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E', 'T'];
 	var patronDNI = "/^\d{8}[A-Z]$/"; //00000000A
	if(!(patron.test(texto)))
  		return false;
  	if(texto.charAt(8) != letras[(texto.substring(0, 8))%23])
  		return false;
  	return true;
}

function validarPassword(texto){
	var patron = "^(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{6,15}$"; //mayusculas, minusculas, números, minimo 6, maximo 15 caracteres
	if(!(patron.test(texto)))
  		return false;
  	return true;
}

function validarSelectOption (indice){
	//indice = document.getElementById("opciones").selectedIndex
	if (indice == null || indice == 0)
		return false;
	return true;
}

function validarCheckbox (elemento){
	if(elemento.checked)
		return true;
	return false;
}

function validarRadiobutton (opciones){
	//opciones = document.getElementsByName("opciones")
	var checked = false;
	for (var i=0; i < opciones.length; i++){
		if (opciones[i].checked){
			checked = true;
			return true;
		}
	}
	return false;
}