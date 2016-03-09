function enviar() {
	var numero = document.getElementById("numero").value;
	var texto = document.getElementById("texto");
	var total = 0;
	var array = [numero.split(",")];
	for (var i=0;  i<array.length; i++)
		total=total+parseInt(array[i]);
	var media = total/array.length;
	texto.innerHTML=media;
}