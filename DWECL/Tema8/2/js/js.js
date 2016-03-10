(function(){
    var campoUrl;//campoUrl
    var enviar;
    var ficheros;//ficheros
    var estado;//estado

    $(function(){
        campoUrl=$('#campoUrl');
        enviar=$('#enviar');
        ficheros=$('#ficheros');
        estado=$('#estado');
        campoUrl.val(location.href);
        enviar.on('click', function(){
            mostrarUrl();
        });
    });

    function mostrarUrl(){
        $.ajax({
            url: $campoUrl.val(),

        }).done(function(contenido, mensaje) {
                $ficheros.text(contenido);
                $estado.text(mensaje);
            })
            .fail(function(contenido, mensaje) {
                $estado.text(mensaje);
                limpiar();
            });
    }

    function limpiar(){
        $ficheros.text("");
    }

})();