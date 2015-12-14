function enviar() {
    var numero = parseInt(document.getElementById("numero").value);
    var texto  = document.getElementById("texto").value;
    var resultado ="";
    var a;
    for (var j = 1; j < numero+1; j++) {
        a = 0;
        for (var i = 1; i < j; i++) {
            if (j%i==0);
                a++;
        }
        if (a==2)
            resultado += j + ' ';
    }
    texto.innerHTML=resultado;
}