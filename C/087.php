<?php

$STDIN = explode(" ",trim(fgets(STDIN)));


$first_no=  intval($STDIN[0]);
$second_no = intval(strrev($first_no));
$first_answer = $first_no + $second_no;
$answer_reverse = intval(strrev($first_answer));
if ($first_answer == $answer_reverse) {
	echo $first_answer;
}else{
$final_answer = $first_answer + $answer_reverse;
echo $final_answer;
}
?>