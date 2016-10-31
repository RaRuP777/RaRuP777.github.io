<?php
	echo "<br><a href='vercodigo.php?src=funcionesvarias.php'>Ver Codigo</a></br>";	

	function entre0y9 ($caracter){
		if (preg_match('`[0-9]`',$caracter))
			return true;
		return false;
	}

	function longitud ($cadena){
		return strlen($cadena);
	}

	function potencia ($a, $b){
		return pow($a, $b);
	}

	function esVocal ($caracter){
		if (preg_match('`a|e|i|o|u|A|E|I|O|U`',$caracter))
			return true;
		return false;
	}

	function esPar ($numero){
		if ($numero%2==0)
			return true;
		return false;
	}

	function posicion ($cadena, $char){
		for ($i=0; $i < strlen($cadena); $i++) { 
			if ($cadena[$i]==$char)
				return $i;
		}
		return false;
	}

	function letraamayusculas ($letra){
		return strtoupper($letra);
	}

	function cadenaamayusculas ($cadena){
		return strtoupper($cadena);
	}

	function sumacadenas ($cadena1, $cadena2){
		return $cadena1.$cadena2;
	}

	function cuadrado ($numero){
		return pow($numero, 2);
	}
?>