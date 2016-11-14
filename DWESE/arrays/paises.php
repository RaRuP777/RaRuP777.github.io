<?php
	$paises = array (
						array (	"País" => "España",
								"Capital" => "Madrid",
								"Bandera" => "images/españa.png"),
						array (	"País" => "Australia",
								"Capital" => "Sydney",
								"Bandera" => "images/australia.png"),	
						array (	"País" => "Reino Unido",
								"Capital" => "Londres",
								"Bandera" => "images/reinounido.png"),
						array (	"País" => "Estados Unidos",
								"Capital" => "Washington D.C",
								"Bandera" => "images/usa.png"),
						array (	"País" => "Alemania",
								"Capital" => "Berlín",
								"Bandera" => "images/alemania.png"),
					);
	echo 
		'<form action="paises.php" method="post">
		<fieldset>
		<label>País</label><select name="paises">';
	foreach ($paises as $pais=> $dato) {
		if (isset($_POST['enviar'])) {
			if (strcmp($dato['País'], $_POST['paises']) == 0) {
				$selected = "selected";
			}
		}
		echo '<option value="' . $dato['País'] . '" ' . $selected . '>' . $dato['País'] . '</option>';
	}
	echo 
		'</select>
		</fieldset>
		<input type="submit" name="enviar" value="Enviar" />
		</form>';
	if (isset ($_POST['enviar'])) {
		foreach ($paises as $pais => $dato) {    
			if (strcmp ($dato['País'],$_POST['paises']) == 0) {
				echo ("<p>País: " . $dato['País'] . "</p>");
				echo ("<p>Capital: " . $dato['Capital'] . "</p>");
				echo ('<img src="' . $dato['Bandera'] . '" />');
			}
		}
	}
?>