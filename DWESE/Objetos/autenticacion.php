<html>
	<body>
		<br><a href='vercodigo.php?src=autenticacion.php'>Ver Codigo</a></br>
        <h1>Autentificación</h1>
        <form action='autenticacion.php' method='post'>
            <label>Usuario</label>
            <input type='text' maxlength='12' name='usuario' autofocus required/>
            <label>password</label>
            <input type='password' maxlength='12' name='password' required/><br>
            <input type='submit' name='enviar' value='Logarse'/>
        </form>
		<?php
            class Login{ 
                var $usuario; 
                var $password; 

                function __construct($usuario, $password){ 
                    $this->usuario = $usuario; 
                    $this->password = $password; 
                }

                function mostrarUsuario(){
                    return $this->usuario;
                }
            } 

			session_start();

			if (!isset($_SESSION['autentificado']))
                $_SESSION['autentificado'] = false;

            if ($_SESSION['autentificado']) {
                mostrarDeslogueo();
            }

            if (isset($_POST['enviar'])) {
                $_SESSION['usuario'] = new Login ($_POST['usuario'], $_POST['password']);
                $_SESSION['autentificado'] = true;
                mostrarDeslogueo();
            }

            if (isset($_POST['borrar'])) {
                session_destroy();
            }

            function mostrarDeslogueo(){
                echo 
                    "<b>Usuario Logado:</b><br>"
                    . $_SESSION['usuario']->mostrarUsuario(). 
                    "<form action='autenticacion.php' method='post'>
                        <input type='submit' name='borrar' value='Deslogarse'/>
                    </form>"
                ;
            }
        ?>
	</body>
</html> 