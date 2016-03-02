window.addEventListener('load', function() {
	var p;
	var texto;

	document.body.children[0].remove();

	p = document.createElement("p");
	texto = document.createTextNode("Pedro");
	p.appendChild(texto);
	document.body.insertBefore(p, document.body.lastElementChild);

	p = document.createElement("p");
	texto = document.createTextNode("Ramos");
	p.appendChild(texto);
	document.body.appendChild(p);
});