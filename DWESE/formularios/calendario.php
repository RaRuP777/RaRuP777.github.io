<html>
	<head>
		
	</head>
	<body>
		<br><a href='vercodigo.php?src=calendario.php'>Ver Codigo</a></br>
		<form action="calendario.php" method="post">
			<fieldset>
				<label>Año</label>
				<label>Mes</label>
				<input type="numero" pattern="[0-9]{4}" size="4" maxlength="4" name="anio" required/>
				<select name="mes">
					<option value="01">Enero</option>
					<option value="02">Febrero</option>
					<option value="03">Marzo</option>
					<option value="04">Abril</option>
					<option value="05">Mayo</option>
					<option value="06">Junio</option>
					<option value="07">Julio</option>
					<option value="08">Agosto</option>
					<option value="09">Septiembre</option>
					<option value="10">Octubre</option>
					<option value="11">Noviembre</option>
					<option value="12">Diciembre</option>
				</select>
			</fieldset>
			<input type="submit" name="enviar" />
		</form>

		<?php

			if (isset($_POST['enviar'])) {
				$diasSemana = array (1 => "Lunes",
									 2 => "Martes",
									 3 => "Miércoles",
									 4 => "Jueves",
									 5 => "Viernes",
									 6 => "Sábado",
									 7 => "Domingo"
									 );
				define('FECHA', $_POST['anio'] . '-' . $_POST['mes'] . '-01');
				define('PRIMER_DIA', substr_replace(FECHA, '01', 8));
				$dia = date("d", strtotime(FECHA));
				$diaSemana = date("N", strtotime(FECHA));
				$primerDiaMes = date("N", strtotime(PRIMER_DIA));
				$diasDelMes = date("t", strtotime(FECHA));
				define('MAX_COL', 7);
				$bloque = 0; 
				$flag = 0;
				echo ("<h2>". $_POST['anio'] . "</h2>");
				echo ("<table>");
				for ($dias = 1;$dias < 8;$dias += 1) {
					echo("<th>$diasSemana[$dias]</th>");
				}
				echo ("<tr>");
				for ($dias = 1; $dias <= $diasDelMes; $dias += 1) {
					if ($bloque == MAX_COL) {
						echo ("</tr><tr>");
						$bloque = 0;
					}
					if ($dias == $primerDiaMes && $flag == 0) {
						$dias = 1;
						$flag = 1;
					}
					if ($flag == 1) {
						if ($dia == $dias) {
							echo ("<td class='actual'>$dias</td>");
						}
						else if ($bloque == (MAX_COL - 1)) {
							$domingo = strtolower($diasSemana['7']);
							echo ("<td class=\"$domingo\">$dias</td>");
						}
						else {
							echo ("<td>$dias</td>");
						}
					}
					else {
						echo ("<td>&nbsp;</td>");
					}
					$bloque += 1;
				}
				echo ("</tr>");
				echo ("<table>");
			}
		?>
	</body>
</html>