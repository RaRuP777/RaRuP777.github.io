function enviar() {
    var array = new Array;
    array[1] = document.getElementById("numero1");
    array[2] = document.getElementById("numero2");
    array[3] = document.getElementById("numero3");
    array[4] = document.getElementById("numero4");
    array[5] = document.getElementById("numero5");
    array[6] = document.getElementById("numero6");
    array[7] = document.getElementById("numero7");
    var texto  = document.getElementById("texto");
    var resultado ="Numeros introducidos múltiplos de 5: ";
    for (var i = 0; i < 8; i++) {
        if (array[i]%5==0)
        	resultado+=i + " ";
    }
    texto.innerHTML=resultado;
}