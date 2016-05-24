var elemento=document.getElementById('micanvas');
var ctx=elemento.getContext('2d');

var grd=ctx.createLinearGradient(0,0,170,0);
grd.addColorStop(0,"cyan");
grd.addColorStop(0.6,"grey");
grd.addColorStop(1,"brown");
ctx.fillStyle=grd;
ctx.fillRect(0,0,360,160);

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
