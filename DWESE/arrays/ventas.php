<?php

	echo "<br><a href='vercodigo.php?src=ventas.php'>Ver Codigo</a></br>";	

	$ventas = array (230.35, 178.4, 345.7, 341.92, 121.01);
	$suma=0;
	for ($i=0; $i < count($ventas); $i++) { 
		$suma+=$ventas[$i];
	}

	echo 
	"Las ventas totales de la tienda son: ".$suma."<br>
	El promedio de ventas de la tienda es: ".$suma/count($ventas);
?>