using System;
using HelloWorld;

namespace Designs.Observer
{
    public class Program : Designs.IAction
    {
        public void Action()
        {
            HelloObserver helloObserver = new HelloObserver();
            helloObserver
            .subscribe(new FRHello())
            .subscribe(new ESHello())
            .subscribe(new DEHello())
            .notifyAll();
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
