function primos(){
    var primos = [];
    var acumulador = 0;
    var ventana = window.open("","","width=600, height=300");

    function esPrimo(primo, anterior){
        if (anterior === 1){
            return true;
        }
        if(primo%anterior === 0){
            return false;
        }
        return esPrimo(primo, anterior-1);
    }

    function annadirPrimos(){
        for (var i = 1; i < 101; i++) {
            if(esPrimo(i, i-1)){
                primos.push(i);
            }
        }
    }

    function acumularPrimos(){
        for (var i = 0; i < primos.length; i++) {
            acumulador += primos[i];
        }
    }

    function mostrarPrimos(){
        ventana.document.write("<h1>Los numero primos son: </h1>" + primos + "<br/>");
        ventana.document.write("<h1>Y su suma es: </h1>" + acumulador);
    }

    annadirPrimos();
    acumularPrimos();
    mostrarPrimos();
}