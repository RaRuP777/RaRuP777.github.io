$(document).ready(function(){

    //datos del formulario
    var nombre = document.getElementById("nombre");
    var apellidos = document.getElementById("apellidos");
    var email = document.getElementById("email")
    var fecha = document.getElementById("fecha");
    var condiciones = document.getElementById("condiciones");

    //mensajes de error
    var errorNombre = document.getElementById("errorNombre");
    var errorApellidos = document.getElementById("errorApellidos");
    var errorEmail = document.getElementById("errorEmail");
    var errorFecha = document.getElementById("errorFecha");
    var errorCondiciones = document.getElementById("errorCondiciones");

    //botones del formulario
    var btnEnviar = document.getElementById('enviar');
    var btnLimpiar = document.getElementById('limpiar');

    //evento perdida foco del input nombre
    nombre.addEventListener('blur', function(){
        validarNombre(nombre.value);
    });

    //evento perdida foco del input apellidos
    apellidos.addEventListener('blur', function(){
        validarApellidos(apellidos.value);
    });

    //evento perdida foco del input email
    email.addEventListener('blur', function(){
        validarEmail(email.value);
    });

    //evento perdida foco del input fecha
    fecha.addEventListener('blur', function(){
        validarFecha(fecha);
    });

    //evento perdida foco del input fecha
    condiciones.addEventListener('blur', function(){
        validarCondiciones(condiciones);
    });

    //evento presionar botón crear
    btnEnviar.addEventListener('click',enviar);

    //función crear asociada al botón Nuevo Usuario
    function enviar(){
        if(validarFormulario()){
            crearCookie();
            alert("Mensaje enviado");
        }
    }

    //evento presionar botón limpiar
    btnLimpiar.addEventListener('click',limpiar);

    //función crear asociada al botón Limpiar
    function limpiar(){
        nombre.innerHTML="";
        apellidos.innerHTML="";
        email.innerHTML="";
        fecha.innerHTML="";
        condiciones.checked=false;

        errorNombre.innerHTML = "";
        errorApellidos.innerHTML="";
        errorEmail.innerHTML="";
        errorFecha.innerHTML="";
        errorCondiciones.innerHTML="";
    }

    //datepicker
    $( "#fecha" ).datepicker({
        dateFormat: "dd/mm/yy",
        minDate: 0,
        firstDay: 1,
        prevText: 'Anterior',
        nextText: 'Siguiente',
        dayNamesMin: ["D", "L", "M", "X", "J", "V", "S", "D"],
        monthNames: [ "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" ],
        numberOfMonths: 1,
        onClose: function( selectedDate ) {
            if(selectedDate)
                $( "#fecha" ).datepicker( "option", "minDate", selectedDate );
            validarFecha(fecha.value);
        }
    });

    //cookies
    function crearCookie(){
        $.cookie("nombre",$('#nombre').val(),{expires: 365});
        $.cookie("apellidos",$('#apellidos').val(),{expires: 365});
        $.cookie("email",$('#email').val(),{expires: 365});
        $.cookie("fecha",$('#fecha').val(),{expires: 365});
    }

});
