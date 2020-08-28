class Hello{
  constructor(){
    this._msg = null;
  }
  getMsg(){
    return this._msg;
  }
  setMsg(msg){
    if(msg != null
      && msg != ""
      && msg != undefind)
      this._msg = msg;
    return this;
  }
)
class HelloBuilder{
  Hello _hello = null;
  constructor(Hello hello){
    if(hello.getMsg() != null)
      this._hello = hello;
    else {
      throw new Exception();
    }
  }
}

function main(){
  let hello = new Hello();
  hello.setMsg("Hello World");
  let builder = new HelloBuilder(hello);
}
