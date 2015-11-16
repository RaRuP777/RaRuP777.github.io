window.onload = function(){
    var texto  = document.getElementById("texto");
    var resultado ="";
    for (var i = 0; i < 11; i++) {
        for (var j = 1; j < i+1; j++){
        	if (j == 10)
        		resultado+=0;
        	else
        		resultado+=j;
        }
        resultado+="<br/>";
    }
    texto.innerHTML=resultado;
}