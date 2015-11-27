window.onload = function(){
    var texto  = document.getElementById("texto").value;
    var resultado ="";
}

//Definición del Objeto y sus métodos con Prototype
function ArrayMatematicos(filas,columnas){
    this.filas=filas;
    this.columnas=columnas;
    this.datos= this.rellenarArray();
}

ArrayMatematicos.prototype.sumar=function (array2){
    total = new ArrayMatematicos(this.filas,this.columnas);
    for (var i = 0; i < this.filas; i++) {
        for (var j = 0; j < this.columnas; j++) {
            total.datos[i][j]= this.datos[i][j] + array2.datos[i][j];
        }
    }
    return total;
}

ArrayMatematicos.prototype.restar=function(array2) {
    total = new ArrayMatematicos(this.filas,this.columnas);
    for (var i = 0; i < this.filas; i++) {
        for (var j = 0; j < this.columnas; j++) {
            total.datos[i][j] = this.datos[i][j] - array2.datos[i][j];
        }
    }
    return total;
}

ArrayMatematicos.prototype.multiplicar=function(array2){
    total = new ArrayMatematicos(this.filas,this.columnas);
    for (var i = 0; i < this.filas; i++){
        for (var j = 0; j < total.columnas; j++){
            for (var k = 0; k < this.columnas; k++) {
                total.datos[i][j] += this.datos[i][k] * array2.datos[k][j];
            }
        }
    }
    return total;
}

ArrayMatematicos.prototype.mostrarArray= function() {
    resultado = "";
    for (var i = 0; i < this.filas; i++) {
        for (var j = 0; j < this.columnas; j++) {
            resultado += this.datos[i][j] + "  ";
        }
        resultado += "<br/>";
    }
    return resultado;
}

ArrayMatematicos.prototype.rellenarArray = function(){
    var datos = new Array();
    for (var i = 0; i < this.filas; i++) {
        datos[i] = new Array();
        for (var j = 0; j < this.columnas; j++)
            datos[i][j] = Math.floor(Math.random()*10);
    }
    return datos;
}

ArrayMatematicos.prototype.transponer=function(){
    total = new ArrayMatematicos(this.filas,this.columnas);
    for (var i = 0; i < total.filas; i++) {
        for (var j = 0; j < total.columnas; j++) {
            total.datos[i][j] = this.datos[j][i];
        }
    }
    return total;
}

//Funciones para usabilidad del HTML
function generar(){
    var filas1 = document.getElementById("filas1").value;
    var filas2 = document.getElementById("filas2").value;
    var columnas1 = document.getElementById("columnas1").value;
    var columnas2 = document.getElementById("columnas2").value;
    array1 = new ArrayMatematicos(filas1,columnas1);
    array2 = new ArrayMatematicos(filas2,columnas2);
    resultado = "Primer Array: <br/>" + array1.mostrarArray() + "Segundo Array: <br/>" + array2.mostrarArray();
    texto.innerHTML = resultado;
}

function sumar(){
    array = array1.sumar(array2);
    resultado = "Resultado de la Suma: <br/>" + array.mostrarArray();
    texto.innerHTML = resultado;
}

function restar(){
    array = array1.restar(array2);
    resultado = "Resultado de la Resta: <br/>" + array.mostrarArray();
    texto.innerHTML = resultado;
}

function multiplicar(){
    array = array1.multiplicar(array2);
    resultado = "Resultado de la Multiplicación: <br/>" + array.mostrarArray();
    texto.innerHTML = resultado;
}

function trasponer(){
    array = array1.transponer();
    resultado = "El array1 traspuesto es: <br/>" + array.mostrarArray();
    texto.innerHTML = resultado;
}