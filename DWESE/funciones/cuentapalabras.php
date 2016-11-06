<html>
	<head>
		
	</head>
	<body>
		<br><a href='vercodigo.php?src=cuentapalabras.php'>Ver Codigo</a></br>
		<form action="cuentapalabras.php" method="post">
			<fieldset>
				<label>TexArea</label>
				<br>
				<textarea rows="6" cols="30" name="texto" /required></textarea>
			</fieldset>
			<input type="submit" name="enviar" />
		</form>
		<?php
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
	</body>
</html>