function enviar() {
	var numero = parseInt(document.getElementById("numero").value);
	var texto = document.getElementById("texto");
	var resultado ="";
	if (numero < 1)
		resultado="El numero introducido es menor de 1"
	for (var i = 0; i <= numero; i++)
		resultado = resultado + i + '<br/>';
	texto.innerHTML=resultado;
}