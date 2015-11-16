window.onload = function(){
    var texto  = document.getElementById("texto");
    var resultado ="";
    for (var i = 0; i < 11; i++) {
        resultado+=Math.pow(i,2)+"<br/>";
    }
    texto.innerHTML=resultado;
}