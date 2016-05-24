window.onload = function(){
    var elemento=document.getElementById('micanvas');
    var contexto=elemento.getContext('2d');
    if(contexto){
        var imagen = new Image();
        imagen.src = 'imagen.png';
        imagen.onload = function(){
            contexto.drawImage(imagen, 10, 10);
            contexto.drawImage(imagen, 177, 11, 300 , 480, 800, 40, 200, 286);
        }
    }
}