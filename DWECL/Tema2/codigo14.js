function muestraOculta(id) {
	var elemento = document.getElementById('contenidos_'+id);
	var enlace = document.getElementById('enlace_'+id);
	if(elemento.style.display == "" || elemento.style.display == "block") {
		elemento.style.display = "none";
		enlace.innerHTML = 'Mostrar contenidos';
	}
	else {
		elemento.style.display = "block";
		enlace.innerHTML = 'Ocultar contenidos';
	}
}

document.getElementById(enlace_1).click(muestraOculta(1));
document.getElementById(enlace_2).click(muestraOculta(2));
document.getElementById(enlace_3).click(muestraOculta(3));