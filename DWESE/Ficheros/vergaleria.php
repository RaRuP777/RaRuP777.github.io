<html>
	<body>
		<br><a href='vercodigo.php?src=vergaleria.php'>Ver Codigo</a></br>
		<h1>Galería de fotos</h1>
  
		<?php
			$imagenes = scandir("uploads/");
			foreach ($imagenes as $value) {
		        if (substr($value, -4)==".png" || substr($value, -4)==".jpeg" || substr($value, -4)==".jpg" || substr($value, -4)==".gif")
		            echo "<img src=\"uploads/" . $value . "\" width=\"120px\" height=\"120px\"></td>";
		    }
   		?>

	</body>
</html>