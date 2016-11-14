<html>
	<body>
		<br><a href='vercodigo.php?src=gestionacademica.php'>Ver Codigo</a></br>
		<?php
			session_start();
		    
		    if (!isset($_SESSION['gestionacademica'])) {
		        $_SESSION['gestionacademica'] = array();
		    }
			
			if (isset($_POST['enviar'])) {
        		$_SESSION['gestionacademica'][] = array('alumno' => $_POST['alumno'], 
        												'1ev' => $_POST['1ev'],
        												'2ev' => $_POST['2ev'],
        												'final' => $_POST['final']);
        		echo "Notas Guardadas";
    		}

    		if (isset($_POST['mostrar'])) {
    			echo "<table>";
    			foreach ($_SESSION['gestionacademica'] as $notas) {
            		echo "<tr><td>" . $notas["alumno"] 
            		. "</td><td>" . $notas["1ev"] 
            		. "</td><td>" . $notas["2ev"]
            		. "</td><td>" . $notas["final"]
            		. "</td></tr>";
       			}
       			echo "</table>";
    		}

    		if (isset($_POST['borrar'])) {
        		$_SESSION['gestionacademica'] = array();
        		echo "Base de Datos Borrada";
    		}
		?>
		<h1>Gestion Academica</h1>
		<form action="gestionacademica.php" method="post">
			<label>Alumno</label>
			<input type="text" maxlength="12" name="alumno" autofocus required/>
			<label>1 Evalucación</label>
			<input type="text" maxlength="2" name="1ev" pattern="[0-9]{1}|10" placeholder="[0-10]" required/>
			<label>2 Evalucación</label>
			<input type="text" maxlength="2" name="2ev" pattern="[0-9]{1}|10" placeholder="[0-10]" required/>
			<label>Final</label>
			<input type="text" maxlength="2" name="final" pattern="[0-9]{1}|10" placeholder="[0-10]" required/><br>
			<input type="submit" name="enviar" value="Guardar Calificacion"/>
		</form>
		<form action="gestionacademica.php" method="post">
			<input type="submit" name="mostrar" value="Mostrar Base de Datos"/>
		</form>
		<form action="gestionacademica.php" method="post">
			<input type="submit" name="borrar" value="Borrar Base de Datos"/>
		</form>
	</body>
</html> 