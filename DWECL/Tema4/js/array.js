var array1 = [0, 1, 2];

// Funcion que añade elementos al final del array
Array.prototype.anadir = function(elemento) {
  this[this.length] = elemento;
}
 
// Funcion que comprueba si un array contiene un elemento
Array.prototype.contiene = function(elemento) {
  for(var i=0; i<this.length; i++) {
    if(this[i] === elemento) {
      return true;
    }
  }
  return false;
}
 
function anadirAlFinal (){
  var texto = document.getElementById("texto");
  var elemento = document.getElementById('elemento').value;
  array1.anadir(elemento);
  texto.innerHTML=array1;
}

function anadirSinDuplicados (){
  var texto = document.getElementById("texto");
  var elemento2 = document.getElementById('elemento2').value;
  if (!array1.contiene(elemento2))
    array1.anadir(elemento2);
  texto.innerHTML=array1;
}