document.addEventListener('DOMContentLoaded', function(){
			
	var msjNombre = document.getElementById('msj_nombre');
	var msjApellido1 = document.getElementById('msj_apellido1');
	var msjApellido2 = document.getElementById('msj_apellido2');
	var msjFecha = document.getElementById('msj_fecha');
	var msjCondiciones = document.getElementById('msj_condiciones');
	var btnCrear = document.getElementById('crear');			
	btnCrear.addEventListener('click', crear);
	var btnLimpiar = document.getElementById('limpiar');
	btnLimpiar.addEventListener('click', limpiar);

	function validar(){
		var nombre = document.getElementById("nombre").value;
		var apellido1 = document.getElementById("apellido1").value;
		var apellido2 = document.getElementById("apellido2").value;
		var fechaNac = document.getElementById("fechaNac").value;
		var aceptar = document.getElementById("msj_condiciones");

		if(!validarObligatorio("nombre")){
			msjNombre.innerHTML="El nombre es un campo obligatorio";
			return false;
		}
			
		if (!validarObligatorio("apellido1")){
			msjApellido1.innerHTML="El primer apellido es un campo obligatorio";
			return false;
		}

		if (!validarObligatorio("apellido2")){
			msjApellido2.innerHTML="El segundo apellido es un campo obligatorio";
			return false;
		}

		if (!validarObligatorio("fechaNac")){
			msjFecha.innerHTML="La fecha de nacimiento es un campo obligatorio";
			return false;
		}

		if (!validarFecha("fechaNac")){
			msjFecha.innerHTML="Formato de fecha incorrecta";
			return false;
		}

		if (!validarCheckbox("condiciones")){
			msjCondiciones.innerHTML="Debe de aceptar las condiciones";
			return false;
		}

	}

	function validarObligatorio(valor){	
		if( valor == null || valor.length == 0 || /^\s+$/.test(valor) ) 
			return false;
		return true;
	}

	function validarFecha(fecha){
		if (!(/^[0-9]{2}-[0-9]{2}-[0-9]{4}$/.test(fecha))) 
			return false;
	}

	function validarCheckbox (checkbox){
		if (checkbox.checked)
			return false;
	}

	function crearCookies(){
		setCookie("nombre",nombre,2);
		setCookie("apellido1",nombre,2);
		setCookie("apellido2",apellido2,2);
		setCookie("fechaNac",fechaNac,2);
	}

	function getCookie(cname) {
		var name = cname + "=";
		var ca = document.cookie.split(';');
		for (var i = 0; i < ca.length; i++) {
			var c = ca[i];
			while (c.charAt(0) == ' ') c = c.substring(1);
			if (c.indexOf(name) == 0) 
				return c.substring(name.length, c.length);
		}
		return "";
	}

	function crear(){
		if (validar()) {
			universitario = new Universitario(nombre, apellido1, apellido2, fecha);
			crearCookies();
			universitario.mostrar();
		}
	}

	function limpiar() {
		msjNombre.innerHTML='';
		msjApellido1.innerHTML='';
		msjApellido2.innerHTML='';
		msjFecha.innerHTML='';
		msj_condiciones.innerHTML='';
		setCookie("nombre", "", -1);
		setCookie("apellido1", "", -1);
		setCookie("apellido2", "", -1);
		setCookie("fechaNacimiento", "", -1);
	}

	document.getElementById("nombre").value = getCookie("nombre");
	document.getElementById("apellido1").value = getCookie("apellido1");
	document.getElementById("apellido2").value = getCookie("apellido2");
	document.getElementById("fechaNac").value = getCookie("fechaNac");
});