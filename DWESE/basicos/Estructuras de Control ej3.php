<?php
	$dia=13;
	$mes=10;
	$anno=1987;
	$edad=0;
	echo "Tu edad actual es: ";
	$edad=2016-$anno;
	if ($mes>10)
		$edad--;
	if ($mes==10)
		if($dia>12)
			$edad--;
	echo $edad;
	echo "<br><a href='vercodigo.php?src=Estructuras de Control ej3.php'>Ver Codigo</a></br>";
?>