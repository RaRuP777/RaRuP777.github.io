//funcion comprueba que un campo ha sido rellenado
function validarObligatorio(valor){
	if (valor == null || valor.length == 0 || /^\s+$/.test(valor)) //nulo, tamaño 0 o sólo espacios en blanco
		return true;
	return false;
}

//función validación del nombre
function validarNombre(){
	if(validarObligatorio(nombre.value)){
		errorNombre.innerHTML = "El nombre debe ser rellenado";
		return false;
	}
	if((nombre.value).length < 4){
		errorNombre.innerHTML = "Formato incorrecto (al menos debe tener 4 caracteres)";
		return false;
	}
	errorNombre.innerHTML = "";
	return true;
}

//función validación de los apellidos
function validarApellidos(){
	if(validarObligatorio(apellidos.value)){
		errorApellidos.innerHTML = "Los apellidos deben ser rellenados";
		return false;
	}
	if((apellidos.value).length < 4){
		errorApellidos.innerHTML = "Formato incorrecto (al menos debe tener 4 caracteres)";
		return false;
	}
	errorApellidos.innerHTML = "";
	return true;
}

//funcion validación del email
function validarEmail(){
	if(validarObligatorio(email.value)){
		errorEmail.innerHTML = "El email debe ser rellenados";
		return false;
	}
	if(!/^[_a-z0-9-]+(.[_a-z0-9-]+)*@[a-z0-9-]+(.[a-z0-9-]+)*(.[a-z]{2,4})$/.test(email.value)){
		errorEmail.innerHTML = "Formato incorrecto (algo@ejemplo.com)";
		return false;
	}
	errorEmail.innerHTML="";
	return true;
}

//funcion validacion de la fecha
function validarFecha(){
	if(validarObligatorio(fecha.value)){
		errorFecha.innerHTML = "La fecha debe ser elegida";
		return false;
	}
	errorFecha.innerHTML = "";
	return true;
}

//función validación condiciones
function validarCondiciones(){
	if(!(condiciones.checked)){
		errorCondiciones.innerHTML = "Debe aceptar las las condiciones";
		return false;
	}
	errorCondiciones.innerHTML = "";
	return true;
}
	
//valida los datos cuando es presionado el botón enviar
function validarFormulario(){
	var OK = true;
	if(!validarNombre(nombre.value))
		OK = false;
	if(!validarApellidos(apellidos.value))
		OK = false;
	if(!validarEmail(email.value))
		OK = false;
	if(!validarFecha(fecha.value))
		OK = false;
	if(!validarCondiciones(condiciones))
		OK = false;
	return OK;
}