<?php
	echo "<br><a href='vercodigo.php?src=password.php'>Ver Codigo</a></br>";	

	echo '<form action="password.php" method="post">';
	echo '<fieldset>';
	echo '<label>Contraseña(mayusculas, minusculas, números, minimo 6, maximo 16 caracteres)';
	echo '<br>';
	echo '<input type="text" name="contraseña" required/>';
	echo '</fieldset>';
	echo '<input type="submit" name="enviar" />';
	echo '</form>';

	if (isset($_POST['enviar'])) {
		echo 'La contraseña '. $_POST['contraseña'] . validarPassword($_POST['contraseña']);
	}

	function validarPassword($clave){
		if(strlen($clave) < 6)
			return " no es valida debe tener al menos 6 caracteres";
		if(strlen($clave) > 16)
			return " no es valida no puede tener más de 16 caracteres";
		if (!preg_match('`[a-z]`',$clave))
			return " no es valida debe tener al menos una letra minúscula";
		if (!preg_match('`[A-Z]`',$clave))
			return " no es valida debe tener al menos una letra mayúscula";
		if (!preg_match('`[0-9]`',$clave))
			return " no es valida debe tener al menos un caracter numérico";
	    return " es valida, tiene entre 6 y 16 caracteres, minusculas, mayúsculas y numeros";
	}
	  	
?>

