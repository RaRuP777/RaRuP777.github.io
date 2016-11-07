<html>
	<body>
		<br><a href='vercodigo.php?src=fechahora.php'>Ver Codigo</a></br>
		<?php 
    		if (isset($_COOKIE["fecha"]))
		        echo "La ultima vez que accediste fue el " . $_COOKIE["fecha"]; 
		    else { 
		        echo "Es la primera vez que accedes";
		        $fecha = ""; 
		    } 
		    $fecha = date("d") . " de " . date("F") . " de " . date("Y") . " a las " . date("H") . ":" . date("i") . ":" . date("s"); 
		    setcookie("fecha", $fecha, time()+3600);        
		?> 
	</body>
</html>