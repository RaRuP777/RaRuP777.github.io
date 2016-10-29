<?php
	echo "<br><a href='vercodigo.php?src=sumadigitos.php'>Ver Codigo</a></br>";	

	echo '<form action="sumadigitos.php" method="post">';
	echo '<fieldset>';
	echo '<label>Introduce un numero';
	echo '<br>';
	echo '<input type="numero" maxlength="8" name="numero" required/>';
	echo '</fieldset>';
	echo '<input type="submit" name="enviar" />';
	echo '</form>';

	if (isset($_POST['enviar'])) {
		echo 'La suma de los digitos del numero '. $_POST['numero'] . ' es ' . sumaNumeros($_POST['numero']);
	}

	function sumaNumeros ($numero){
		$suma=0;
		for ($i=0; $i < strlen($numero); $i++) { 
			$suma+=$numero[$i];
		}
		return $suma;
	}
?>

