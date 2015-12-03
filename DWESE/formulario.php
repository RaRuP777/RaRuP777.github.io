<?php
	/**
	* Formulario Basico
	*
	*@Author: Pedro J. Ramos
	*@Version: 2.0
	*/
	
	echo "<br><a href='vercodigo.php?src=formulario.php'>Ver Codigo</a></br>";	

	if (isset($_POST['enviar'])) {
		$v_nombre = $_POST('nombre');
		$v_apellido = $_POST('apellido');
		if ($v_nombre != null && $v_apellido != null){
				echo "Nombre: $v_nombre<br/>";
				echo "Apellido: $v_apellido<br/>";
		}
	else{
		echo "<form action='formulario.php' method='post'>";
		echo "Nombre: <input type='text' name='nombre' value=$v_nombre><br>";
		echo "Apellido: <input type='text' name='apellido' value=$v_apellido><br>";
		echo "<input type='submit' name='enviar' value='enviar'>";
		echo "</form>";
	}