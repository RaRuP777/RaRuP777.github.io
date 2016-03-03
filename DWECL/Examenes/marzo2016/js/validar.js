function validarObligatorio(valor){
	if (valor == null || valor.length == 0 || valor.trim() == "")
		return true;
	return false;
}

function validarLongitud(valor){
	if(valor.trim().length < 2)
		return true;
	return false;
}

function validarPatron(patron, valor){
	return patron.test(valor);
}

function validarNombre(valor){
	if(validarObligatorio(valor)){
		errorNombre.innerHTML="El nombre debe ser introducido";
		return false;
	}
	if(validarLongitud(valor)){
		errorNombre.innerHTML="Longitud mínima 2 caracteres";
		return false;
	}
	errorNombre.innerHTML="";	
	return true;
}

function validarApellido1(valor){
	if(validarObligatorio(valor)){
		errorApellido1.innerHTML="El primer apellido debe ser introducido";
		return false;
	}
	if(validarLongitud(valor)){
		errorApellido1.innerHTML="Longitud mínima 2 caracteres";
		return false;
	}
	errorApellido1.innerHTML="";
	return true;
}

function validarApellido2(valor){
	if(validarObligatorio(valor)){
		errorApellido2.innerHTML="El segundo apellido debe ser introducido";
		return false;
	}
	if(validarLongitud(valor)){
		errorApellido2.innerHTML="Longitud mínima 2 caracteres";
		return false;
	}
	errorApellido2.innerHTML="";	
	return true;
}

function validarDNI(valor){
	if(validarObligatorio(valor)){
		errorDNI.innerHTML="El DNI debe ser introducido";
		return false;
	}
	if(!validarPatron(/^[0-9]{8}([A-H]|[J-N]|[P-T]|[V-Z]|[a-h]|[j-n]|[p-t]|[v-z]){1}$/,valor)){
		errorDNI.innerHTML="Formato incorrecto (12345678A)";
		return false;
	}
	errorDNI.innerHTML="";	
	return true;
}

function validarFecha(valor){
	if(validarObligatorio(valor)){
		errorFecha.innerHTML="La fecha debe ser introducida";
		return false;
	}
	if(!(validarPatron(/^\d{2}-\d{2}-\d{4}$/,valor))){
		errorFecha.innerHTML="Formato incorrecto (01-01-80)";
		return false;
	}
	var arrayFecha = valor.split("-");
	var fecha = new Date(arrayFecha[2], arrayFecha[1]-1, arrayFecha[0]);
	if (fecha.getDate() != arrayFecha[0] || fecha.getMonth() != arrayFecha[1]-1 || fecha.getFullYear() != arrayFecha[2]){
		errorFecha.innerHTML="Fecha incorrecta";
		return false;
	}
	errorFecha.innerHTML="";	
	return true;
}
	
function validarFormulario(){
	var foco = 0;
	if(!validarFecha(fecha.value))
		foco = 5;
	if(!validarDNI(dni.value))
		foco = 4;
	if(!validarApellido2(apellido2.value))
		foco = 3;
	if(!validarApellido1(apellido1.value))
		foco = 2;
	if(!validarNombre(nombre.value))
		foco = 1;
	if(foco != 0){
		ganarFoco(foco);
		return false;
	}
	return true;
}

function ganarFoco(foco){
	switch(foco){
		case 1:
			nombre.focus();
			break;
		case 2:
			apellido1.focus();
			break;
		case 3:
			apellido2.focus();
			break;
		case 4:
			dni.focus();
			break;
		case 5:
			fecha.focus();
	}
}