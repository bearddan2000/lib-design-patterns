using System;
using HelloWorld;

namespace Designs.Decorator
{
    public class Program : IAction
    {
        public void Action()
        {
            HelloDecorator decorator = new HelloDecorator();
            Console.WriteLine(decorator.getMessage());
        }

        /*
         * Ment for accessing indivual namespaces 
        public static void Main(string[] arg)
        {
            Program p = new Program();
            p.Action();
        }
         */
    }
}
