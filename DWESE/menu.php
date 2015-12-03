<?php
	/**
	* Un restaurante dispone de una carta de 3 primeros, 5 segundos y 3 postres. Almacenar
	* información incluyendo foto y mostrar los menús disponibles. Mostrar el precio del menú
	* suponiendo que éste se calcula sumando el precio de cada uno de los platos incluidos y con un
	* descuento del 20 %.
	*
	*@Author: Pedro J. Ramos
	*@Version: 1.0
	*/
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
	echo "<h1>Menu del Dia</h1>";
	$primero = $menu["Primeros"][rand(0,2)];
	$segundo = $menu["Segundos"][rand(0,2)];
	$postre = $menu["Postres"][rand(0,2)];
	for ($k = 0; $k < 2; $k++){
		echo $primero[$k]."<br/>";
		echo $segundo[$k]."<br/>";
		echo $postre[$k]."<br/>";
	}
?>