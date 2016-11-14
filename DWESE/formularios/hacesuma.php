<?php
	echo "<br><a href='vercodigo.php?src=resultado.php'>Ver Codigo</a></br>";	

	echo 
		'<h1>Introduce los numeros</h1>
		<form id="form2" action="resultado.php" method="post">
		<fieldset>'
	;
	if (isset($_POST['enviar'])) {
		for ($i=0;$i<$_POST['numeros'];$i++){
			echo 
				'<label>Numero '. $i .'</label>
				<input type="text" name="numero'. $i .'" required /><br>
				<input type="hidden" name="numeros" value="'.$_POST['numeros'].'" />'
			;
		}
	echo 
		'</fieldset>
		<input type="submit" name="enviar2" value="Enviar"/>
		<input type="reset" name="reset" value="Limpiar"/>
		</form>'
	;
	}
?>