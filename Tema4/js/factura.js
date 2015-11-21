// Definición de la clase Cliente
function Cliente(nombre, direccion, telefono, nif) {
  this.nombre = nombre;
  this.direccion = direccion;
  this.telefono = telefono;
  this.nif = nif;
}

// Métodos añadidos con prototype
Cliente.prototype.toString = function() {
  return "Cliente: " + this.nombre +
        ", NIF: " + this.nif +
        ", direccion: " + this.direccion +
        ", telefono: " + this.telefono;
}
 
// Definición de la clase Elemento
function Elemento(descripcion, cantidad, precio) {
  this.descripcion = descripcion;
  this.cantidad = cantidad;
  this.precio = precio;
}

// Métodos añadidos con prototype
Elemento.prototype.toString = function() {
  return "Descripcion: " + this.descripcion +
        ", cantidad: " + this.cantidad +
        ", precio: " + this.precio;
}
 
// Definición de la clase Factura
function Factura(cliente, elementos) {
  this.cliente = cliente;
  this.elementos = elementos;
}
 
// Métodos añadidos con prototype
Factura.prototype.muestraTotal = function() {
  var total=0;
  for(var i=0; i<this.elementos.length; i++) {
    total += this.elementos[i].cantidad * this.elementos[i].precio;
  }
  return "TOTAL = " + total + " euros";
}

// Creación de una factura 
function clienteFactura (){
  var texto = document.getElementById("texto");
  var resultado="";
  var nombre = document.getElementById("nombreCliente").value;
  var id = document.getElementById("nifCliente").value;
  var direccion = document.getElementById("direccion").value;
  var telefono = document.getElementById("telefono").value;

  var elCliente = new Cliente(nombre, direccion, telefono, id);
  var losElementos = [new Elemento("elemento1", "1", "5"),
                    new Elemento("elemento2", "2", "12"),
                    new Elemento("elemento3", "3", "42")
                   ];
  var laFactura = new Factura(elCliente, losElementos);
  resultado = elCliente.toString() + 
              "<br/> y su factura es: " + laFactura.muestraTotal();
  texto.innerHTML=resultado;
}