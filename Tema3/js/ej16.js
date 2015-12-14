window.onload = function(){
    var texto  = document.getElementById("texto").value;
    var resultado ="";
    for (var i = 0; i < 11; i++) {
        for (var j = 0; j < i; j++){
        	if (i == 10)
        		resultado+=0;
        	else
        		resultado+=i;
        }
        resultado+="<br/>";
    }
    texto.innerHTML=resultado;
}