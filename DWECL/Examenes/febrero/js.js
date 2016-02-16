document.addEventListener("DOMContentLoaded",function(){

	//datos del formulario
	var nombre = document.getElementById("nombre");
	var apellidos = document.getElementById("apellidos");
	var DNI = document.getElementById("DNI");
	var sexo = document.getElementsByName("sexo");
	var condiciones = document.getElementsByName("condiciones");

	//mensajes de error
	var errorNombre = document.getElementById("errorNombre");
	var errorApellidos = document.getElementById("errorApellidos");
	var errorDNI = document.getElementById("errorDNI");
	var errorCheckbox = document.getElementById("errorCheckbox");
	var errorSexo = document.getElementById("errorSexo");
	
	//botones del formulario
	var btnCrear = document.getElementById('crear');
	btnCrear.addEventListener('click', crear);
	var btnLimpiar = document.getElementById('limpiar');
	btnLimpiar.addEventListener('click', limpiar);

	//evento perdida foco del input nombre
	nombre.addEventListener('blur', function(){
		if(validarObligatorio(nombre.value)){
			errorNombre.innerHTML = "El nombre debe ser rellenado";
		}else if(validarNombre(nombre.value))
			errorNombre.innerHTML = "Formato de nombre incorrecto (al menos debe tener 4 caracteres)";
		else
			errorNombre.innerHTML = "";
	});

	//evento perdida foco del input apellidos
	apellidos.addEventListener('blur', function(){
		if(validarObligatorio(apellidos.value))
			errorApellidos.innerHTML = "Los apellidos deben ser rellenados";
		else
			errorApellidos.innerHTML = "";
	});

	//evento perdida foco del input DNI
	DNI.addEventListener('blur', function(){
		if(validarObligatorio(DNI.value)){
			errorDNI.innerHTML = "El DNI debe ser rellenado";
		}else if(validarDNI(DNI.value))
			errorDNI.innerHTML = "El formato del DNI no es correcto (12345678Z)";
		else
			errorDNI.innerHTML = "";
	});

	//función crear asociada al botón Nuevo Usuario
	function crear(){

		if(validarObligatorio(nombre.value)){
			errorNombre.innerHTML = "El nombre debe ser rellenado";
			return false;
		}
		errorNombre.innerHTML = "";

		if(validarNombre(nombre.value)){
			errorNombre.innerHTML = "Formato de nombre incorrecto (al menos debe tener 4 caracteres)";
			return false;
		}
		errorNombre.innerHTML = "";

		if(validarObligatorio(apellidos.value)){
			errorApellidos.innerHTML = "Los apellidos deben ser rellenados";
			return false;
		}
		errorApellidos.innerHTML = "";

		if(validarObligatorio(DNI.value)){
			errorDNI.innerHTML = "El DNI debe ser rellenado";
			return false;
		}
		errorDNI.innerHTML = "";

		if(validarDNI(DNI.value)){
			errorDNI.innerHTML = "El formato del DNI no es correcto (12345678Z)";
			return false;
		}
		errorDNI.innerHTML = "";

		if(validarChecked(sexo)){
			errorSexo.innerHTML = "Debe seleccionar un sexo";
			return false;
		}
		errorSexo.innerHTML = "";

		if(validarChecked(condiciones)){
			errorCheckbox.innerHTML = "Debe aceptar las condiciones de uso"
			return false;
		}
		errorCheckbox.innerHTML = "";

	usuario = new Usuario(nombre,apellidos,DNI);
	usuario.mostrar();
	usuario.crearListItem();
	crearCookie();
	}

	//función crear asociada al botón Limpiar
	function limpiar(){
		nombre.innerHTML="";
		apellidos.innerHTML="";
		DNI.innerHTML="";
		errorNombre="";
		errorApellidos="";
		errorDNI="";
		errorSexo="";
		errorCheckbox="";
		eliminarCookie();
	}

	//funcion comprueba que un campo ha sido rellenado
	function validarObligatorio(valor){
		if (valor == null || valor.length == 0 || /^\s+$/.test(valor)) //nulo, tamaño 0 o sólo espacios en blanco
			return true;
		return false;
	}

	//función comprueba el tamaño del nombre
	function validarNombre(valor){
		if(valor.length < 4 || /^\s+$/.test(valor)) //minimo 4 y no solo seán espacios en blanco
			return true;
		return false;
	}

	//funciñon comprueba formato del DNI
	function validarDNI(valor){
		if (/^\d{8}[A-Z]{1}$/.test(valor)) //8 digitos y una letra mayúscula
			return false;
		return true;
	}

	//comprueba que las opciones han sido elegidas
	function validarChecked (opciones){
		for (var i=0; i < opciones.length; i++){
			if (opciones[i].checked)
				return false;
		}
		return true;
	}
	
	//crea una cookie
	function crearCookie(){
		document.cookie = "nombre=" + nombre + "apellidos=" + apellidos + "DNI=" + DNI + "; expires=Sun, 01 Jan 2017 00:00:00 UTC";
	}

	//borra una cookie
	function eliminarCookie() {
		document.cookie = "nombre=null apellidos=null DNI=null; expires=Thu, 01 Jan 1970 00:00:00 UTC";
	}

});