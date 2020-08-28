using System;
using HelloWorld;

namespace Designs.Decorator
{
    public class HelloDecorator
    {
        private Hello hello;

        public HelloDecorator()
        {
            this.hello = new Hello();
            this.hello.setMessage("Hello World");
        }

        public String getMessage()
        {
            return this.hello.getMessage() + ", we come in peace";
        }
    }
}
