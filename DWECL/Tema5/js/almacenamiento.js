document.addEventListener("DOMContentLoaded", function () {
	
	var texto = document.getElementById("texto");
	var nombre = document.getElementById("nombre");
	var color = ""; 

	document.getElementById('crear').addEventListener('click', crearCookie);
	document.getElementById('mostrar').addEventListener('click', mostrarCookie);
	document.getElementById('borrar').addEventListener('click', eliminarCookie);
	document.getElementById('reset').addEventListener('click', reset);

	document.getElementById('rojo').addEventListener('click', fondoRojo);
	document.getElementById('verde').addEventListener('click', fondoVerde);
	document.getElementById('azul').addEventListener('click', fondoAzul);
	document.getElementById('recuperar').addEventListener('click', fondoRecuperar);	
	
	function crearCookie(){
		document.cookie = "nombre=" + nombre.value + "; expires=Sun, 01 Jan 2017 00:00:00 UTC";
		texto.innerHTML = "La cookie ha sido creada con el nombre " + nombre.value;
	}

	function mostrarCookie(){
		texto.innerHTML = document.cookie;
	}

	function eliminarCookie() {
		document.cookie = "nombre=null; expires=Thu, 01 Jan 1970 00:00:00 UTC";
		texto.innerHTML = "La cookie ha sido eliminada";
	}

	function reset(){
		texto.innerHTML="";
	}

	function fondoRojo(){
		color = "red";
		localStorage.setItem("color",color);
		document.getElementById("fondo").style.background = color;
	}

	function fondoVerde(){
		color = "green";
		localStorage.setItem("color",color);
		document.getElementById("fondo").style.background = color;
	}

	function fondoAzul(){
		color = "blue";
		localStorage.setItem("color",color);
		document.getElementById("fondo").style.background = color;
	}

	function fondoRecuperar(){
		color = "";
		localStorage.setItem("color",color);
		document.getElementById("fondo").style.background = "pink";
	}

});