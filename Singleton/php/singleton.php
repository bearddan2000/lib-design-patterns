<?php
  class singleton{
    private singleton instance = null;

    private __construct(){}

    public function getInstance(){
      if(is_null($this->instance)){
        $this->instance = new singleton;
      }
      return $this->instance;
    }

  }
?>
