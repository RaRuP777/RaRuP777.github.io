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

	var nombre = document.getElementById("nombre");
	var apellido1 = document.getElementById("apellido1");
	var apellido2 = document.getElementById("apellido2");
	var fecha = document.getElementById("fechaNac");
	var condiciones = document.getElementById("condiciones");

	var fecha;

	function crear(){
		if(validarFormulario()){
			var universitario = new Universitario(nombre.value, apellido1.value, apellido2.value, fecha);
			universitario.mostrar();
			crearCookie();
		}		
	}

	function limpiar() {
		msjNombre.innerHTML='';
		msjApellido1.innerHTML='';
		msjApellido2.innerHTML='';
		msjFecha.innerHTML='';
		msjCondiciones.innerHTML='';
		eliminarCookie();
	}

	function crearCookie(){
		document.cookie = "nombre=" + nombre.value + ";";
		document.cookie = "apellido1=" + apellido1.value + ";";
		document.cookie = "apellido2=" + apellido2.value + ";";
		document.cookie = "fecha=" + fecha.value + ";";
	}

	function eliminarCookie() {
		document.cookie = "nombre=''; expires=Thu, 01 Jan 1970 00:00:00 UTC";
		document.cookie = "apellido1=''; expires=Thu, 01 Jan 1970 00:00:00 UTC";
		document.cookie = "apellido2=''; expires=Thu, 01 Jan 1970 00:00:00 UTC";
		document.cookie = "fecha=''; expires=Thu, 01 Jan 1970 00:00:00 UTC";
	}

	function validarFormulario(){
		var correcto = true;
		if(!validarNombre(nombre.value))
			correcto = false;
		if(!validarApellido1(apellido1.value))
			correcto = false;
		if(!validarApellido2(apellido2.value))
			correcto = false;
		if(!validarFecha(fechaNac.value))
			correcto = false;
		if(!validarCondiciones(condiciones))
			correcto = false;
		return correcto;
	}

	function validarNombre(valor){
		if(validarObligatorio(valor)){
			msjNombre.innerHTML="El nombre debe ser introducido";
			return false;
		}
		msjNombre.innerHTML="";	
		return true;
	}

	function validarApellido1(valor){
		if(validarObligatorio(valor)){
			msjApellido1.innerHTML="El apellido1 debe ser introducido";
			return false;
		}
		msjApellido1.innerHTML="";	
		return true;
	}

	function validarApellido2(valor){
		if(validarObligatorio(valor)){
			msjApellido2.innerHTML="El apellido2 debe ser introducido";
			return false;
		}
		msjApellido2.innerHTML="";	
		return true;
	}

	function validarFecha(valor){
		if(validarObligatorio(valor)){
			msjFecha.innerHTML="La fecha debe ser introducida";
			return false;
		}
		if(!(/^\d{2}-\d{2}-\d{4}$/.test(valor))){
			msjFecha.innerHTML="Formato incorrecto (01-01-80)";
			return false;
		}
		var arrayFecha = valor.split("-");
		fecha = new Date(arrayFecha[2], arrayFecha[1]-1, arrayFecha[0]);
		if (fecha.getDate() != arrayFecha[0] || fecha.getMonth() != arrayFecha[1]-1 || fecha.getFullYear() != arrayFecha[2]){
			msjFecha.innerHTML="Fecha incorrecta";
			return false;
		}
		msjFecha.innerHTML="";	
		return true;
	}

	function validarCondiciones(valor){
		if(!(valor.checked)){
			msjCondiciones.innerHTML = "Debe aceptar las las condiciones";
			return false;
		}
		msjCondiciones.innerHTML = "";
		return true;
	}

	function validarObligatorio(valor){
		if (valor == null || valor.length == 0 || valor.trim() == "")
			return true;
		return false;
	}

});