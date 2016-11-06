<?php
/**
*
* Dado un año, dice si es bisiesto o no
*
* @Author: Pedro J. Ramos
* @Version: 1.0
*
*/	
	$anno=2015;
	if ($anno%4==0){
		if ($anno%4!=100){
			if ($anno%400==0){
				echo "El $anno es bisiesto";
			}
	}
	else {
				echo "El $anno no es bisiesto";
	}
	echo "<br><a href='vercodigo.php?src=annobisiesto.php'>Ver Codigo</a></br>";