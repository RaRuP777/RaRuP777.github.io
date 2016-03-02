$(document).ready(function(){

    //comprobar Cookies activadas
	comprobarCookies();

	function comprobarCookies(){
		if(!navigator.cookieEnabled)
			alert("Debe tener las cookies activadas para utilizar correctamente esta página");
	};

    //descripcion desplegable en titulos del catálago
    $("#titulo1").click(function(){
        $("#descripcion1").slideDown("slow");
        $("#casa1").fadeTo("slow", 0.5);
    });

    $("#titulo2").click(function(){
        $("#descripcion2").slideDown("slow");
        $("#casa2").fadeTo("slow", 0.5);
    });

    $("#titulo3").click(function(){
        $("#descripcion3").slideDown("slow");
        $("#casa3").fadeTo("slow", 0.5);
    });

    $("#titulo4").click(function(){
        $("#descripcion4").slideDown("slow");
        $("#casa4").fadeTo("slow", 0.5);
    });

});
