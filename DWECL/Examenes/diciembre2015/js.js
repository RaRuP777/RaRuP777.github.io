function generarDocumentoEjercicio1(){
	var fecha = new Date();
	var fincurso = new Date(2016,5,20);
	var ventana = window.open("","","width=300","height=300");
	ventana.document.write("<html>"+
							"<head>"+
								"<meta charset='UTF-8'>"+
								"<title>Pedro Ramos Ruiz</title>"+
								"<script type='text/javascript'"+ 
									"src='fecha.js'>"+
								"</script>"+
							"</head>"+
							"<body>"+
								"<center>"+
									"<h1>Pedro Ramos Ruiz</h1>"+
									"<p>Hoy es "+ diaSemana(fecha.getDay()) + ", " + fecha.getDate() + " de " + mes(fecha.getMonth()) + " de " + fecha.getFullYear() + "</p>"+
									"<p>El fin de curso será el " + diaSemana(fincurso.getDay()) + ", " + fincurso.getDate() + " de " + mes(fincurso.getMonth()) + " de " + fincurso.getFullYear() + "</p>"+
									"<p>Y sólo quedan " + Math.round(calcularDias(fecha.getDate(),fecha.getMonth(),fincurso.getDate(),fincurso.getMonth())) +" días</p>"+
									"<input type='button' value='Cerrar' onclick='cerrar()'/>"+
								"</center>"+
							"</body>"+
							"</html");
}

function diaSemana(dia){
	switch (dia){
		case 1:
			return "Lunes";
		case 2:
			return "Martes";
		case 3:
			return "Miercoles";
		case 4:
			return "Jueves";
		case 5:
			return "Viernes";
		case 6:
			return "Sábado";
		case 0:
			return "Domingo";
	}
}

function mes(mes){
	switch (mes){
		case 0:
			return "Enero";
		case 1:
			return "Febrero";
		case 2:
			return "Marzo";
		case 3:
			return "Abril";
		case 4:
			return "Mayo";
		case 5:
			return "Junio";
		case 6:
			return "Julio";
		case 7:
			return "Agosto";
		case 8:
			return "Septiembre";
		case 9:
			return "Octubre";
		case 10:
			return "Noviembre";
		case 11:
			return "Diciembre";
	}
}

function calcularDias(dia1,mes1,dia2,mes2){
	var difmeses = mes2 - mes1;
	if (difmeses < 0)
		return (-difmeses*30)+(dia2-dia1);
	else
		return (difmeses*30)-(dia2-dia1);
}