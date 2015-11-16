window.onload = function(){
var texto  = document.getElementById("texto");
var resultado ="";
}

function t1(){
	var styles = ["Jazz", "Blues"];
	styles.push("Rock'n'Roll");
	styles[styles.length-2] = "Classic";
	resultado = styles.pop();
	texto.innerHTML = resultado;
}

function t2(){
	var array = ["Plum","Orange","Donkey","Carrot","JavaScript"];
	resultado = array[Math.ceil(Math.random()*(array.length-1))];
	texto.innerHTML = resultado;
}

function t31(){
	var array = [ "test", 2, 1.5, false ];
	resultado = find(array, "test");
	texto.innerHTML = resultado;
}

function find(array, value) {
	return array.indexOf(value);
}

function t32(){
	var arr = ["a", 1, "b", 2];
	arr = filterNumeric(arr);
	resultado = arr;
	texto.innerHTML = resultado;
}

function filterNumeric(array){
	var array2 = new Array;
	for (var i=0; i<array.length; i++){
		if array[i].filter
			array2.push(array[i];
	}
	return
}
