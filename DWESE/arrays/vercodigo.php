<?php
	if (isset ($_GET['src'])){
		highlight_file($_GET['src']);
	}
	else header("Location: http:\\localhost");
	echo ("<br/><a href=\"$_GET[src]\">Volver</a>");
?>
