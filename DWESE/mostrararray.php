<?php
	/**
	* Rellena un array con numeros del 1 al 10 y lo recorre y lo muestra 
	*
	*@Author: Pedro J. Ramos
	*@Version: 1.0
	*/
	echo "<br><a href='vercodigo.php?src=mostrararray.php'>Ver Codigo</a></br>";	
	
	$numeros=array(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
	foreach ($numeros as $valor){
		echo "<br/>.$valor";
	}
?>