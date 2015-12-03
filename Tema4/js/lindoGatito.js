//Definición del Objeto y sus métodos con Prototype
function Gato(nombre,dia,mes,anno,raza,peso){
    this.nombre=nombre;
    this.fecha= new Date(anno,mes,dia);
    this.raza=raza;
    this.peso=peso;
    this.estado=true;
    this.ventana=nuevaVentana();
}

Gato.prototype.jugar=function (){
    if (this.estado=true)
        this.peso=this.peso-1; 
}

Gato.prototype.comer=function (){
    if (this.estado=true)
        this.peso=this.peso+1;
}

Gato.prototype.dormir=function(){
    this.estado=false;
}

Gato.prototype.nuevaVentana=function(){
    this.ventana = window.open("","","width=300, height=200");
    ventana.document.write(this.nombre + this.fecha + this.raza + this.peso + this.estado);
}

//Funciones para usabilidad del HTML
function generar(){
    var nombre = document.getElementById("nombre").value;
    var dia = document.getElementById("dia").value;
    var mes = document.getElementById("mes").value;
    var anno = document.getElementById("anno").value;
    var raza = document.getElementById("raza").value;
    var peso = document.getElementById("peso").value;
    gato = new Gato(nombre,dia,mes,anno,raza,peso);
}