<?php
class hello
{
    private string $msg = null;
    public function getMessage()
    {
        return $this->msg;
    }
    public function setMessage(string $message)
    {
        if (!is_null($message) && !is_empty($message)) {
            $this->msg = $message;
        }
        return $this;
    }
}
  class builder
  {
      private hello $hello = null;

      public function construct(hello $obj)
      {
          if (is_null($obj->getMessage())) {
              throw new \Exception('message is null', 1);
          }
          $this->hello = $obj;
      }
  }
$oHello = new hello();
$oHello->setMessage("hello world");
$oBuilder = new builder($oHello);
