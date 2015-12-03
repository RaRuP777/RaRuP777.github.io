<?php
	/**
	* Curriculum Vitae
	*@Author: Pedro J. Ramos
	*@Version: 7.0
	*/
	
	echo "<br><a href='vercodigo.php?src=curriculum.php'>Ver Codigo</a></br>";	

	echo '<h1>Curriculum Vitae</h1>';
	if (isset($_POST['enviar'])) {
		echo "<table>";
		echo "<tr><th>Nombre</th><td>" . $_POST['nombre'] . "</td></tr>";
		echo "<tr><th>Apellidos</th><td>" . $_POST['apellidos'] . "</td></tr>";
		echo "<tr><th>Sexo</th><td>" . $_POST['sexo'] . "</td></tr>";
		echo "<tr><th>E-mail</th><td>" . $_POST['email'] . "</td></tr>";
		echo "<tr><th>Teléfono</th><td>" . $_POST['telefono'] . "</td></tr>";
		echo "<tr><th>Experiencia Laboral</th><td>" . $_POST['laboral'] . "</td></tr>";
		echo "<tr><th>Estudios realizados</th><td>" . $_POST['estudios'] . "</td></tr>";
		echo "<tr><th>Jornada laboral</th><td>" . $_POST['jornada'] . "</td></tr>";
		echo "<tr><th>idiomas</th><td><ul>";
		if (!empty($_POST['idiomas'])) {
			foreach ($_POST['idiomas'] as $idioma) {
				echo "<li>$idioma</li>"; 
			}
		}
		else {
			echo "Ningún idioma";
		}
		echo "</ul></td></tr>";
		echo "</table>";
	}

	echo '<form id="form1" action="curriculum.php" method="post">';
	echo '<fieldset>';
	echo '<p><label>Nombre</label><input type="text" name="nombre" required /></p>';
	echo '<p><label>Apellidos</label><input type="text" name="apellidos" required /></p>';
	echo '<p><label>Sexo</label>
		<input type="radio" name="sexo" value="Hombre" />Hombre
		<input type="radio" name="sexo" value="Mujer" />Mujer</p>';
	echo '<p><label>Correo electrónico</label><input type="email" name="email" required /></p>';
	echo '<p><label>Número de contacto</label><input type="text" name="telefono" required /></p>';
	echo '<p><label>Experiencia laboral</label><textarea rows="6" cols="30" name="laboral" ></textarea></p>';
	echo '<p><label>Estudios</label><textarea rows="6" cols="30" name="estudios"></textarea></p>';
	echo '<p><label>Jornada laboral</label>
		<select name="jornada">
			<option value="Indiferente" selected >Indiferente</option>
			<option value="Mañana">Por la mañana</option>
			<option value="Por la tarde">Por la tarde</option>
		</select></p>';
	echo '<p><label>Idiomas</label>
		<input type="checkbox" name="idiomas[]" value="Inglés" />Inglés
		<input type="checkbox" name="idiomas[]" value="Francés" />Francés
		<input type="checkbox" name="idiomas[]" value="Alemán" />Alemán
		<input type="checkbox" name="idiomas[]" value="Otros" />Otros</p>';
	echo '</fieldset>';
	echo '<input type="submit" name="enviar" value="Enviar"/>';
	echo '<input type="reset" name="reset" value="Limpiar"/>';
	echo '</form>';
?>