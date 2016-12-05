<html>
	<body>
		<br><a href='vercodigo.php?src=galeria.php'>Ver Codigo</a></br>
		<h1>Galería de fotos</h1>
		<form method="post" action="upload.php" enctype="multipart/form-data">
            <label for="imagen">Subir imagen</label>
            <input type="file" name="imagen" id="imagen">
        	<input type="submit" name="enviar" value="Subir imagen">
            <a href="vergaleria.php"><input type="button" name="galeria" value="Ver galería"/></a>
        </form>
    
		<?php

		?>
	</body>
</html>