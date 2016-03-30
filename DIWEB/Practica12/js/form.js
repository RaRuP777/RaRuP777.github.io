$(document).ready(function(){

    //datos del formulario
    var nombre = $("#nombre");
    var apellidos = $("#apellidos");
    var email = $("#email")
    var fecha = $("#fecha");
    var condiciones = $("#condiciones");

    //mensajes de error
    var errorNombre = $("#errorNombre");
    var errorApellidos = $("#errorApellidos");
    var errorEmail = $("#errorEmail");
    var errorFecha = $("#errorFecha");
    var errorCondiciones = $("#errorCondiciones");

    //evento perdida foco del input nombre
    nombre.blur(function(){
        validarNombre();
    });

    //evento perdida foco del input apellidos
    apellidos.blur(function(){
        validarApellidos();
    });

    //evento perdida foco del input email
    email.blur(function(){
        validarEmail();
    });

    //evento perdida foco del input fecha
    fecha.blur(function(){
        validarFecha();
    });

    //evento perdida foco del input fecha
    condiciones.blur(function(){
        validarCondiciones();
    });

    //evento presionar botón crear
    $("#enviar").click(function(){
        if(validarFormulario()){
            crearCookie();
            alert("Mensaje enviado");
        }
    });

    //evento presionar botón limpiar
    $("#limpiar").click(function(){
        nombre.html("");
        apellidos.html("");
        email.html("");
        fecha.html("");
        condiciones.checked=false;

        errorNombre.html("");
        errorApellidos.html("");
        errorEmail.html("");
        errorFecha.html("");
        errorCondiciones.html("");
    });

    //datepicker
    $("#fecha").datepicker({
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
