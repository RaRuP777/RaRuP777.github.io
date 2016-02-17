    function dibujarCanvas(){
      var canvas = document.getElementById('miCanvas');
      var contexto = canvas.getContext('2d');
      var grados90 = (Math.PI/180)*90;
      var grados180 = (Math.PI/180)*180;
      var grados270 = (Math.PI/180)*270;
      var x=50; //  x centro espiral 
      var y=50; //  y centro espiral 
      var r=0; // radio inicial
      var incre=3; // incremento del radio
      var vueltas=5; // vueltas
      contexto.beginPath();
      for(var i=1;i<=vueltas;i++){
        incre+1;
        contexto.arc(x,y,r=r+incre,            0,grados90,false);
        contexto.arc(x,y-incre,r=r+incre,      grados90,grados180,false);
        contexto.arc(x+incre,y-incre,r=r+incre,grados180,grados270,false);
        contexto.arc(x+incre,y,r=r+incre,      grados270,0,false); 
      }
      contexto.lineWidth = 4;         // ancho de línea
      contexto.strokeStyle =  'rgb(110,140,204)';
      contexto.stroke();              // dibujar trazo
      //segunda espiral
      contexto.beginPath();
      r=0;
      for(var i=1;i<=vueltas;i++){
        incre+1;
        contexto.arc(x+5,y+5,r=r+incre,            0,grados90,false);
        contexto.arc(x+5,y+5-incre,r=r+incre,      grados90,grados180,false);
        contexto.arc(x+5+incre,y+5-incre,r=r+incre,grados180,grados270,false);
        contexto.arc(x+5+incre,y+5,r=r+incre,      grados270,0,false); 
      }
      contexto.lineWidth = 4;         // ancho de línea
      contexto.strokeStyle =  'rgb(255,0,0)';
      contexto.stroke();              // dibujar trazo
      //tercera espiral
      contexto.beginPath();
      r=0;
      for(var i=1;i<=vueltas;i++){
        incre+1;
        contexto.arc(x+10,y+10,r=r+incre,            0,grados90,false);
        contexto.arc(x+10,y+10-incre,r=r+incre,      grados90,grados180,false);
        contexto.arc(x+10+incre,y+10-incre,r=r+incre,grados180,grados270,false);
        contexto.arc(x+10+incre,y+10,r=r+incre,      grados270,0,false); 
      }
      contexto.lineWidth = 4;         // ancho de línea
      contexto.strokeStyle =  'rgb(255,235,70)';
      contexto.stroke();              // dibujar trazo
}