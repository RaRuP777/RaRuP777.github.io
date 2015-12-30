function Alumno (nombre,apellido1,apellido2,fechanacimiento){
	if (validarDatos(nombre,apellido1,apellido2,fechanacimiento))
		throw new MyException("Algun valor no ha sido rellenado");
	this.nombre=nombre;
	this.apellido1=apellido1;
	this.apellido2=apellido2;
	this.crearFecha();
}

Alumno.prototype.crearFecha=function(){
	var dia = parseInt(this.fechanacimiento.substring(0,2));
	var mes = parseInt(this.fechanacimiento.substring(3,5));
	var anno = parseInt(this.fechanacimiento.substring(6,10));
	this.fechanacimiento= new Date(anno,mes-1,dia);
	if (comprobarFecha(dia,mes,this.fechanacimiento))
		throw new MyException("La fecha introducida no es correcta, mes o dia inválido");
}

Alumno.prototype.mostrar=function(){
	var ventana = window.open("","","width=300","height=200");
	try{
		ventana.document.write("<html>"+
								"<head>"+
									"<meta charset='UTF-8'>"+
									"<title>Pedro Ramos Ruiz</title>"+
								"</head>"+
								"<body>"+
									"<center>"+
										"<p>Nombre: " + this.nombre + "</p>" +
										"<p>Primer Apellido: " + this.apellido1 + "</p>" +
										"<p>Segundo Apellido: " + this.apellido2 + "</p>" +
										"<p>Edad: " + this.calcularEdad() + "</p>" +
									"</center>"+
								"</body>"+
								"</html");
	}catch(e){
		ventana.document.write(e.message);
	}	
}

Alumno.prototype.calcularEdad=function(){
	var fecha = new Date();
	if (fecha.getFullYear() - this.fechanacimiento.getFullYear() < 0)
		throw new MyException("La fecha introducida es futura");
	return fecha.getFullYear() - this.fechanacimiento.getFullYear();
}

function comprobarFecha (dia,mes,fechanacimiento){
	if (fechanacimiento.getDate() == dia && fechanacimiento.getMonth() == mes)
		return false;
	return true;
}

function validarDatos(nombre,apellido1,apellido2,fechanacimiento){
	if(nombre == "" || apellido1 == "" || apellido2 == "" || fechanacimiento == "")
		return true;
	return false;
}

function MyException(message){
	this.name="MyException";
	this.message=message;
}

function crear(){
	var texto = document.getElementById("texto");
	var nombre = document.getElementById("nombre").value;
	var apellido1 = document.getElementById("apellido1").value;
	var apellido2 = document.getElementById("apellido2").value;
	var fechanacimiento = document.getElementById("fechanacimiento").value;
	try{
		alumno = new Alumno(nombre,apellido1,apellido2,fechanacimiento);
		alumno.mostrar();
	}catch(e){
		texto.innerHTML= e.message;
	}	
}