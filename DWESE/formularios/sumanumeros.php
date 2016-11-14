<?php
	echo "<br><a href='vercodigo.php?src=sumanumeros.php'>Ver Codigo</a></br>";	

	echo 
		'<h1>Cantidad de N&uacute;meros a Sumar</h1>
		<form id="form1" action="hacesuma.php" method="post">
			<fieldset>
				<label>¿Cantidad de N&uacute;meros a Sumar?</label>
				<input type="text" name="numeros" required />
			</fieldset>
			<input type="submit" name="enviar" value="Enviar"/>
			<input type="reset" name="reset" value="Limpiar"/>
		</form>'
	;
?>