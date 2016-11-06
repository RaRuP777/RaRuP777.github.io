<html>
	<head>
		
	</head>
	<body>
		<br><a href='vercodigo.php?src=iniciales.php'>Ver Codigo</a></br>

		<form action="iniciales.php" method="post">
			<fieldset>
				<label>Nombre</label><br>
				<input type="text" name="nombre" required/><br>
				<label>Apellido</label><br>
				<input type="text" name="apellido" required/>
			</fieldset>
			<input type="submit" name="enviar" />
		</form>

		<?php		
			if (isset($_POST['enviar'])) {
				echo 'Tu nombre completo es ' . $_POST['nombre'] . " " . $_POST['apellido'] . 
				" y tus iniciales son: ". primeraLetra($_POST['nombre']) . primeraLetra($_POST['apellido']);
			}

			function primeraLetra ($valor){
				return $valor[0];
			}
		?>
	</body>
</html>