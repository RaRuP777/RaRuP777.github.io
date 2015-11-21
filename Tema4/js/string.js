// Funcion que trunca la longitud de una cadena
String.prototype.truncar = function(longitud) {
  if(this.length > longitud) {
    return this.substring(0, longitud);
  }
  else {
    return this;
  }
}

// Funcion que trunca la longitud de una cadena y añade
//  un indicador de cadena truncada
String.prototype.truncar = function(longitud, indicador) {
  if(this.length > longitud) {
    return this.substring(0, longitud) + "..." + indicador;
  }
  else {
    return this;
  }
}

function truncar(){
  var texto = document.getElementById("texto");
  var resultado="";
  var cadena = document.getElementById("cadena").value;
  var truncar = document.getElementById("truncar").value;
  var indicador = document.getElementById('indicador').value;
  resultado = cadena.truncar(truncar,indicador);
  texto.innerHTML=resultado;
}