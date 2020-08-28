using System;
using HelloWorld;

namespace Designs.Strategy
{
    public class Program : IAction
    {
        public void Action()
        {
            FRHello fRHello = new FRHello("Salute tous");

            ESHello eSHello = new ESHello();

            DEHello dEHello = new DEHello();
            dEHello.setMessage("Gutten tag");

            HelloStrategy strategy = new HelloStrategy();
            var test1 = strategy.alterMessage(fRHello, null); // expected tous Salute
            var test2 = strategy.alterMessage(eSHello, "Hola ya"); // expected ya Spanish
            var test3 = strategy.alterMessage(dEHello, "Alles clar"); // expected clar Alles
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
