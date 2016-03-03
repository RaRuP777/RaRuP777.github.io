document.addEventListener("DOMContentLoaded",function(){

	var nombre = document.getElementById("nombre");
	var apellido1 = document.getElementById("apellido1");
	var apellido2 = document.getElementById("apellido2");
	var dni = document.getElementById("dni");
	var fecha = document.getElementById("fecha");

	var errorNombre = document.getElementById("errorNombre");
	var errorApellido1 = document.getElementById("errorApellido1");
	var errorApellido2 = document.getElementById("errorApellido2");
	var errorDNI = document.getElementById("errorDNI");
	var errorFecha = document.getElementById("errorFecha");

	var texto = document.getElementById("texto");

	var btnCrear = document.getElementById("crear");
	var btnLimpiar = document.getElementById("limpiar");

	nombre.addEventListener("blur", function(){
		validarNombre(nombre.value);
	});

	apellido1.addEventListener("blur", function(){
		validarApellido1(apellido1.value);
	});

	apellido2.addEventListener("blur", function(){
		validarApellido2(apellido2.value);
	});

	dni.addEventListener("blur", function(){
		validarDNI(dni.value);
	});

	fecha.addEventListener("blur", function(){
		validarFecha(fecha.value);
	});

	btnCrear.addEventListener("click", crear);

	function crear(){
		if(validarFormulario()){
			var matricula = new Matricula(nombre.value, apellido1.value, apellido2.value, dni.value, fecha.value);
			matricula.mostrar();
			crearCookie();
		}		
	}

	btnLimpiar.addEventListener ("click", limpiar);

	function limpiar(){
		nombre.innerHTML="";
		apellido1.innerHTML="";
		apellido2.innerHTML="";
		dni.innerHTML="";
		fecha.innerHTML="";

		errorNombre.innerHTML="";
		errorApellido1.innerHTML="";
		errorApellido2.innerHTML="";
		errorDNI.innerHTML="";
		errorFecha.innerHTML="";

		texto.innerHTML="";

		eliminarCookie();
	}

	function crearCookie(){
		document.cookie = "nombre=" + nombre.value + ";";
		document.cookie = "apellido1=" + apellido1.value + ";";
		document.cookie = "apellido2=" + apellido2.value + ";";
		document.cookie = "dni=" + dni.value + ";";
		document.cookie = "fecha=" + fecha.value + ";";
	}

	function eliminarCookie() {
		document.cookie = "nombre=''; expires=Thu, 01 Jan 1970 00:00:00 UTC";
		document.cookie = "apellido1=''; expires=Thu, 01 Jan 1970 00:00:00 UTC";
		document.cookie = "apellido2=''; expires=Thu, 01 Jan 1970 00:00:00 UTC";
		document.cookie = "dni=''; expires=Thu, 01 Jan 1970 00:00:00 UTC";
		document.cookie = "fecha=''; expires=Thu, 01 Jan 1970 00:00:00 UTC";
	}

});