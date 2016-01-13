document.addEventListener("DOMContentLoaded", function () {
	
	var borrar = document.getElementById("borrar");
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

	window.onkeydown = cambiaAleatorio;
	//window.onkeypress = cambiaNegro;
	//window.onkeyup = cambiaBlanco;

	function cambiaAleatorio (){
		for (var i=0; i<tabla.length; i++){
			tabla[i].style.background = colorAleatorio();
		}
	}

	function cambiaBlanco(){
		for (var i=0; i<tabla.length; i++){
			tabla[i].style.background = 'white';
		}
	}

	function cambiaNegro(){
		for (var i=0; i<tabla.length; i++){
			tabla[i].style.background = 'black';
		}
	}

	function colorAleatorio(){
		color = Math.ceil(Math.random()*8);
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
				return 'purple';
			default:
				return 'blue';
		}
	}
});