<?php
	/**
	* Rellena un array con los meses del a&ntilde;o y lo muestra 
	*
	*@Author: Pedro J. Ramos
	*@Version: 1.0
	*/
	echo "<br><a href='vercodigo.php?src=mesesanno.php'>Ver Codigo</a></br>";	
	
	$meses=array("Enero",
				"Febrero",
				"Marzo",
				"Abril",
				"Mayo",
				"Junio",
				"Julio",
				"Agosto",
				"Septiembre",
				"Octubre",
				"Noviembre",
				"Diciembre");
	foreach ($meses as $valor){
		echo "<br/>$valor";
	}
?>