function myFunction() {
	var numero = document.getElementById("numero").value;
	var texto = document.getElementById("texto").value;
	var resultado = "";
	resultado = numero.length + ' cifras<br/>' + numero.split("").reverse().join("");
	texto.innerHTML = resultado;
}