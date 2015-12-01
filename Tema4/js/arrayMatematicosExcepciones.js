window.onload = function(){
    var texto  = document.getElementById("texto").value;
    var error  = document.getElementById("error").value;
    var resultado ="";
}

//Definición del Objeto y sus métodos con Prototype
function ArrayMatematicos(filas,columnas){
    if(validarCampos(filas) || validarCampos(columnas))
        throw new MyException("Algún valor introducido no es válido");
    error.innerHTML = MyException.mensaje;
    this.filas=filas;
    this.columnas=columnas;
    this.datos;
    this.rellenarArray();
}

ArrayMatematicos.prototype.rellenarArray = function(){
    this.datos = new Array(this.filas);
    for (var i = 0; i < this.filas; i++) {
        this.datos[i] = new Array(this.columnas);
        for (var j = 0; j < this.columnas; j++)
            this.datos[i][j] = Math.floor(Math.random()*10);
    }
}

ArrayMatematicos.prototype.coincideDimensiones = function (array2){
    if(tris.filas == array2.filas && this.columnas == array2.columnas)
        return true;
    else
        return false;
}

ArrayMatematicos.prototype.sumar=function (array2){
    total = new ArrayMatematicos(this.filas,this.columnas);
    if (!this.coincideDimensiones(array2))
        throw new MyException("Los arrays tienen dimensiones no compatibles");
    for (var i = 0; i < this.filas; i++) {
        for (var j = 0; j < this.columnas; j++) {
            total.datos[i][j]= this.datos[i][j] + array2.datos[i][j];
        }
    }
    return total;
}

ArrayMatematicos.prototype.restar=function(array2) {
    total = new ArrayMatematicos(this.filas,this.columnas);
    if (!this.coincideDimensiones(array2))
        throw new MyException("Los arrays tienen dimensiones no compatibles");    
    for (var i = 0; i < this.filas; i++) {
        for (var j = 0; j < this.columnas; j++) {
            total.datos[i][j] = this.datos[i][j] - array2.datos[i][j];
        }
    }
    return total;
}

ArrayMatematicos.prototype.multiplicar=function(array2){
    total = new ArrayMatematicos(this.filas,this.columnas);
    if (!this.coincideDimensiones(array2))
        throw new MyException("Los arrays tienen dimensiones no compatibles");
    for (var i = 0; i < this.filas; i++){
        for (var j = 0; j < total.columnas; j++){
            for (var k = 0; k < this.columnas; k++) {
                total.datos[i][j] += this.datos[i][k] * array2.datos[k][j];
            }
        }
    }
    return total;
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

//Excepcion
function MyException (message){
    this.message = message;
}

function validarCampos(valor){
    if(isNaN(valor) || valor < 2 || !(valor.typeOf() == Number) {
        throw new MyException ("Algún valor no es correcto");
    }
    else
        return true;
}

//Funciones para usabilidad del HTML
function generar(){
    var filas1 = document.getElementById("filas1").value;
    var filas2 = document.getElementById("filas2").value;
    var columnas1 = document.getElementById("columnas1").value;
    var columnas2 = document.getElementById("columnas2").value;
    if (validarCampos(filas1) && validarCampos(filas2) && validarCampos(columnas1) && validarCampos(columnas2)){
        try {
            array1 = new ArrayMatematicos(filas1,columnas1);
            array2 = new ArrayMatematicos(filas2,columnas2);
            resultado = "Primer Array: <br/>" + array1.mostrarArray() + "Segundo Array: <br/>" + array2.mostrarArray();
            texto.innerHTML = resultado;
        } catch (e) {
            error.innerHTML = e.message;
        }
    }
}

function sumar(){
    try {
        array = array1.sumar(array2);
        resultado = "Resultado de la Suma: <br/>" + array.mostrarArray();
        texto.innerHTML = resultado;
    } catch (e){
        error.innerHTML = e.message;
    }
    
}

function restar(){
    try {
    array = array1.restar(array2);
    resultado = "Resultado de la Resta: <br/>" + array.mostrarArray();
    texto.innerHTML = resultado;
    } catch (e){
        error.innerHTML = e.message;
    }
}

function multiplicar(){
    try {
    array = array1.multiplicar(array2);
    resultado = "Resultado de la Multiplicación: <br/>" + array.mostrarArray();
    texto.innerHTML = resultado;
    } catch (e){
        error.innerHTML = e.message;
    }   
}

function trasponer(){
    array = array1.transponer();
    resultado = "El array1 traspuesto es: <br/>" + array.mostrarArray();
    texto.innerHTML = resultado;
}