$(document).ready(function(){
	$("#mayoria_edad").click(function(evento){
		if ($("#mayoria_edad").attr("checked")){
			$("#formulariomayores").css("display", "block");
		}else{
			$("#formulariomayores").css("display", "none");
		}
	});
});