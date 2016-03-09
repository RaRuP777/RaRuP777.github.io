document.addEventListener("DOMContentLoaded", function () {
	var html = document.documentElement;
	var body = html.lastChild;
	var head = html.childNodes[0];
	var numeroNodosHijos = body.childNodes.length;
	var nuevoNodo = document.createElement("p");
	var texto = document.createTextNode("Hola a todos");
	nuevoNodo.appendChild(texto);
	document.body.appendChild(nuevoNodo);
	var ol = document.createElement("ol");
	var li = document.createElement("li");
	var pareja = document.createTextNode("Jesús");
	li.appendChild(pareja);
	ol.appendChild(li);
	body.insertBefore(ol , body.firstChild);
	var parrafos = document.getElementsByTagName('p');
	parrafos[parrafos.length-2].remove();
	var ventana = window.open("","","width=700, height=200");
	ventana.document.write('document.documentElement: ' + html + '<br/>document.documentElement.lastChild: ' + body + '<br/>document.documentElement.childNodes[0]: ' + head + '<br/>document.documentElement.lastChild.childNodes.length: ' + numeroNodosHijos + '<br/>');
});