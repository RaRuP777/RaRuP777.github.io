<?php
	setcookie("user", 1, time()+3600); 
	if(isset($_COOKIE['user']))
    	echo "COOKIES ACTIVADAS"; 
    else
    	echo "COOKIES DESACTIVADAS";  
?>