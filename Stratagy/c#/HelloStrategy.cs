using System;
using HelloWorld.Interfaces;

namespace Designs.Strategy
{
    public class HelloStrategy
    {
        public String alterMessage(IStrategy strategy, String message)
        {
            return strategy.alterMessage(message);
        }
    }
}
