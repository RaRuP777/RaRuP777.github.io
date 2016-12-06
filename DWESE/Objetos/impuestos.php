<html>
	<body>
		<br><a href='vercodigo.php?src=impuestos.php'>Ver Codigo</a></br>
		<h1>Impuestos</h1>
		<form method="post" action="impuestos.php" enctype="multipart/form-data">
            <label for="nombre">Nombre</label>
            <input type="text" name="nombre" id="nombre" required/>
            <br>
            <label for="sueldo">Sueldo</label>
            <input type="text" pattern="[0-9]{4}" name="sueldo" id="sueldo" placeholder="4 dígitos"required/>
            <br>
        	<input type="submit" name="enviar" value="Comprobar Impuestos">
        </form>
    
		<?php
			class Empleado{ 
	    		var $nombre; 
	    		var $sueldo; 

	    		function __construct($nombre, $sueldo){ 
	        		$this->nombre = $nombre; 
	        		$this->sueldo = $sueldo; 
	    		} 

	    		function pagarImpuestos(){ 
	        		if($this->sueldo > 3000) 
	            		return "Debe pagar impuestos"; 
	        		else 
	            		return "No debe pagar impuestos"; 
	    		} 
			} 

			if (isset($_POST['enviar'])) {
				$empleado = new Empleado($_POST['nombre'], $_POST['sueldo']);
				echo 	"Nombre: ". $empleado->nombre."<br/>
						Sueldo: ".$empleado->sueldo."<br/>". 
						$empleado->pagarImpuestos()."<br/>";
			}
		?>
	</body>
</html>