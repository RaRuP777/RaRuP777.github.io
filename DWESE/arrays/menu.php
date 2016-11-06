<?php

	echo "<br><a href='vercodigo.php?src=menu.php'>Ver Codigo</a></br>";	
	
	$menu=array(	"Primeros"=> array(
									array("Paella","Foto",5),
									array("Ensalada","Foto",6),
									array("Salmorejo","Foto",7)
									),
					"Segundos"=> array (
									array("Pez Espada","Foto",3),
									array("Chuleta Cordero","Foto",4),
									array("Solomillo Iberico","Foto",5),
									),
					"Postres"=> array (	
									array("Cafe","Foto",1),
									array("Yogurt","Foto",2),
									array("Fruta","Foto",2),
									),
			);
	echo "<center><h1>Restaurante Random</h1>";
	echo "<h2>Carta Completa</h2>";
	echo "<table>";
	foreach ($menu as $key => $valor){
		echo "<tr>";
		echo "<td>".$key."</td>";
		for($i = 0; $i < 3; $i++) {
			echo "<tr>";
			for ($j=0; $j < 3; $j++) { 
				echo "<td>".$menu[$key][$i][$j]."</td>";
			}
			echo "</tr>";
		}
		echo "</tr>";
	}
	echo "</table>";
	echo "<h2>Menu del Dia</h2>";
	$precio = 0;
	foreach ($menu as $key => $value) {
		$random = numeroAleatorio();
		echo $value[$random][0]."<br>";
		$precio+=$value[$random][2];
	}
	echo "El precio del Menu es: ".$precio;
		
	function numeroAleatorio (){
		return rand(0,2);
	}
	
?>