document.addEventListener("DOMContentLoaded",function(){

	//datos del formulario
	var nombre = document.getElementById("nombre");
	var apellidos = document.getElementById("apellidos");
	var DNI = document.getElementById("DNI");
	var hombre = document.getElementById("hombre");
	var mujer = document.getElementById("mujer");
	var condiciones = document.getElementById("condiciones");

	//mensajes de error
	var errorNombre = document.getElementById("errorNombre");
	var errorApellidos = document.getElementById("errorApellidos");
	var errorDNI = document.getElementById("errorDNI");
	var errorCondiciones = document.getElementById("errorCondiciones");
	var errorSexo = document.getElementById("errorSexo");

	//botones del formulario
	var btnEnviar = document.getElementById('enviar');
	var btnLimpiar = document.getElementById('limpiar');

	//div donde se muestra la información del alta creada
	var texto = document.getElementById("texto");

	//evento perdida foco del input nombre
	nombre.addEventListener('blur', function(){
		validarNombre(nombre.value);
	});

	//evento perdida foco del input apellidos
	apellidos.addEventListener('blur', function(){
		validarApellidos(apellidos.value);
	});

	//evento perdida foco del input DNI
	DNI.addEventListener('blur', function(){
		validarDNI(DNI.value);
	});

	//evento presionar botón crear
	btnEnviar.addEventListener('click',crear);

	//función crear asociada al botón Nuevo Usuario
	function crear(){
		if(validarFormulario()){
			var usuario = new Usuario(nombre.value,apellidos.value,DNI.value);
			usuario.mostrar();
			usuario.crearListItem();
			crearCookie();
		}
	}

	//evento presionar botón limpiar
	btnLimpiar.addEventListener('click',limpiar);

	//función crear asociada al botón Limpiar
	function limpiar(){
		nombre.innerHTML="";
		apellidos.innerHTML="";
		DNI.innerHTML="";
		condiciones.checked=false;
		hombre.checked=false;
		mujer.checked=false;

		errorNombre.innerHTML = "";
		errorApellidos.innerHTML="";
		errorDNI.innerHTML="";
		errorSexo.innerHTML="";
		errorCondiciones.innerHTML="";

		texto.innerHTML="";

		eliminarCookie();
	}

	//crea una cookie
	function crearCookie(){
		document.cookie = "nombre=" + nombre.value + ";";
		document.cookie = "apellidos=" + apellidos.value + ";";
		document.cookie = "DNI=" + DNI.value + ";";
	}

	//borra una cookie
	function eliminarCookie() {
		document.cookie = "nombre=; expires=Thu, 01 Jan 1970 00:00:00 UTC";
		document.cookie = "apellidos=; expires=Thu, 01 Jan 1970 00:00:00 UTC";
		document.cookie = "DNI=; expires=Thu, 01 Jan 1970 00:00:00 UTC";
	}

});