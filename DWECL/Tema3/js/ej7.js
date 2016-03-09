function myFunction() {
	var numero = document.getElementById("numero").value;
	var texto = document.getElementById("texto");
	var resultado = "";
	resultado = numero.length + ' cifras<br/>' + numero.split("").reverse().join("");
	texto.innerHTML = resultado;
}