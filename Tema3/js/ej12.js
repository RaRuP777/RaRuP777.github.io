function enviar() {
	var numero = parseInt(document.getElementById("numero").value);
	var texto = document.getElementById("texto").value;
	var cuerpo = document.getElementById("cuerpo").value;
	var total = 0;
	if (numero==1){
		total++;
		sigue();
	}
	if (numero==0)
		sigue();
	if (numero==2)
		texto.innerHTML='El numero de unos introducidos es '+total;
}

function sigue(){
	cuerpo.innerHTML='<form id="formulario" action="get"><fieldset><label>Introduce 0 o 1, 2 para acabar de leer números: </label><input type="text" id="numero" value="" autofocus required/><br/>	</fieldset></form>	<input type="button" value="Enviar" onclick="enviar()" /><br/><hr/><br/></p>';
}