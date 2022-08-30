<?php
$limit=10;

$n1=0;
$n2=1;

$x=0;

$name =" This is fibonacci series: ";

	print $name; 
	echo "<br/>";

for($i=1; $i<=$limit; $i++){
	echo $n1 ;
	$n1=$n2+$x;
	$n2=$x;
	$x=$n1;
	echo "<br/>";
	
 }
 
?>


