<html>
	<body>
		<br><a href='vercodigo.php?src=login.php'>Ver Codigo</a></br>
		<?php
		
			if (isset($_POST['crear']))
				crearCookie($_POST['nombre'],$_POST['password']);

			if (isset($_POST['recordar']))
				mostrarCookie();

			if (isset($_POST['borrar']))
				borrarCookie();

			function crearCookie ($nombre, $password){
				setcookie("user", $nombre, time()+3600);
				setcookie("password", $password, time()+3600);
			}

			function mostrarCookie (){
				if (isset($_COOKIE['user'])){
					echo "User: " . $_COOKIE["user"] . "<br>";
					echo "Password: " . $_COOKIE["password"] . "<br>";
				}
				else
					echo "No existen Datos";
			}

			function borrarCookie(){
				setcookie("user", "", time()-3600);
				setcookie("password", "", time()-3600);
				echo "Datos Borrados";
			}
	
		?>
		<form action="login.php" method="post">
			<label>Usuario</label>
			<input type="text" maxlength="8" name="nombre" required/>
			<label>Contraseña</label>
			<input type="text" maxlength="8" name="password" required/><br>
			<input type="submit" name="crear" value="Crear Usuario"/>
		</form>
		<form action="login.php" method="post">
			<input type="submit" name="recordar" value="Recordar Usuario" />
		</form>
		<form action="login.php" method="post">
			<input type="submit" name="borrar" value="Eliminar Usuario"/>
		</form>
	</body>
</html>