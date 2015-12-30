function enviar() {
	for (var i=0; i<5; i++){
		var ventana = window.open("","","width=200, height=200");
		ventana.document.write('<html><head><script type="text/javascript">function cerrar(){window.close();}</script></head><body>Ventana ' + i + '<input type="button" value="Cerrar" onclick="cerrar()" /></body></html>');
	}
}

