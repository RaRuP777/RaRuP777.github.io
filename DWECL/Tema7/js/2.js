$(document).ready(function(){
	$("a").mouseover(function(event){
		$("#capa").addClass("clasecss");
	});
	$("a").mouseout(function(event){
		$("#capa").removeClass("clasecss");
	});
});