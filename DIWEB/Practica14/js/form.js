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
        nombre.innerHTML="";
        email.innerHTML="";
        mensaje.innerHTML="";

        errorNombre.innerHTML = "";
        errorEmail.innerHTML="";
    });

    //cookies
    function crearCookie(){
        $.cookie("nombre",$('#nombre').val(),{expires: 365});
        $.cookie("email",$('#email').val(),{expires: 365});
        $.cookie("mensaje",$('#mensaje').val(),{expires: 365});
    }

});

