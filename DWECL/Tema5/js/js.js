document.addEventListener("DOMContentLoaded", function () {
	
	var texto = document.getElementById("texto");
	var btnEnviar = document.getElementById('enviar');			
	btnEnviar.addEventListener('click', enviar);
	var btnReset = document.getElementById('reset');
	btnReset.addEventListener('click', reset);

	var nombre = document.getElementById("nombre");
	var apellidos = document.getElementById("apellidos");
	var fecha = document.getElementById("fecha");
	var sexo = document.getElementsByName("sexo");
	var email = document.getElementById("email");
	var telefono = document.getElementById("telefono");
	var dni = document.getElementById("dni");
	var experiencia = document.getElementById("experiencia");
	var estudios = document.getElementById("experiencia");
	var jornada = document.getElementById("jornada");
	var idiomas = document.getElementsByName("idiomas[]");

	nombre.addEventListener('blur', function(){
		if(validarCampoTextoVacio(nombre.value)){
			nombre.focus();
			texto.innerHTML = "El nombre no ha sido rellenado";
		} else
			texto.innerHTML = "";
	});

	apellidos.addEventListener('blur', function(){
		if(validarCampoTextoVacio(apellidos.value)){
			apellidos.focus();
			texto.innerHTML = "Los apellidos no han sido rellenados";
		} else
			texto.innerHTML = "";
	});

	fecha.addEventListener('blur', function(){
		if(validarFormatoFecha(fecha.value)){
			fecha.focus();
			texto.innerHTML = "El formato de fecha no es correcto (00-00-0000)";
		} else
			texto.innerHTML = "";
	});

	email.addEventListener('blur', function(){
		if(validarEmail(email.value)){
			email.focus();
			texto.innerHTML = "El formato de email no es correcto (example@algo.com)";
		} else
			texto.innerHTML = "";
	});

	telefono.addEventListener('blur', function(){
		if(validarTelefono(telefono.value)){
			telefono.focus();
			texto.innerHTML = "El formato de teléfono no es correcto (000000000)";
		} else
			texto.innerHTML = "";
	});

	dni.addEventListener('blur', function(){
		if(validarDNI(dni.value)){
			dni.focus();
			texto.innerHTML = "El formato de DNI no es correcto (00000000A)";
		} else
			texto.innerHTML = "";
	});

	experiencia.addEventListener('blur', function(){
		if(validarCampoTextoVacio(experiencia.value)){
			experiencia.focus();
			texto.innerHTML = "La experiencia no ha sido rellenada";
		} else
			texto.innerHTML = "";
	});

	estudios.addEventListener('blur', function(){
		if(validarCampoTextoVacio(estudios.value)){
			estudios.focus();
			texto.innerHTML = "Los estudios no han sido rellenados";
		} else
			texto.innerHTML = "";
	});

	function reset (){
			nombre.innerHTML='';
			apellidos.innerHTML='';
			fecha.innerHTML='';
			email.innerHTML='';
			telefono.innerHTML='';
			dni.innerHTML='';
			experiencia.innerHTML='';
			estudios.innerHTML='';
	}

	function enviar (){
		if(validarRadiobutton(sexo)){
			sexo.focus();
			texto.innerHTML = "Debes seleccionar un sexo";
		} else
			texto.innerHTML = "";
		if(validarSelectOption(jornada.selectedIndex)){
			jornada.focus();
			texto.innerHTML = "Debes seleccionar una jornada";
		} else
			texto.innerHTML = "";
		if(validarCheckbox(idiomas)){
			idiomas.focus();
			texto.innerHTML = "Debes seleccionar al menos un idioma";
		} else
			texto.innerHTML = "";
	}
});