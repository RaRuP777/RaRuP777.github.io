function calcularPosicion(evento){
	var varEvento = evento || window.event;
	var division = document.getElementById("info");
	var $nombre = $primero = $segundo ="";
	var mensaje = [$nombre,$primero,$segundo];
	coordenadaX = varEvento.pageX;
	coordenadaY = varEvento.pageY;
	switch(varEvento.type){
		case "mousemove":
			if (coordenadaXFinal != varEvento.pageX || coordenadaYFInal != varEvento.pageY){
				mensaje[0]="Raton";
				mensaje[1]="Navegador "+ "["+ varEvento.clientX+" , "+varEvento.clientY +"]";
				mensaje[2]="Pagina "+ "["+ coordenadaX+" , "+coordenadaY +"]";
				division.style.backgroundColor = "#AA0000";
				coordenadaXFinal=varEvento.pageX;
				coordenadaYFInal=varEvento.pageY;
				}
			break;
		case "click":
			mensaje[0]="Raton";
			mensaje[1]="Navegador "+ "["+ varEvento.clientX+" , "+varEvento.clientY +"]";
			mensaje[2]="Pagina "+ "["+ coordenadaX+" , "+coordenadaY +"]";
			division.style.backgroundColor = "#00AA00";
			coordenadaXFinal=varEvento.pageX;
			coordenadaYFInal=varEvento.pageY;
			break;
		case "keypress":
			var ieCode = varEvento.charCode || varEvento.keyCode;
			mensaje[0]="Teclado";
			mensaje[1]="Carácter "+ String.fromCharCode(ieCode);
			mensaje[3]="Código "+ ieCode;
			division.style.backgroundColor = "#0000AA";
			break;
	} 
	muestraInformacion(mensaje);
}

function muestraInformacion(mensaje) {
	document.getElementById("info").innerHTML = '<h1>'+mensaje[0]+'</h1>';
	for(var i=1; i<mensaje.length; i++) {
		document.getElementById("info").innerHTML += '<p>'+mensaje[i]+'</p>';
	}
}

onmousemove=calcularPosicion;
onclick=calcularPosicion;
onkeypress=calcularPosicion;