<?php
	$mes=2;
	$anno=400;
	echo "El numero de días de este mes es: "; 
	switch ($mes) {
		case '1':
		case '3':
		case '5':
		case '7':
		case '8':
		case '10':
		case '12':
			echo "31";
			break;
		case '4':
		case '6':
		case '9':
		case '11':
			echo "30";
			break;
		case '2':
			if($anno%4==0)
				if($anno%100==0)
					if ($anno%400!=0){
						echo "29";
						break; 
					}		 
    		else  
        		echo "28";
        		break;
		default:
			echo "Ninguno pues el mes es incorrecto";
	}
	echo "<br><a href='vercodigo.php?src=Estructuras de Control ej2.php'>Ver Codigo</a></br>";
?>