<?php
	echo "<br><a href='vercodigo.php?src=cuentapalabras.php'>Ver Codigo</a></br>";	

	echo '<form action="cuentapalabras.php" method="post">';
	echo '<fieldset>';
	echo '<label>TexArea</label>';
	echo '<br>';
	echo '<textarea rows="6" cols="30" name="texto" /required></textarea>';
	echo '</fieldset>';
	echo '<input type="submit" name="enviar" />';
	echo '</form>';

	if (isset($_POST['enviar'])) {
		echo 'Has introducido ' . contar($_POST['texto']) . " palabras" ;
	}

	function contar ($texto){
		$total=1;
		for ($i=0; $i < strlen($texto); $i++) { 
			if ($texto[$i]== " ") {
				$total++;
			}
		}
		return $total;
	}
?>