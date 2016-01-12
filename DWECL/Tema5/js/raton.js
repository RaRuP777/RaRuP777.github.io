document.addEventListener("DOMContentLoaded", function () {
	
	var tabla = [
				document.getElementById("1"),
				document.getElementById("2"),
				document.getElementById("3"),
				document.getElementById("4"),
				document.getElementById("5"),
				document.getElementById("6"),
				document.getElementById("7"),
				document.getElementById("8"),
				document.getElementById("9")
	];

	for (var i=0; i<tabla.length; i++){
		tabla[i].onmouseover = cambiaColor; //Situarse encima del elemento
		tabla[i].onmouseout = cambiaBlanco; //Salir el puntero del elemento
		tabla[i].click = cambiaColor; //Dar click izquierdo en el elemento
		tabla[i].dblclick = cambiaBlanco; //Dar doble click izquierdo en el elemento
		tabla[i].mousedown = cambiaColor; //Al pulsar cualquier boton sobre el elemento
		tabla[i].mouseup = cambiaBlanco; //AL sortar el un botón que ha sido pulsado
		tabla[i].mousemove = cambiaColor; //Al situarse sobre el elemento
	}
	
	function cambiaColor(){
		this.style.background = colorAleatorio();
   	}

   	function cambiaBlanco(){
		this.style.background = 'white';
   	}

	function colorAleatorio(){
		color = Math.ceil(Math.random()*9);
		switch (color){
			case 1:
				return 'red';
			case 2:
				return 'green';
			case 3:
				return 'yellow';
			case 4:
				return 'orange';
			case 5:
				return 'pink';
			case 6:
				return 'brown';
			case 7:
				return 'black';
			case 8:
				return 'purple';
			default:
				return 'blue';
		}
	}
});