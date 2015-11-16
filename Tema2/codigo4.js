var valores = [true, 5, false, "hola", "adios", 2];

//Que elemento de texto es mayor
if (valores[3] > valores[4]){
	alert ("La cadena mas grande es: "+valores[3]);
}
else
	alert ("La cadena mas grande es: "+valores[4]);

//Obtener true
alert ("Obtener true: "+valores[0] || valores[2]);

//Obtener False
alert ("Obtener false: "+valores[0] && valores[2]);

//Cinco operaciones matematicas
alert ("La suma es: " + (valores[1]+valores[5]));
alert ("La resta es: " + (valores[1]-valores[5]));
alert ("La multiplicación es: " + (valores[1]*valores[5]));
alert ("La división es: " + (valores[1]/valores[5]));
alert ("El resto es: " + (valores[1]%valores[5]));