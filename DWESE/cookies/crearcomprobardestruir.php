<html>
	<body>
		<br><a href='vercodigo.php?src=crearcomprobardestruir.php'>Ver Codigo</a></br>
		<?php
			if (isset($_POST['crear']))
				crearCookie($_POST['nombre']);

			if (isset($_POST['mostrar']))
				mostrarCookie();

			if (isset($_POST['borrar']))
				borrarCookie();

			function crearCookie ($nombre){
				setcookie("user", $nombre, time()+3600);
			}

			function mostrarCookie (){
				if (isset($_COOKIE['user']))
					echo "Cookie Existente User: " . $_COOKIE["user"] . "<br>";
				else
					echo "No existen Cookies";
			}

			function borrarCookie(){
				setcookie("user", "", time()-3600);
				echo "Cookie Borrada<br>";
			}
	
		?>
		<form action="crearcomprobardestruir.php" method="post">
			<label>User</label>
			<input type="text" maxlength="8" name="nombre" required/>
			<input type="submit" name="crear" value="Crear Cookie"/>
		</form>
		<form action="crearcomprobardestruir.php" method="post">
			<input type="submit" name="mostrar" value="Mostrar Cookie" />
		</form>
		<form action="crearcomprobardestruir.php" method="post">
			<input type="submit" name="borrar" value="Eliminar Cookie"/>
		</form>
	</body>
</html>