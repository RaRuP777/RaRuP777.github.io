window.onload = function(){
var texto  = document.getElementById("texto");
var resultado ="";
}

function t11(){
	var styles = ["Jazz", "Blues"];
	resultado = styles.push("Rock'n'Roll");
	texto.innerHTML = resultado;
}

function t12(){
	var styles = ["Jazz", "Blues"];
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
	var array = ["a", 1, "b", 2];
	arr = filterNumeric(arr);
	resultado = array;
	texto.innerHTML = resultado;
}

function filterNumeric(array){
	var array2 = array.filter(Number);
	return array2;
}

function t4(){
	var fruits = "Apple,Orange,Peach";
	var array = fruits.split(',');
	resultado = array;
	texto.innerHTML = resultado;
}

function t5(){
	var array = ["a", "b"];
	array.push( function() { alert(this) } );
	array[array.length-1]();
}

function t61(){
	var fruits = [];
	fruits[1] = 'Peach';
	fruits[99] = 'Apple';
	resultado = fruits.length;
	texto.innerHTML = resultado;
}

function t62(){
	var fruits = [];
	fruits[2] = 'Peach';
	fruits[5] = 'Apple';
	resultado = fruits;
	texto.innerHTML = resultado;
}

function t63(){
	var fruits = [];
	fruits[1] = 'Peach';
	fruits[9] = 'Apple';
	fruits.pop();
	fruits.pop();
	resultado = fruits;
	texto.innerHTML = resultado;
}

function t71(){
	var array = ["Go", "to", "home"];
	delete array[1];
	resultado = array[1];
	texto.innerHTML = resultado;
}

function t72(){
	var array = ["Go", "to", "home"];
	array.splice(1, 1);
	resultado = array;
	texto.innerHTML = resultado;
}

function t73(){
	var array = ["Go", "to", "home", "now"];
	array.splice(0, 3, "Come", "here");
	resultado = array;
	texto.innerHTML = resultado;
}

function t74(){
	var array = ["Why", "learn", "JavaScript"];
	var array2 = array.slice(0,2);
	resultado = array2;
	texto.innerHTML = resultado;
}

function t8(){
	var array = ["my","site","com"];
	resultado = array.reverse();
	texto.innerHTML = resultado;
}

function t9(){
	var array = [ 1, 2, 15 ];
	resultado = array.sort();
	texto.innerHTML = resultado;
}

function t101(){
	var array = new Array(2,3);
	resultado = array;
	texto.innerHTML = resultado;
}

function t102(){
	var array = [
		[1,2,3],
		[4,5,6],
		[7,8,9]
	];
	resultado = array[1][1];
	texto.innerHTML = resultado;
}

function suma100Primos(){
	var total=0;
	for (var i = 1; i<101; i++){
		if(esPrimo(i))
			total+=i;
	}
	texto.innerHTML = total;
}

function esPrimo(numero){
	var a=0;
    for (var i = 1; i < numero; i++) {
        if (numero%i==0)
        	a++;
    }
    if (a==2)
    	return true;
    else
    	return false;
}
