window.onload = function() {
    var enlaces = document.getElementsByName("a");
    alert("Esta pagina tiene: " + enlaces.length + " enlaces");
    alert("La url del penultimo enlace es: " + enlaces[enlaces.length-1]);
    var cont=0;
    for (var i=0;i<enlaces.length;i++){
        if (enlaces[i].href == "http://prueba"){
            cont++;  
        }
    }
    alert("Hay" + cont + "enlaces que llevan a http://prueba");
    var parrafos = document.getElementsByName("p");
    alert(parrafos[2].getElementsByName("a").length());
}