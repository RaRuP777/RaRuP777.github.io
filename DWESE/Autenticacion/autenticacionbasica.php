<html>
	<body>
		<br><a href='vercodigo.php?src=autenticacionbasica.php'>Ver Codigo</a></br>
		<?php
			session_start();

			if (!isset($_SESSION['autentificado'])) {
                $_SESSION['autentificado'] = false;
                mostrarFormulario();
            }

            if ($_SESSION['autentificado']) {
                mostrarDeslogueo();
            }

            if (isset($_POST['enviar'])) {
                $_SESSION['usuario'] = $_POST['usuario'];
                $_SESSION['password'] = $_POST['password'];
                $_SESSION['autentificado'] = true;
                mostrarDeslogueo();
            }

            if (isset($_POST['borrar'])) {
                $_SESSION['usuario'] = "";
                $_SESSION['password'] = "";
                $_SESSION['autentificado'] = false;
                mostrarFormulario();
            }

            function mostrarFormulario(){
                echo
                    "<h1>Autentificación</h1>
                    <form action='autenticacionbasica.php' method='post'>
                        <label>Usuario</label>
                        <input type='text' maxlength='12' name='usuario' autofocus required/>
                        <label>password</label>
                        <input type='password' maxlength='12' name='password' required/><br>
                        <input type='submit' name='enviar' value='Logarse'/>
                    </form>"
                ;
            }

            function mostrarDeslogueo(){
                echo 
                    "<b>Usuario Logueado</b><br>
                    Usted está logueado en el sistema como " . $_SESSION['usuario'] .
                    "<form action='autenticacionbasica.php' method='post'>
                        <input type='submit' name='borrar' value='Deslogarse'/>
                    </form>"
                ;
            }
        ?>
	</body>
</html> 