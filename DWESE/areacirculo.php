<?php
/**
*
* Muestra el area de un circulo
*
* @Author: Pedro J. Ramos
* @Version: 1.0
*
*/	
	define("pi",3.1416);
	$radio=5;
	$resultado=pi*($radio*$radio);
	echo "<br>El radio del circulo es: $radio</br>";
	echo "<br>El area del circulo es: $resultado</br>";
	echo "<br><a href='vercodigo.php?src=areacirculo.php'>Ver Codigo</a></br>";	
	
?>
