using System;
using HelloWorld;

namespace Designs.Builder
{
    public class HelloBuilder
    {
        private Hello hello = null;

        public HelloBuilder(Hello h)
        {
            if (!String.IsNullOrEmpty(h.getMessage()))
                throw new Exception();
            this.hello = h;
        }
    }
}
