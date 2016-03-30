//funcion comprueba que un campo ha sido rellenado
function validarObligatorio(valor){
	if (valor == null || valor.length == 0 || /^\s+$/.test(valor)) //nulo, tamaño 0 o sólo espacios en blanco
		return true;
	return false;
}

//función validación del nombre
function validarNombre(valor){
	if(validarObligatorio(valor.trim())){
		errorNombre.innerHTML = "El nombre debe ser rellenado";
		return false;
	}
	if(valor.trim().length < 4){
		errorNombre.innerHTML = "Formato incorrecto (al menos debe tener 4 caracteres)";
		return false;
	}
	errorNombre.innerHTML = "";
	return true;
}

//funcion validación del email
function validarEmail(valor){
	if(validarObligatorio(valor.trim())){
		errorEmail.innerHTML = "El email debe ser rellenados";
		return false;
	}
	if(!/^[_a-z0-9-]+(.[_a-z0-9-]+)*@[a-z0-9-]+(.[a-z0-9-]+)*(.[a-z]{2,4})$/.test(valor.trim())){
		errorEmail.innerHTML = "Formato incorrecto (algo@ejemplo.com)";
		return false;
	}
	errorEmail.innerHTML="";
	return true;
}

//valida los datos cuando es presionado el botón enviar
function validarFormulario(){
	var OK = true;
	if(!validarNombre(nombre.value))
		OK = false;
	if(!validarEmail(email.value))
		OK = false;
	return OK;
}