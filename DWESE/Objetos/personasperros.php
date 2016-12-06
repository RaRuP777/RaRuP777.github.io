<html>
	<body>
		<br><a href='vercodigo.php?src=personasperros.php'>Ver Codigo</a></br>
		<h1>Personas y Perros</h1>
    
		<?php
			class Mascota{ 
	    		var $nombre; 
	    		var $fechanacimiento;
	    		var $color;
	    		var $raza;
	    		var $salud;
	    		var $estadoanimo;
	    		var $enfermo;
	    		var $destrezas;

	    		function __construct($nombre, $fechanacimiento, $color, $raza, $destrezas){ 
	        		$this->nombre = $nombre; 
	        		$this->fechanacimiento = $fechanacimiento;
	        		$this->color = $color;
	        		$this->raza = $raza;
	        		$salud->salud = $salud;
	        		$estadoanimo->estadoanimo = $estadoanimo;
	        		estadosalud();
	        		$destrezas->destrezas[0] = $destrezas;
	    		} 

	    		function estadosalud(){ 
	        		if($this->salud > 10 || $this->salud <80) 
	            		$enfermo = true; 
	        		else 
	            		$enfermo = false; 
	    		}

	    		function annadirdestreza ($destrezas){
	    			$this->destrezas[count($this->destrezas)] = $destrezas;
	    		}

			}

			class Persona{
				var $nombre;
				var $mascota;
				var $veterinario;

				function __construct($nombre, $mascota, $veterinario){ 
	        		$this->nombre = $nombre; 
	        		$this->mascota = $mascota;
	        		$this->veterinario = $veterinario;
				}
			}

		?>
	</body>
</html>