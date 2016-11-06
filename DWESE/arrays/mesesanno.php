<?php
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