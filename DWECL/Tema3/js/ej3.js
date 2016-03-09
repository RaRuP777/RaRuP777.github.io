function enviar() {
    var array = new Array;
    array[1] = document.getElementById("numero1").value;
    array[2] = document.getElementById("numero2").value;
    array[3] = document.getElementById("numero3").value;
    array[4] = document.getElementById("numero4").value;
    array[5] = document.getElementById("numero5").value;
    array[6] = document.getElementById("numero6").value;
    array[7] = document.getElementById("numero7").value;
    var texto  = document.getElementById("texto");
    var resultado ="Numeros introducidos múltiplos de 5 casillas número: ";
    for (var i = 0; i < 8; i++) {
        if (array[i]%5==0)
        	resultado+=i + " ";
    }
    texto.innerHTML=resultado;
}