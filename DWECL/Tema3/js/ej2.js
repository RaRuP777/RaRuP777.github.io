window.onload = function(){
	var texto  = document.getElementById("texto");
    var resultado='';
    for (var i = 0; i < 100; i=i+7) {
        resultado+= i + ' ';
    }
    texto.innerHTML = resultado;
}