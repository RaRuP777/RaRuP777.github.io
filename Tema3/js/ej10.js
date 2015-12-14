function enviar() {
	var numero = document.getElementById("numero").value;
	var texto = document.getElementById("texto").value;
	var resultado ="";
	if (numero<16)
		resultado = delCeroalQuince(numero);
	else
		resultado = delVeintealNoventa(numero).concat(delCeroalQuince(numero.substring(1)));
	texto.innerHTML=resultado;
}

function delCeroalQuince (numero){
	if (numero==0)
		return "";
	else if (numero==1) 
		return "uno";
    	else if(numero==2) 
    		return "dos";
    		else if(numero==3) 
    			return "tres";
    			else if(numero==4) 
    				return "cuatro";
    				else if(numero==5) 
    					return "cinco";
    					else if(numero==6) 
    						return "seis";
    						else if(numero==7) 
    							return "siete";
    							else if(numero==8) 
    								return "ocho";
    								else if(numero==9) 
    									return "nueve";
											else if(numero==10) 
												return "diez";
		            							else if(numero==11) 
		            								return "once";
		            								else if(numero==12) 
		            									return "doce";
		            									else if(numero==13) 
		            										return "trece";
		            										else if(numero==14) 
		            											return "catorce";
		            											else if(numero==15) 
		            												return "quince";
}	

function delVeintealNoventa(numero)	{
	if (numero>=90 && numero<=99)
		return "Noventa y ";
	else if(numero>=80 && numero<=89)
		return "Ochenta y ";
		else if(numero>=70 && numero<=79)
			return "Setenta y ";
			else if (numero>=60 && numero<=69)
				return "Sesenta y ";
				else if (numero>=50 && numero<=59)
					return "Cincuenta y ";
					else if (numero>=40 && numero<=49)
						return "Cuarenta y ";
						else if (numero>=30 && numero<=39)
							return "Treinta y ";
							else if (numero==20)
								return "Veinte";
								else if (numero>=21 && numero<=29)
									return "Veinti";
									else if(numero>=16 && numero<=19)
	            						return "Dieci";		
}