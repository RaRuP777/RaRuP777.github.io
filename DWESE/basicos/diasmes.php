<?php
/**
*
* Dado un mes nos dice cuantos dias tiene
*
* @Author: Pedro J. Ramos
* @Version: 1.0
*
*/	
	$mes=date('m');
	$anno=date('Y');
	switch ($mes){
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			$dias=31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			$dias=30;
			break;
		case 2:
			if ($anno%4==0){
				if ($anno%4!=100){
					if ($anno%400==0){
						$dias=29;
					}
				}
			}
			else {
				$dias=28;
			}
			break;
	}
	echo "Estamos el mes $mes y tiene $dias dias";
	echo "<br><a href='vercodigo.php?src=diasmes.php'>Ver Codigo</a></br>";