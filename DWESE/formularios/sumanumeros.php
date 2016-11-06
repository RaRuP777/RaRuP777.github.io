<?php
	
	echo "<br><a href='vercodigo.php?src=sumanumeros.php'>Ver Codigo</a></br>";	

	echo '<h1>Cantidad de N&uacute;meros a Sumar</h1>';
	echo '<form id="form1" action="hacesuma.php" method="post">';
	echo '<fieldset>';
	echo '<p><label>¿Cantidad de N&uacute;meros a Sumar?</label><input type="text" name="numeros" required /></p>';
	echo '</fieldset>';
	echo '<input type="submit" name="enviar" value="Enviar"/>';
	echo '<input type="reset" name="reset" value="Limpiar"/>';
	echo '</form>';
?>