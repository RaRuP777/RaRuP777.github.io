<html>
	<body>
		<br><a href='vercodigo.php?src=agenda.php'>Ver Codigo</a></br>
		<?php
			session_start();
		    
		    if (!isset($_SESSION['agenda'])) {
		        $_SESSION['agenda'] = array();
		    }
			
			if (isset($_POST['enviar'])) {
        		$_SESSION['agenda'][] = array(	'nombre' => $_POST['nombre'], 
        										'telef' => $_POST['telef']);
        		echo "Contacto Guardado";
    		}

    		if (isset($_POST['mostrar'])) {
    			echo "<table>";
    			foreach ($_SESSION['agenda'] as $contactos) {
            		echo "<tr><td>" . $contactos["nombre"] . "</td><td>" . $contactos["telef"] . "</td></tr>";
       			}
       			echo "</table>";
    		}

    		if (isset($_POST['borrar'])) {
        		$_SESSION['agenda'] = array();
        		echo "Agenda Borrada";
    		}
		?>
		<h1>Agenda de contactos</h1>
		<form action="agenda.php" method="post">
			<label>Nombre</label>
			<input type="text" maxlength="12" name="nombre" autofocus required/>
			<label>Teléfono</label>
			<input type="text" maxlength="9" name="telef" pattern="[0-9]{9}" required/><br>
			<input type="submit" name="enviar" value="Guardar Contacto"/>
		</form>
		<form action="agenda.php" method="post">
			<input type="submit" name="mostrar" value="Mostrar Contactos"/>
		</form>
		<form action="agenda.php" method="post">
			<input type="submit" name="borrar" value="Borrar Agenda"/>
		</form>
	</body>
</html> 