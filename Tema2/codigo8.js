function par_impar(numero) {
	if (numero % 2 === 0){
		alert ("El número es par");
	}
	else{
		alert ("El número no es par");
	}
}

var numero = prompt("Introduce un número entero");
if (isNaN(numero)){
        alert ("No se puede calcular. El valor introducido no es un número");
}
else {
    par_impar(numero);
}