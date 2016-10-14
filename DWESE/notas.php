<?php
	/**
	* Nota de los alumnos de 2º DAW para el módulo DWES. 
	*
	*@Author: Pedro J. Ramos
	*@Version: 1.0
	*/
	echo "<br><a href='vercodigo.php?src=notas.php'>Ver Codigo</a></br>";	
	
	$notas=array(	"Fran"=>array(rand(1,10),rand(1,10),rand(1,10)),
			"David"=>array(rand(1,10),rand(1,10),rand(1,10)),
			"Rafa Miranda"=>array(rand(1,10),rand(1,10),rand(1,10)),
			"Emanuel"=>array(rand(1,10),rand(1,10),rand(1,10)),
			"Daniel"=>array(rand(1,10),rand(1,10),rand(1,10)),
			"Ulises"=>array(rand(1,10),rand(1,10),rand(1,10)),
			"Elisa"=>array(rand(1,10),rand(1,10),rand(1,10)),
			"JA Romero"=>array(rand(1,10),rand(1,10),rand(1,10)),
			"Raúl"=>array(rand(1,10),rand(1,10),rand(1,10)),
			"JACubero"=>array(rand(1,10),rand(1,10),rand(1,10)),
			"Javier Benitez"=>array(rand(1,10),rand(1,10),rand(1,10)),
			"Rafa Navarro"=>array(rand(1,10),rand(1,10),rand(1,10)),
			"Pablo Durán"=>array(rand(1,10),rand(1,10),rand(1,10)),
			"Pedro J."=>array(rand(1,10),rand(1,10),rand(1,10)),
			"Jesús"=>array(rand(1,10),rand(1,10),rand(1,10)),
			"Coral"=>array(rand(1,10),rand(1,10),rand(1,10)),
			"Pablo Sánchez"=>array(rand(1,10),rand(1,10),rand(1,10)),
			"Javier Mariscal"=>array(rand(1,10),rand(1,10),rand(1,10)),
			"Paz"=>array(rand(1,10),rand(1,10),rand(1,10)),
			"Estela"=>array(rand(1,10),rand(1,10),rand(1,10)),
			"Annais"=>array(rand(1,10),rand(1,10),rand(1,10)),
			);
	

	echo "<center><table>";
	foreach ($notas as $key => $valor){
		echo "<tr>";
		echo "<td>".$key."</td>";
		for($i = 0; $i < 3; $i++) {
			echo "<td>".$notas[$key][$i]."  </td>";
		}
		echo "</tr>";
	}
	echo "</center></table>"
?>