$(function() {
	var pos;
	
	$(".yo").click(function(evento) {
		evento.preventDefault();
		pos = $("#yo").offset().top;
		$("html, body").animate({
			scrollTop: pos
		}, 2000);
	});

	$(".daw").click(function(evento) {
		evento.preventDefault();
		pos = $("#daw").offset().top;
		$("html, body").animate({
			scrollTop: pos
		}, 2000);
	});

	$(".contacto").click(function(evento) {
		evento.preventDefault();
		pos = $("#contacto").offset().top;
		$("html, body").animate({
			scrollTop: pos
		}, 2000);
	});
});