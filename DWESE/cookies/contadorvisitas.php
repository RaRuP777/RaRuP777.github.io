<html> 
	<head> 

	</head> 
	<body>
		<br><a href='vercodigo.php?src=contadorvisitas.php'>Ver Codigo</a></br> 
	    
	    <?php
	    	$visitas = 0; 
	        if(isset($_COOKIE['visitas']))
	        	$visitas = $_COOKIE['visitas'] + 1;
	        setcookie('visitas', $visitas); 
	    ?> 
	    
	    Número de visitas 
	    <?php 
	    	echo $visitas; 
	    ?>
	</body> 
</html> 