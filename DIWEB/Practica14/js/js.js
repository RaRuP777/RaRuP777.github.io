$(function(){

	$("#event1").click(function() {
		$("#yo").mostrar();
	});

	$("#event2").click(function() {
		$("#trabajos").mostrar();
	});

	$("#event3").click(function() {
		$("#contacto").mostrar();
	});

	$(".cerrar").click(function() {
		$("#yo").ocultar();
		$("#trabajos").ocultar();
		$("#contacto").ocultar();
	});

	//Animación
	$('#animacion').animate({'opacity':0, 'z-index': -1}, 5000);
});

jQuery.fn.mostrar = function() {
	this.each(function(){
    	elem = $(this);
    	elem.show(1000);
    });
	return this;
}

jQuery.fn.ocultar = function() {
	this.each(function(){
    	elem = $(this);
    	elem.hide("slow");
    });
	return this;
}