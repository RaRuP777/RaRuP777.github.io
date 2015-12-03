<?php
	/**
	* Muestra la paleta de colores 
	*
	*@Author: Pedro J. Ramos
	*@Version: 1.0
	*/
	echo "<br><a href='vercodigo.php?src=paletacolores.php'>Ver Codigo</a></br>";	
	define ('INCREMENTO', 15);
	echo "<table>";    
	for ($rojo = 0; $rojo < 256; $rojo += INCREMENTO) {
		for ($verde = 0; $verde < 256; $verde += INCREMENTO) {
			for ($azul = 0; $azul < 256; $azul += INCREMENTO) {                      
				$colores = "$rojo/$verde/$azul";
				echo ("<td style='background-color: rgb(".$rojo.", ".$verde.", ".$azul.");>$colores</a></td>");
				if ($azul > ((255 - INCREMENTO))) {
					echo("</tr><tr>");
				}
			}
		}
	    echo ("</tr><tr><td>&nbsp;</td></tr>");
	}
	echo "</table>"
?>