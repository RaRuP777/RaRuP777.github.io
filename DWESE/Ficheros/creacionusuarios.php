<html>
	<body>
		<br><a href='vercodigo.php?src=creacionusuarios.php'>Ver Codigo</a></br>
		<?php

		    function obtenerIniciales($nombre) {
		        $nombre = explode(' ', $nombre);
		        $preposiciones = array("del","de","la");
		        foreach ($nombre as $value)
		            $iniciales .= substr($value,0,2);
		        return $iniciales;
		    }

		    function crearScript() {
		        $fichero = fopen($_FILES['fichero']['name'], 'r') or exit("No se pudo abrir el fichero.");
		        $script = fopen(basename($_FILES['fichero']['name'], '.txt') . '.sql', 'w+') or exit("No se pudo crear el script.");

		        $prefijo = trim($_POST['prefijo']);
		        $sufijo = trim($_POST['sufijo']);
		        $password = trim($_POST['password']);

		        $contador = 0;
		        
		        while(!feof($fichero)) {
		            if ($contador < 8) {
		                fgets($fichero);
		            } else {
		                $iniciales = obtenerIniciales(fgets($fichero));
		                $nombreBD = $prefijo.$iniciales.$sufijo;
	                    $usuario =  $prefijo.$iniciales.$sufijo;
	                    fputs($script, "CREATE USER '" . $usuario . "'@'localhost' IDENTIFIED BY '" . $password . "';".PHP_EOL);
	                    fputs($script, "CREATE DATABASE " . $nombreBD . ";".PHP_EOL);
	                    fputs($script, "GRANT ALL PRIVILEGES ON " . $nombreBD . ".* TO '" . $usuario . "'@'localhost' IDENTIFIED BY '" . $password . "';".PHP_EOL);
	                    echo "CREATE USER '" . $usuario . "'@'localhost' IDENTIFIED BY '" . $password . "';<br />
	                         CREATE DATABASE " . $nombreBD . ";<br />
	                         GRANT ALL PRIVILEGES ON " . $nombreBD . ".* TO '" . $usuario . "'@'localhost' IDENTIFIED BY '" . $password . "';<br />";
		            }
		            $contador++;
		        }

		        fclose($fichero);
		        fclose($script);
		    }

		    if (isset($_POST['enviar'])) {
		        include('upload.php');
		        echo 	"<h2>Script generado a partir del fichero:</h2>
	            		<a href=" . basename($_FILES['fichero']['name'], '.txt') . ".sql\">Descargar script</a><br />";
	            crearScript();
		    } else {
		        echo 	"<h1>Generar script SQL BBDD</h1>
		        		<form method='post' action='". htmlspecialchars($_SERVER['PHP_SELF']) . "' enctype='multipart/form-data'>
		                	<p>Fichero origen: <input type='file' name='fichero' id='fichero'></p>
		                	<p>Prefijo: <input type='text' name='prefijo' placeholder='2daw' /></p>
		                	<p>Sufijo: <input type='text' name='sufijo' placeholder='1516' /></p>
		                	<p>Password: <input type='text' name='password' placeholder='Contraseña' required /></p>
		                	<input type='submit' name='enviar' value='Crear script' />
		            	</form>";
		    }
		?>
	</body>
</html>