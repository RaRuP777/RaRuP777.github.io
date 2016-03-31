$(document).ready(function(){

    //datos del formulario
    var nombre = $("#nombre");
    var email = $("#email");
    var mensaje = $("#mensaje");

    //mensajes de error
    var errorNombre = $("#errorNombre");
    var errorEmail = $("#errorEmail");

    //evento presionar botón crear
    $("#enviar").click(function(){
        if(validarFormulario()){
            crearCookie();
            alert("Mensaje enviado");
        }
    });

    //evento presionar botón limpiar
    $("#limpiar").click(function (){
        nombre.html("");
        email.html("");
        mensaje.html("");

        errorNombre.html("");
        errorEmail.html("");
    });

    //cookies
    function crearCookie(){
        $.cookie("nombre",$('#nombre').val(),{expires: 365});
        $.cookie("email",$('#email').val(),{expires: 365});
        $.cookie("mensaje",$('#mensaje').val(),{expires: 365});
    }

});

