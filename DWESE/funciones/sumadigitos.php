<html>
	<head>
		
	</head>
	<body>
		<br><a href='vercodigo.php?src=sumadigitos.php'>Ver Codigo</a></br>
		<form action="sumadigitos.php" method="post">
			<fieldset>
				<label>Introduce un numero</label>
				<br>
				<input type="numero" maxlength="8" name="numero" required/>
			</fieldset>
			<input type="submit" name="enviar" />
		</form>
		<?php
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
	</body>
</html>
