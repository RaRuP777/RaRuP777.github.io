var elemento=document.getElementById('micanvas');
var contexto=elemento.getContext('2d');

function pintar(){
  var i;
  var j;
  for (j = 0; j < 3; j++){
    for (i = 0; i < 3; i++) {
      contexto.fillStyle=colorAleatorio();
      contexto.fillRect(i*150,j*150,150,150);
      contexto.strokeStyle='black';
      contexto.strokeRect(i*150,j*150,150,150);
    }
  }
}

function colorAleatorio(){
    color = Math.ceil(Math.random()*9);
    switch (color){
      case 1:
        return 'red';
      case 2:
        return 'green';
      case 3:
        return 'yellow';
      case 4:
        return 'orange';
      case 5:
        return 'pink';
      case 6:
        return 'brown';
      case 7:
        return 'purple';
      case 8:
        return 'black';
      default:
        return 'blue';
    }
}

setInterval(pintar,500);
