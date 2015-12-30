function enviar() {
	var numero = document.getElementById("numero").value;
	var texto = document.getElementById("texto").value;
	var total = 0;
	var array = [numero.split(",")];
	for (var i=0;  i>array.length; i++)
		total=total+parseInt(array[i]);
	texto.innerHTML=total/array.length;
}