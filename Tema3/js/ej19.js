window.onload = function(){
    var texto  = document.getElementById("texto");
    var resultado ="";
    for (var i=0; i<101; i++){
        if (i%7==0)
            resultado+='<br/>';
        if (parseInt(i.toString().substring(1))==7)
        	resultado+='<br/>';
        resultado+=i+", ";
    }
    texto.innerHTML=resultado;
}