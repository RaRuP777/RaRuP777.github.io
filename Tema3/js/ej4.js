function enviar() {
    var numero = parseInt(document.getElementById("numero"));
    var texto  = document.getElementById("texto");
    var resultado ="";
    var a=0;
    for (var i = 1; i < numero+1; i++) {
        if (numero%i==0)
        	a++;
    }
    if (a==2)
    	resultado='El numero introducido es primo';
    else
    	resultado=a+'El numero introducido no es primo';
    texto.innerHTML=resultado;
}