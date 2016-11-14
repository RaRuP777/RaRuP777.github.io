<?php
	for ($i=1; $i < 11; $i++) {
		echo "<br><br><b>Tabla del ".$i."</b>";
		for ($j=0; $j < 11; $j++) { 
			echo "<br>".$i." x ".$j." = ".$i*$j;
		}
	}
	echo "<br><a href='vercodigo.php?src=Estructuras de Control ej8.php'>Ver Codigo</a></br>";	
?>
