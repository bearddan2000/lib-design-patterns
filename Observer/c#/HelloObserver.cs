using System;
using System.Collections.Generic;
using HelloWorld;

namespace Designs.Observer
{
    public class HelloObserver
    {
        List<HelloWorld.Interfaces.INotify> list = new List<HelloWorld.Interfaces.INotify>();

        public HelloObserver subscribe(HelloWorld.Interfaces.INotify observerable)
        {
            list.Add(observerable);
            return this;
        }

        public void unsubscribe()
        {
            if(list.Count - 1 > 0)
                list.RemoveAt(list.Count - 1);
        }

        public void notifyAll()
        {
            for(var i = 0; i < list.Count - 1; i++)
            {
                HelloWorld.Interfaces.INotify notify = list[i];
                notify.notified();
            }
        }
    }
}
