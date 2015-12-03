<?php
/**
*
* Muestra los tres primeros números pares
*
* @Author: Pedro J. Ramos
* @Version: 1.0
*
*/	
	$acu=0;		
	for ($i=1;$acu<3;$i++){
		if ($i%2 == 0){
			echo "<br>$i</br>";
			$acu++;
		}
	}
	echo "<br><a href='vercodigo.php?src=tresprimerospares.php'>Ver Codigo</a></br>";