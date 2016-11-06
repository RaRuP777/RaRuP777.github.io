<?php

	echo "<br><a href='vercodigo.php?src=tablerobarcos.php'>Ver Codigo</a></br>";	
	
	$tablero=array("A"=>array(0, 1, 1, 0, 0, 0, 0, 0, 0, 0),
				"B"=>array(0, 0, 0, 0, 0, 1, 0, 0, 0, 0),
				"C"=>array(0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
				"D"=>array(0, 1, 0, 0, 0, 0, 0, 0, 0, 1),
				"E"=>array(0, 0, 0, 0, 0, 0, 0, 0, 0, 1),
				"F"=>array(0, 0, 0, 0, 0, 0, 0, 0, 0, 1),
				"G"=>array(0, 0, 1, 0, 0, 0, 0, 0, 0, 1),
				"H"=>array(0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
				"I"=>array(0, 0, 0, 0, 0, 1, 1, 1, 0, 0),
				"J"=>array(0, 0, 1, 1, 0, 0, 0, 0, 0, 0));
	echo '<center>
	      <table border="5"><td></td>
				<td>1</td>
				<td>2</td>
				<td>3</td>
				<td>4</td>
				<td>5</td>
				<td>6</td>
				<td>7</td>
				<td>8</td>
				<td>9</td>
				<td>10</td>';
	foreach ($tablero as $key =>$valor){
		echo "<tr>";
		echo "<td>$key</td>";
		for($i = 0; $i < 10; $i++) {
			echo '<td width="50" height="50" bgcolor="'.aguaBarco($tablero[$key][$i]).'"></td>';
		}
		echo "</tr>";
	}
	echo "</table>
	      </center>";
	
	function aguaBarco($color){
		if ($color == 0){
			return '00FFFF';
		}
		return '690015';
	}
?>
