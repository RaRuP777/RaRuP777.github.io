function enviar() {
	var ventana = window.open("","","width=300, height=200");
	var w = window.innerWidth;
    var h = window.innerHeight;
	ventana.document.write('Se han utilizado las propiedades:<br/><ul><li>height=' + h + '</li><li>width=' + w + '</li></ul>');
}