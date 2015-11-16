function enviar() {
	var array = new Array;
	array[1] = document.getElementById("numero1").value;
	array[2] = document.getElementById("numero2").value;
	array[3] = document.getElementById("numero3").value;
	var texto = document.getElementById("texto");
	var resultado ="";
	resultado = array.sort();
	texto.innerHTML = resultado;
}