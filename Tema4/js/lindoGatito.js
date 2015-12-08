gato = new Gato();

//Definición del Objeto y sus métodos con Prototype
function Gato(nombre,dia,mes,anno,raza,peso){
    if (peso < 2 || peso > 15)
        throw new MyException("El peso introducido no es correcto");
    this.nombre=nombre;
    this.fecha= new Date(anno,mes,dia);
    this.raza=raza;
    this.peso=peso;
    this.estado=true;
    this.activo=true;
    this.foto="gatito.png";
    this.ventana;
}

Gato.prototype.jugar=function (){
    if (!this.estado){
        this.ventana.document.getElementById("jugar").disabled=true;
        this.ventana.document.getElementById("comer").disabled=true;
        this.ventana.document.getElementById("dormir").disabled=true;
        throw new MyException("La sociedad protectora de animales te ha retirado la custodia de" + this.nombre);
    }
    if(!this.activo)
        throw new MyException("En estos momentos " + this.nombre + " esta durmiendo");
    this.peso -= 1;
    if(this.peso < 2)
        this.estado=false;
}

Gato.prototype.comer=function (){
    if (!this.estado){
        this.ventana.document.getElementById("jugar").disabled=true;
        this.ventana.document.getElementById("comer").disabled=true;
        this.ventana.document.getElementById("dormir").disabled=true;
        throw new MyException("La sociedad protectora de animales te ha retirado la custodia de" + this.nombre);
    }
    if(!this.activo)
        throw new MyException("En estos momentos " + this.nombre + " esta durmiendo");
    this.peso += 1;
    if(this.peso > 15)
        this.estado=false;
}

Gato.prototype.dormir=function(){
    if (!this.estado){
        this.ventana.document.getElementById("jugar").disabled=true;
        this.ventana.document.getElementById("comer").disabled=true;
        this.ventana.document.getElementById("dormir").disabled=true;
        throw new MyException("La sociedad protectora de animales te ha retirado la custodia de" + this.nombre);
    }
    if (this.estado){
        this.ventana.document.getElementById("jugar").disabled=true;
        this.ventana.document.getElementById("comer").disabled=true;
        this.estado=false;
    }
    else{
        this.ventana.document.getElementById("jugar").disabled=false;
        this.ventana.document.getElementById("comer").disabled=false;
        this.estado=true;
    } 
}

Gato.prototype.ventana=function(){
    this.ventana = window.open("","","width=900, height=600");
    this.ventana.document.write("<html><head><title>Lindo Gatito - Pedro J. Ramos</title>" +
                                "<script type='text/javascript' src='js/lindoGatito.js'></script>" +
                                "<link rel='stylesheet' href='../css/form.css'></head>" +
                                "<body>" +
                                "<center><img id='foto' src='img/"+ this.foto +"' height='250' width='250'>" +
                                "<br/>Me llamo " + this.nombre + 
                                "<br/>tengo " + this.calcularEdad() + "años" + 
                                "<br/>soy de raza " + this.raza + 
                                "<br/>y peso " + this.peso +
                                "<hr/><form><fieldset><p id='texto'>" +
                                "<input type='button' id='jugar' value='Jugar' onclick='jugar()'' />" +
                                "<input type='button' id='comer' value='Comer' onclick='comer()'' />" +
                                "<input type='button' id='dormir' value='Dormir' onclick='dormir()'' /><br>" +
                                "</p></fieldset></form></body></html>");
    this.ventana.document.close();
}

Gato.prototype.calcularEdad=function(){
    var fechaActual = new Date();
    return fechaActual.getFullYear() - this.fecha.getFullYear();
}

//Excepcion
function MyException (message){
    this.name="MyException";
    this.message=message;
}
//Funciones para usabilidad del HTML
function generar(){
    var nombre = document.getElementById("nombre").value;
    var dia = document.getElementById("dia").value;
    var e = document.getElementById("mes");
    var mes = e.options[e.selectedIndex].value;
    var anno = document.getElementById("anno").value;
    e = document.getElementById("raza");
    var raza = e.options[e.selectedIndex].value;
    var peso = document.getElementById("peso").value;
    try{
        gato = new Gato(nombre,dia,mes,anno,raza,peso);
        gato.ventana();
    } catch (e) {
        alert(e.message);
    }
}

function comer(){
    try{
        gato.comer();
        gato.foto = "comer.jpg";
        gato.ventana();
    } catch (e) {
        alert(e.message);
    }
}

function jugar(){
    try{
        gato.jugar();
        gato.foto = "jugar.png";
        gato.ventana();
    } catch (e) {
        alert(e.message);
    }
}

function dormir(){
    try{
        gato.dormir();
        gato.foto = "dormir.png";
        gato.ventana();
    } catch (e) {
        alert(e.message);
    }
}