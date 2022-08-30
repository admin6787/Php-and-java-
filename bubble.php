<?ph
$array = [2,5,6,7,8,55,66,33,11,8,1,78,88];

$length=count($array);
for($i=0;$i<$length; $i++)
{
    for($j=0;$j<($length-1-$i);$j++)
    {
        if($array[$j]>$array[$j+1])

        
        {
            $temp=$array[$j];
            $array[$j]=$array[$j+1];
            $array[$j+1]=$temp;
        }
    }
}
echo  "<pre>";
print_r($array);
?>