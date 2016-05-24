var elemento=document.getElementById('micanvas');
var ctx=elemento.getContext('2d');

dibujarAro(60,60,"blue");
dibujarAro(180,60,"black");
dibujarAro(300,60,"red");
dibujarAro(120,100,"yellow");
dibujarAro(240,100,"green");

function dibujarAro (coordenadaX, coordenadaY, color){
  ctx.beginPath();
  ctx.arc(coordenadaX,coordenadaY,50,0,(Math.PI/180)*360,true);
  ctx.fillStyle="rgba(255,255,0,0)";
  ctx.fill();
  ctx.lineWidth = 10;
  ctx.strokeStyle = color;
  ctx.stroke();
}