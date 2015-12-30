var array1 = [1, 2, 3, 4, 5];
// Devuelve un array sin los elementos que coinciden con
//  el elemento que se pasa como parámetro
Array.prototype.sin = function(elemento) {
  var filtrado = [];
  for(var i=0; i<this.length; i++) {
    if(this[i] !== elemento) {
      filtrado.push(this[i]);
    }
  }
  return filtrado;
}
 
function filtrar (){
  var texto = document.getElementById("texto").value;
  var elemento = parseInt(document.getElementById('elemento').value);
  var resultado = array1.sin(elemento);
  texto.innerHTML=resultado;
}