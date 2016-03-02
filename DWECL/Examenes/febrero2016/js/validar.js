//funcion comprueba que un campo ha sido rellenado
function validarObligatorio(valor){
	if (valor == null || valor.length == 0 || /^\s+$/.test(valor)) //nulo, tamaño 0 o sólo espacios en blanco
		return true;
	return false;
}

//función validación del nombre
function validarNombre(valor){
	if(validarObligatorio(valor)){
		errorNombre.innerHTML = "El nombre debe ser rellenado";
	}else if(valor.length < 4)
		errorNombre.innerHTML = "Formato incorrecto (al menos debe tener 4 caracteres)";
	else{
		errorNombre.innerHTML = "";
		return true;
	}
	return false;
}

//función validación de los apellidos
function validarApellidos(valor){
	if(validarObligatorio(valor))
		errorApellidos.innerHTML = "Los apellidos deben ser rellenados";
	else{
		errorApellidos.innerHTML = "";
		return true;
	}
	return false;
}

//función validación del DNI
function validarDNI(valor){
	if(validarObligatorio(valor)){
		errorDNI.innerHTML = "El DNI debe ser rellenado";
	}else if(!(/^\d{8}[a-zA-Z]{1}$/.test(valor)))
		errorDNI.innerHTML = "El formato del DNI no es correcto (12345678Z)";
	else{
		errorDNI.innerHTML = "";
		return true;
	}
	return false;
}

//función validación del sexo
function validarSexo (opciones){
		for (var i=0; i < opciones.length; i++){
			if (opciones[i].checked){
				errorSexo.innerHTML = "";
				return true;
			}			
		}
		errorSexo.innerHTML = "El Sexo debe ser elegido";
		return false;
}

//función validación condiciones
function validarCondiciones(valor){
	if(!(valor.checked))
		errorCondiciones.innerHTML = "Debe aceptar las las condiciones";
	else{
		errorCondiciones.innerHTML = "";
		return true;
	}
	return false;
}
	
//valida los datos cuando es presionado el botón enviar
function validarFormulario(){
	var OK = true;
	var sexo = document.getElementsByName("sexo");
	if(!validarNombre(nombre.value))
		OK = false;
	if(!validarApellidos(apellidos.value))
		OK = false;
	if(!validarDNI(DNI.value))
		OK = false;
	if(!validarCondiciones(condiciones))
		OK = false;
	if(!validarSexo(sexo))
		OK = false;
	return OK;
}