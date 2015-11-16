var numero = prompt("Introduce un número");
var factorial = 1;
if (numero - Math.floor(numero) != 0) {
        alert ("No se puede calcular. El valor introducido no es un entero positivo");
}
else{
	if (isNaN(numero)){
		alert ("No se puede calcular. El valor introducido no es un entero positivo");
	}
	else {
		if (numero < 0){
			alert("No se puede calcular. El valor introducido no es un entero positivo");
		}
		else{
			if (numero == 0) {
				alert("El factorial del numero es: 1");
			}
			else {
				for(var i=1; i <= numero; i++) {
					factorial *= i;
				}
				alert("El factorial del numero es: " + factorial);	
			}
		}	
	}
}