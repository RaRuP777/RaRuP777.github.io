function Universitario(nombre, apellido1, apellido2, fechaNac){
	this.nombre = nombre;
	this.apellido1 = apellido1;
	this.apellido2 = apellido2;
	this.fechaNac = fechaNac;
}

Universitario.prototype.calcularEdad = function(){
	var hoy = new Date();
	var edad = hoy.getFullYear() - this.fechaNac.getFullYear();
	if (hoy.getMonth() < this.fechaNac.getMonth())
       edad--;
    if (hoy.getMonth() == this.fechaNac.getMonth()){
    	if (hoy.getDate() < this.fechaNac.getDate())
    		edad--;
    }
	return edad;
} 

Universitario.prototype.mostrar = function() {
	var edad = this.calcularEdad();
	var ventana = window.open('', '', 'width=300, height=200');
	ventana.document.open();
	ventana.document.write(	'<html>'+
							'<body>'+
							'		<p>Nombre: ' 			+ this.nombre + '</p>' +
							'		<p>Primer Apellido: ' 	+ this.apellido1 +'</p>'+
							'		<p>Segundo Apellido: '	+ this.apellido2+'</p>'+
							'		<p>Edad: '+ edad + '</p>'+
							'</body>'+
							'</html>');
	ventana.document.close();	
}