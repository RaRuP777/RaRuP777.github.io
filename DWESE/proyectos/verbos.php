<?php

	echo "<br><a href='vercodigo.php?src=verbos.php'>Ver Codigo</a></br>";	
	
	$verbos=array(		array("awake","awoke","awoken"),
						array("beat","beat","beaten"),
						array("become","became","become"),
						array("begin","began","begun"),
						array("bend","bent","bent"),
						array("bet","bet","bet"),
						array("bite","bit","bitten"),
						array("bleed","bled","bled"),
						array("blow","blew","blown"),
						array("break","broke","broken"),
						array("bring","brought","brought"),
						array("build","built","built"),
						array("buy","bought","bought"),
						array("choose","chose","chosen"),
						array("come","came","come"),
						array("cost","cost","cost"),
						array("cut","cut","cut"),
						array("drink","drank","drunk"),
						array("drive","drove","driven"),
						array("dig","dug","dug"),
						array("do","did","done")
						);
	$verbos2=$verbos;
	for ($k = 0; $k < 11; $k++){
		$verbos2[rand(0,(count($verbos2)-1))][rand(0,2)]="";
	}
	$fallos=-1;
	$cont=0;
		//------------------------------------------------------------//

	if (isset($_POST['enviar'])) {
		for ($i = 0; $i < count($verbos); $i++) {
			for($j = 0; $j < 3; $j++) {
				if ($verbos[$i][$j] =! $verbos2[$i][$j]){
					$fallos++;
				}
			}
		}
		echo "<center><h1>Has cometido ". $fallos ." fallos</h1></center>";
	}
	else{
		echo "<form action='verbos.php' method='post'>";
		echo "<fieldset>";
		echo "<center><h1>VERBOS IRREGULARES<br/><hr/>";
		echo "<h3>Rellena los campos que faltan</h3><br/>";
		echo "<table border='1' width='500'>";
		echo "<tr>";
		echo "<th>Presente</th>";
		echo "<th>Pasado</th>";
		echo "<th>Participio</th>";
		echo "<tr>";
		for ($i = 0; $i < count($verbos); $i++) {
			echo "<tr>";
			for($j = 0; $j < 3; $j++) {
				if ($verbos2[$i][$j] != ""){
					echo "<td>".$verbos2[$i][$j]."  </td>";
				}
				else {
					$cont++;
					echo "<td><input type='text' name='nombre".$cont."' value=''></td>";
				}
			}
			echo "</tr>";
		}
		echo "</center></table><br/><hr/>";
		echo "</fieldset><br/>";
		//----------------------------------------------------------------//
		echo "<input type='submit' name='enviar' value='enviar'>";
		echo "</form>";
	}
?>