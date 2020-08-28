<?php
class hello
{
    public function getTitle()
    {
        return "Average joe";
    }
}

class queen extends hello
{
    public function getTitle()
    {
        return "Her majesty";
    }
}
