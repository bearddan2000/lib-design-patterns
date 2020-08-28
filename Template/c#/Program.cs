using System;
using HelloWorld;

namespace Designs.Template
{
    public class Program : IAction
    {
        public void Action()
        {
            HelloTemplate template = new HelloTemplate();
            Console.WriteLine(template.getTitle());
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
