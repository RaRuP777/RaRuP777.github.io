<?php

	echo "<br><a href='vercodigo.php?src=alumnos.php'>Ver Codigo</a></br>";	

	$alumnos = array (	array("Pedro","Ramos","Ruiz","D2º"),
						array("Noelia","Gonzalez","Martinez","A1º"),
						array("Pablo","Ortega","Marquez","D1º")
						);

	$usuarios=array();

	for ($i=0; $i < count($alumnos); $i++) { 
		$usuarios[$i]=$alumnos[$i][3].substr($alumnos[$i][1],0,2).substr($alumnos[$i][2],0,2).substr($alumnos[$i][0],0,2);
	}

	foreach ($usuarios as $key => $value) {
		echo $value."<br>";
	}
?>