function informacion(cadena) {
	if (cadena == cadena.toUpperCase()) {
		alert ("La cadena son solo mayusculas");
	}
	else if(cadena == cadena.toLowerCase()) {
		alert ("La cadena son solo minusculas");
	}
	else {
		alert ("La cadena son mayusculas y minusculas");
    }
}

informacion(prompt("Introduce una cadena"));