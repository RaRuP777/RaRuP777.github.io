window.onload = function(){
    
}

//Definición del Objeto y sus métodos con Prototype
function Gato(nombre,dia,mes,anno,raza,peso){
    this.nombre=nombre;
    this.fecha= new Date(anno,mes,dia);
    this.raza=raza;
    this.peso=peso;
    this.estado="";
}

Gato.prototype.jugar=function (){
   
}

Gato.prototype.comer=function (){
   
}

//Funciones para usabilidad del HTML
function generar(){
    var nombre = document.getElementById("nombre").value;
    var dia = document.getElementById("dia").value;
    var mes = document.getElementById("mes").value;
    var anno = document.getElementById("anno").value;
    var raza = document.getElementById("raza").value;
    var peso = document.getElementById("peso").value;
}