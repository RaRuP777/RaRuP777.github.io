var secreto = Math.ceil(Math.random()*100);

function enviar() {
	var numero = document.getElementById("numero").value;
	var texto = document.getElementById("texto").value;
	var resultado ="";
	if (numero<secreto)
		resultado = "El numero introducio es es menor al secreto";
	else if (numero>secreto)
		resultado = "El numero introducio es es mayor al secreto";
		else if(numero==secreto)
			nuevaVentana();
	texto.innerHTML=resultado;
}

function nuevaVentana(){
	var ventana = window.open("","","width=200, height=200");
	ventana.document.write('<center><h1>Has acertado<br/>El número secreto era: '+ secreto + '</h1><center>');
}