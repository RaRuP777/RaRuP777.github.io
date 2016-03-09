window.onload = function(){
    var texto  = document.getElementById("texto");
    var resultado ="";
    for (var i = 0; i < 11; i++) {
        resultado+="2 elevado a "+ i + " = "+Math.pow(2,i)+"<br/>";
    }
    texto.innerHTML=resultado;
}