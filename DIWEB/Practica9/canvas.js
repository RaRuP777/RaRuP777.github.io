var miColor = "blue";
var miotrocolor = "grey";
var mitercercolor = "black";
var escala = 0.5;

var c=document.getElementById("iconosobreMi");
var ctx = c.getContext("2d");

ctx.fillStyle = miColor;
ctx.beginPath();
ctx.arc(escala*50,escala*25,escala*20,0,Math.PI*2,true);
ctx.closePath();
ctx.fill();

ctx.fillStyle = miColor;
ctx.beginPath();
ctx.arc(escala*50,escala*90,escala*40,0,Math.PI,true);
ctx.closePath();
ctx.fill();

var c=document.getElementById("iconoContacto");
var ctx = c.getContext("2d");

ctx.fillStyle = miotrocolor;
ctx.beginPath();
ctx.arc(escala*50-10,escala*25,escala*20,0,Math.PI*2,true);
ctx.closePath();
ctx.fill();

ctx.fillStyle = miotrocolor;
ctx.beginPath();
ctx.arc(escala*50-10,escala*90,escala*40,0,Math.PI,true);
ctx.closePath();
ctx.fill();

ctx.fillStyle = miColor;
ctx.beginPath();
ctx.arc(escala*50,escala*25,escala*20,0,Math.PI*2,true);
ctx.closePath();
ctx.fill();

ctx.fillStyle = miColor;
ctx.beginPath();
ctx.arc(escala*50,escala*90,escala*40,0,Math.PI,true);
ctx.closePath();
ctx.fill();

var c=document.getElementById("iconoInicio");
var ctx = c.getContext("2d");

ctx.fillStyle = miColor;
ctx.beginPath();
ctx.arc(escala*50,escala*50,escala*40,0,Math.PI*2,true);
ctx.closePath();
ctx.fill();

ctx.fillStyle = mitercercolor;
ctx.beginPath();
ctx.arc(escala*50,escala*50,escala*30,0,Math.PI*2,true);
ctx.closePath();
ctx.fill();

ctx.fillStyle = miColor;
ctx.beginPath();
ctx.arc(escala*50,escala*50,escala*20,0,Math.PI*2,true);
ctx.closePath();
ctx.fill();

var c=document.getElementById("iconoNoticias");
var ctx = c.getContext("2d");

ctx.fillStyle = miColor;
ctx.beginPath();
ctx.arc(escala*50,escala*50,escala*20,0,Math.PI*2,true);
ctx.closePath();
ctx.fill();

ctx.fillStyle = miColor;
ctx.beginPath();
ctx.arc(escala*50,escala*50,escala*40,0,Math.PI,true);
ctx.closePath();
ctx.fill();