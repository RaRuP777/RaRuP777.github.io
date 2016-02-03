$(document).ready(function(){
	$("#enlaceajax").click(function(evento){
		evento.preventDefault();
		$("#destino").load("jquery5.html");
	});
})