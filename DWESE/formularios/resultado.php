<?php
	echo "<br><a href='vercodigo.php?src=resultado.php'>Ver Codigo</a></br>";	

	$total=0;
	echo '<h1>Resultado de la Suma</h1>';
	if (isset($_POST['enviar2'])) {
		echo "<table>";
		for ($i = 0; $i < $_POST['numeros']; $i++) {
			$total += $_POST['numero'. $i];
		}
		echo 
			"<tr><th>Total</th><td>" . $total . "</td></tr>
			</ul></td></tr>
			</table>"
		;
	}
?>