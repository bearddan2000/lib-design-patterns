function say(args){
  if(args == 0)
    return "say hello";
  else if (args == 1) {
    return " to a friend";
  }
  else {
    return " and goodby to someone else";
  }
}
class pipe{
  constructor(){
    this._functionCalls = [];
    this._result = null;
  }
  add(call, args){
    if(call != null && call != undefined && args != null)
      this._functionCalls.push(call(args));
    return this;
  }
  eval(){
    for (var i = 0; i < this_functionCalls.length; i++) {;
      this._result += this_functionCalls[i];
    }
    return this._result;
  }
}

let obj = new pipe();
let x = obj.add(say, 0)
  .add(say, 1)
  .add(say, 2)
  .eval();
console.log(x);
