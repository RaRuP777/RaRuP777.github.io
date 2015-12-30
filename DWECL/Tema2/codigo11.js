window.onload = function() {
    var enlaces = document.getElementsByName("a");
    alert ("Esta página tiene: "+enlaces.lenght" enlaces<br/>");
    alert ("La url del penúltimo enlace es: "+enlaces[enlaces.lenght-1].href+"<br/>");
    var cont=0;
    for (var i=0;i<enlaces.lenght();i++){
        if (enlaces[i].href == "http://prueba"){
            cont++;  
        }
    }
    alert ("Hay"+cont+"enlaces que llevan a http://prueba<br/>");
    var parrafos=document.getElementsByName("p");
    alert (parrafos[2].getElementsByName("a").lenght());
}