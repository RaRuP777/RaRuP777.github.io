$(function() {
	var pos;
	
	$(".yo").click(function(evento) {
		evento.preventDefault();
		pos = $("#yo").offset().top;
		$("html, body").animate({
			scrollTop: pos
		}, 2000);
		$("footer").hide();
	});

	$(".daw").click(function(evento) {
		evento.preventDefault();
		pos = $("#daw").offset().top;
		$("html, body").animate({
			scrollTop: pos
		}, 2000);
		$("footer").hide();
	});

	$(".contacto").click(function(evento) {
		evento.preventDefault();
		pos = $("#contacto").offset().top;
		$("html, body").animate({
			scrollTop: pos
		}, 2000);
	});

	$(".top").click(function(evento) {
		evento.preventDefault();
		pos = $("#top").offset().top;
		$("html, body").animate({
			scrollTop: pos
		}, 1000);
		$("footer").show();
	});

});