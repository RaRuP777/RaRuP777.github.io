<?php

	echo "<br><a href='vercodigo.php?src=multas.php'>Ver Codigo</a></br>";	

	$multas = array (
						array ("ABC1234", "22/12/15", "Falta Recibo", 100),
						array ("DEF5678", "13/10/15", "Excede Tiempo", 30),
						array ("GHJ9012", "02/11/15", "Falta Recibo", 100),
						array ("KLM3456", "21/03/16", "Excede Tiempo", 30)
					);
	$suma=0;
	for ($i=0; $i < count($multas); $i++) { 
		for ($k=0; $k < count($multas[$i]); $k++) { 
			$suma+=$multas[$i][3];
		}
	}

	foreach ($multas as $key => $value) {
		echo $value[0]." - ".$value[1]." - ".$value[2]." - ".$value[3]."<br>";
	}

	echo "<br>El total de las multas es: ".$suma;
?>