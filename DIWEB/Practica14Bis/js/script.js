$(function() {
	var pos;
	
	$(".yo").click(function(evento) {
		evento.preventDefault();
		pos = $("#yo").offset().top;
		$("html, body").animate({
			scrollTop: pos
		}, 2000);
		$("footer").hide();
		$( ".logos1" ).animate({
		    height: "toggle"
		 }, 3000, function() {});
		$( ".logos2" ).animate({
		    height: "toggle"
		 }, 5000, function() {});
		$( ".logos3" ).animate({
		    height: "toggle"
		 }, 7000, function() {});
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