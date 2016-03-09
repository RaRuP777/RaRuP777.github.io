function palindromo (cadena){
	var cadenaDerecho = cadena.toUpperCase().replace(/ /g,"").split("");
	var cadenaReves = cadena.toUpperCase().replace(/ /g,"").split("").reverse();
	for (i in cadenaDerecho){
		if (cadenaDerecho[i] != cadenaReves[i]){
			return false;
		}
	}
	return true;
}

if (palindromo(prompt("Introduce una cadena"))){
	alert("La cadena introducida es palindroma");
}
else {
	alert("La cadena introducida no es palindroma");
}