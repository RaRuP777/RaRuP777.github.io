<?php
	/**
	* Rellena un array con las asignaturas y sus horas y las muestra
	*
	*@Author: Pedro J. Ramos
	*@Version: 1.0
	*/
	echo "<br><a href='vercodigo.php?src=arrayasignaturas.php'>Ver Codigo</a></br>";	
	
	$asignaturas=array(
		"DAWEB"=>3,
		"HLC"=>3,
		"EINEM"=>4,
		"DIWEB"=>6,
		"DWECL"=>6,
		"DEWSE"=>8);
	foreach ($asignaturas as $nombre => $horas){
		echo "<br/>La asignatura: ".$nombre." tiene ".$horas." horas" ;
	}
?>