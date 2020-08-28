using HelloWorld;

namespace Designs.Builder
{
    public class Program : Designs.IAction{ 
    public void Action()
        {
            Hello hello = new Hello();
            hello.setMessage("Hello world");

            HelloBuilder builder = new HelloBuilder(hello);
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
