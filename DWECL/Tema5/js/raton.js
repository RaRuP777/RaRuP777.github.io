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
		tabla[i].onmouseover = cambiaColor;
		tabla[i].onmouseout = cambiaBlanco;
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