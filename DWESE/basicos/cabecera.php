<?php
/**
*
* Muestra la cabecera distinta en funcion de la estancion del año
*
* @Author: Pedro J. Ramos
* @Version: 1.0
*
*/	
	$fecha = getdate();
    $diaAnno = $fecha['yday'];
    if($diaAnno<=80 || $diaAnno>=355){
    	echo "<img src='i.png'>";
    	echo "Estamos en Invierno";
    }
    elseif($diaAnno>80 and $diaAnno<=173) {
    	echo "<img src='p.png'>";
    	echo "Estamos en Primavera";
    }
    elseif($diaAnno>174 and $diaAnno<266) {
    	echo "<img src='v.png'>";
    	echo "Estamos en Verano";
    }
    else {
    	echo "<img src='o.png'>";
    	echo "Estamos en Otoño";
    }
    echo "<br><a href='vercodigo.php?src=cabecera.php'>Ver Codigo</a></br>";