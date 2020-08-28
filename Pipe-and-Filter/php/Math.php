<?php
use Pipeline as Pipeline;

/*
    1. read from assets/numbers.csv
    2. filter even numbers
    3. return count of even numbers
*/
class Math
{
    public function execute($filename = '')
    {

        // check the input variable
        
        $obj = new Pipeline($filename);

        return $obj->addStage([Math::class, 'readFile'])
               ->addStage([Math::class, 'filterArray'])
               ->addStage([Math::class, 'math_on_elements'])
               ->process();
    }



    public function readFile($filename = '')
    {
        return;
    }


    public function filterArray(array $dataset = [])
    {
        return;
    }


    public function math_on_elements(array $output = [])
    {
        return;
    }
}
