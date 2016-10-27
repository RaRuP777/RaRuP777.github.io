<?php
	echo "<br><a href='vercodigo.php?src=iniciales.php'>Ver Codigo</a></br>";	

	echo '<form action="iniciales.php" method="post">';
	echo '<fieldset>';
	echo '<label>Nombre</label>';
	echo '<br>';
	echo '<input type="text" name="nombre" required/>';
	echo '<br>';
	echo '<label>Apellido</label>';
	echo '<br>';
	echo '<input type="text" name="apellido" required/>';
	echo '</fieldset>';
	echo '<input type="submit" name="enviar" />';
	echo '</form>';

	if (isset($_POST['enviar'])) {
		echo 'Tu nombre completo es ' . $_POST['nombre'] . " " . $_POST['apellido'] . 
		" y tus iniciales son: ". primeraLetra($_POST['nombre']) . primeraLetra($_POST['apellido']);
	}

	function primeraLetra ($valor){
		return $valor[0];
	}
?>