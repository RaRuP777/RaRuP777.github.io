document.write('<h1>Tarea del tema 3</h1>');
document.addEventListener("DOMContentLoaded", nuevaVentana());

function nuevaVentana(){	
	var ventana = window.open();
	ventana.document.write('<h1>Ventana Nueva</h1><br/>');
	ventana.document.write('URL Completa: ' + window.location.href + '<br/>');
	ventana.document.write('Protocolo Utilizado: '+ window.location.protocol + '<br/>');
	ventana.document.write('Nombre del navegador: ' + navigator.userAgent + '<br/>');
    if(navigator.javaEnabled())
        ventana.document.write('En esta ventana esta habilitada para JAVA<br/>');
    else
        ventana.document.write('En esta ventana esta NO habilitada para JAVA<br/>');
}

function abrirVentana(url) {
    window.open(url, "nuevo", "directories=no, location=no, menubar=no, scrollbars=yes, statusbar=no, tittlebar=no, width=800, height=600");
}

function enviar (){
    var nombreApellidos = document.getElementById("nombre").value;
    var dia = document.getElementById("dia").value;
    var mes = document.getElementById("mes").value;
    var anno = document.getElementById("anno").value;
    document.write('Buenos dias ' + nombreApellidos + '<br/>');
    document.write('Tu nombre tiene ' + nombreApellidos.length + ' caracteres, incluidos espacios<br/>');
    document.write('La primera letra E de tu nombre está en la posición: ' + nombreApellidos.toLowerCase().indexOf('e') + '<br/>');
    document.write('La última letra E de tu nombre está en la posición: ' + nombreApellidos.toLowerCase().lastIndexOf('e') + '<br/>');
    document.write('Tu nombre menos las 3 primeras letras es: ' + nombreApellidos.substring(3) + '<br/>');
    document.write('Tu nombre todo en mayúsculas es: ' + nombreApellidos.toUpperCase() + '<br/>');
    var edad = 2015 - parseInt(anno);
    document.write('Tu edad es: ' + edad + '<br/>');
    document.write('Naciste un feliz ' + dia + ' de ' + mes + ' del año ' + anno + '. No te acuerdas pero era ' + diaSemana(dia, mes, anno) + ' y ' + bisiesto(anno) + ' era bisiesto<br/>');
    document.write('El coseno de 90 es ' + Math.cos(Math.PI/2) + '<br/>');
    document.write('El número mayor de (65, 22, 69, 99, 12) es: ' + Math.max(65, 22, 69, 99, 12) + '<br/>');
    document.write('Ejemplo de número al azar entre 1 y 10: ' + Math.round(Math.random()*10) + '<br/>');
}

function diaSemana(dia, mes, anno){   
    //Vector para calcular día de la semana de un año regular.  
    var regular =[0,3,3,6,1,4,6,2,5,0,3,5];   
    //Vector para calcular día de la semana de un año bisiesto.  
    var bisiesto=[0,3,4,0,2,5,0,3,6,1,4,6];   
    //Vector para hacer la traducción de resultado en día de la semana.  
    var semana=['Domingo', 'Lunes', 'Martes', 'Miércoles', 'Jueves', 'Viernes', 'Sábado'];  
    //Día especificado en la fecha recibida por parametro.  
    if((anno % 4 == 0) && !(anno % 100 == 0 && anno % 400 != 0))  
        mes=bisiesto[mes];  
    else  
        mes=regular[mes];  
    //Se retorna el resultado del calculo del día de la semana.  
    return semana[Math.ceil(Math.ceil(Math.ceil((anno-1)%7)+Math.ceil((Math.floor((anno-1)/4)-Math.floor((3*(Math.floor((anno-1)/100)+1))/4))%7)+mes+dia%7)%7)];  
}

function bisiesto (anno) {
	if((anno % 4 == 0) && !(anno % 100 == 0 && anno % 400 != 0))  
        return 'SI';  
    else  
        return 'NO';
}  