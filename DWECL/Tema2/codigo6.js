var letras = ['T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E', 'T'];

var numero = prompt("Introduce el numero de tu DNI");
var letra = prompt("Introduce la letra de tu DNI");

if (numero < 0 || numero > 99999999){
	alert ("El numero introducido no es válido");
}
else{
	var letracorrecta = numero%23;
	if (letras[letracorrecta] != letra){
		alert ("La letra introducida no es correcta");
	}
	else {
		alert ("El número y la letra introducidos son correctos");
	}
}