function enviar() {
	var texto = document.getElementById("texto");
	var dia = parseInt(document.getElementById("dia").value);
	var mes = document.getElementById("mes").value.toLowerCase();
	var anno = parseInt(document.getElementById("anno").value);
	if (comprobarFecha (dia, mes, anno))
		texto.innerHTML='La fecha introducida es correcta';
	else
		texto.innerHTML='La fecha introducida no es correcta';
}

function comprobarFecha (dia,mes,anno){
	switch (mes){
		case "enero":
		case "marzo":
		case "mayo":
		case "julio":
		case "agosto":
		case "octubre":
		case "diciembre":
			if (dia<31)
				return true;
			else
				return false;
		case "abril":
		case "junio":
		case "septiembre":
		case "noviembre":
			if(dia<30)
				return true;
			else
				return false;
		case "febrero":
			if (bisiesto(anno)){
				if(dia<29)
					return true;
				else
					return false;				
			}
			else{
				if(dia<28)
					return true;
				else
					return false;				
			}		
	}

}

function bisiesto (anno) {
	if((anno % 4 == 0) && !(anno % 100 == 0 && anno % 400 != 0))  
        return true;  
    else  
        return false;
}  
