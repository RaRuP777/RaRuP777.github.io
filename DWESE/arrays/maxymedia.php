<?php

	echo "<br><a href='vercodigo.php?src=maxymedia.php'>Ver Codigo</a></br>";	

	$numeros = array (230, 178, 345, 341, 121);
	$suma=0;
	$mayor=0;
	for ($i=0; $i < count($numeros); $i++) { 
		$suma+=$numeros[$i];
		if ($mayor < $numeros[$i])
			$mayor=$numeros[$i];
	}

	echo "El numero mayor del array es: ".$mayor."<br>";
	echo "La media de los numeros es: ".$suma/count($numeros);
?>