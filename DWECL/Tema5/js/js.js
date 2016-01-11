document.addEventListener("DOMContentLoaded", function () {
	
	var error1 = document.getElementById("error1");
	var error2 = document.getElementById("error2");
	var error3 = document.getElementById("error3");
	var error4 = document.getElementById("error4");
	var error5 = document.getElementById("error5");
	var error6 = document.getElementById("error6");
	var error7 = document.getElementById("error7");
	var error8 = document.getElementById("error8");
	var error9 = document.getElementById("error9");
	var error10 = document.getElementById("error10");
	var error11 = document.getElementById("error11");

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
			error1.innerHTML = "El nombre no ha sido rellenado";
		} else
			error1.innerHTML = "";
	});

	apellidos.addEventListener('blur', function(){
		if(validarCampoTextoVacio(apellidos.value)){
			apellidos.focus();
			error2.innerHTML = "Los apellidos no han sido rellenados";
		} else
			error2.innerHTML = "";
	});

	fecha.addEventListener('blur', function(){
		if(validarFormatoFecha(fecha.value)){
			fecha.focus();
			error3.innerHTML = "El formato de fecha no es correcto (00-00-0000)";
		} else
			error3.innerHTML = "";
	});

	email.addEventListener('blur', function(){
		if(validarEmail(email.value)){
			email.focus();
			error5.innerHTML = "El formato de email no es correcto (example@algo.com)";
		} else
			error5.innerHTML = "";
	});

	telefono.addEventListener('blur', function(){
		if(validarTelefono(telefono.value)){
			telefono.focus();
			error6.innerHTML = "El formato de teléfono no es correcto (000000000)";
		} else
			error6.innerHTML = "";
	});

	dni.addEventListener('blur', function(){
		if(validarDNI(dni.value)){
			dni.focus();
			error7.innerHTML = "El formato de DNI no es correcto (00000000A)";
		} else
			error7.innerHTML = "";
	});

	experiencia.addEventListener('blur', function(){
		if(validarCampoTextoVacio(experiencia.value)){
			experiencia.focus();
			error8.innerHTML = "La experiencia no ha sido rellenada";
		} else
			error8.innerHTML = "";
	});

	estudios.addEventListener('blur', function(){
		if(validarCampoTextoVacio(estudios.value)){
			estudios.focus();
			error9.innerHTML = "Los estudios no han sido rellenados";
		} else
			error9.innerHTML = "";
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
			error1.innerHTML='';
			error2.innerHTML='';
			error3.innerHTML='';
			error4.innerHTML='';
			error5.innerHTML='';
			error6.innerHTML='';
			error7.innerHTML='';
			error8.innerHTML='';
			error9.innerHTML='';
			error10.innerHTML='';
			error11.innerHTML='';
	}

	function enviar (){
		if(validarRadiobutton(sexo)){
			sexo.focus();
			error4.innerHTML = "Debes seleccionar un sexo";
		} else
			error4.innerHTML = "";
		if(validarSelectOption(jornada.selectedIndex)){
			jornada.focus();
			error10.innerHTML = "Debes seleccionar una jornada";
		} else
			error10.innerHTML = "";
		if(validarCheckbox(idiomas)){
			idiomas.focus();
			error11.innerHTML = "Debes seleccionar al menos un idioma";
		} else
			error11.innerHTML = "";
	}
});