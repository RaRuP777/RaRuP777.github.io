<?php
	echo "<br><a href='vercodigo.php?src=letraDNI.php'>Ver Codigo</a></br>";	

	echo '<form action="letraDNI.php" method="post">';
	echo '<fieldset>';
	echo '<label>Numero DNI (9 dígitos)</label>';
	echo '<br>';
	echo '<input type="numero" pattern="[0-9]{8}" size="8" maxlength="8" name="dni" required/>';
	echo '</fieldset>';
	echo '<input type="submit" name="enviar" />';
	echo '</form>';

	if (isset($_POST['enviar'])) {
		echo 'Al DNI con número '. $_POST['dni'] . " le corresponde la letra: ". letraDNI($_POST['dni']);
	}

	function letraDNI ($numero){
		$letra = $numero%23;
		$letras = array ('T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E', 'T');
		return $letras[$letra];
	}
?>