<?php
	echo "<br><a href='vercodigo.php?src=resultado.php'>Ver Codigo</a></br>";	

	echo '<h1>Introduce los numeros</h1>';
	echo '<form id="form2" action="resultado.php" method="post">';
	echo '<fieldset>';
	if (isset($_POST['enviar'])) {
		for ($i=0;$i<$_POST['numeros'];$i++){
			echo '<p><label>Numero '. $i .'</label><input type="text" name="numero'. $i .'" required /></p>';
			echo '<input type="hidden" name="numeros" value="'.$_POST['numeros'].'" />';
		}
	echo '</fieldset>';
	echo '<input type="submit" name="enviar2" value="Enviar"/>';
	echo '<input type="reset" name="reset" value="Limpiar"/>';
	echo '</form>';
	}
?>