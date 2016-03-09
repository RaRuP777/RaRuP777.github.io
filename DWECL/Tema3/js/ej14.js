function enviar() {
	var numero = parseInt(document.getElementById("numero").value);
	var texto = document.getElementById("texto");
	var cuerpo = document.getElementById("cuerpo");
	var total = 0;
	var cantidad = 0;
	if (numero>0){
		total=total+numero;
		cantidad++;
		sigue();
	}
	if (numero<0)
		texto.innerHTML='La media de los numeros introducidos es ' + total/cantidad;
}

function sigue(){
	cuerpo.innerHTML='<form id="formulario" action="get"><fieldset><label></label><input type="text" id="numero" value="" autofocus required/><br/>	</fieldset></form>	<input type="button" value="Enviar" onclick="enviar()" /><br/><hr/><br/></p>';
}