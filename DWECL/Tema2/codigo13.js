function anade() {
    var elemento = document.createElement("li");
    var texto = document.createTextNode("Nuevo Elemento");
    elemento.appendChild(texto);
    var lista = document.getElementById("lista");
    lista.appendChild(elemento);
    var nuevoElemento = "<li>Nuevo Texto</li>";
    lista.innerHTML = lista.innerHTML + nuevoElemento;
}