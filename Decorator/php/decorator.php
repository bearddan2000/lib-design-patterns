<?php
class Hello
{
    public function getMessage()
    {
        return "hello";
    }
}
class HelloWorld extends Hello
{
    public function getMessage()
    {
        return parent::getMessage() . " world";
    }
}
