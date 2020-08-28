class Hello {
  printMessage(){
    console.log("Hello World.")
  }
}

class FR extends Hello{
  printMessage(){
    console.log("Salut, toute le monde.")
  }
}

class ES extends Hello{
  printMessage(){
    console.log("Hola, todos el mundo.")
  }
}

class GR extends Hello{
  printMessage(){
    console.log("Tag, auf die Weild.")
  }
}

class Observer{
  constructor(){
    this._data = [];
  }
  subscribe(obj){
    if(obj.instanceOf(Hello))
      this._data.push(obj)
    return this;
  }
  unsubscribe(){
    if(this._data == 0)
      return;
    this._data.pop()
  }
  notifyAll(){
    for(let i : this._data)
      this._data[i].printMessage();
  }
}

function main(){
  obj = new Observer();
  obj.subscribe(new Hello())
  .subscribe(new FR())
  .subscribe(new ES())
  .subscribe(new GR())
  .notifyAll()
}
