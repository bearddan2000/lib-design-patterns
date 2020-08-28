using System;
using System.Linq;
using HelloWorld.Interfaces;

namespace HelloWorld
{
    public class FRHello : IHello, INotify, IStrategy
    {
        #region Fields
        private const String NOTIFY = "French";
        private String message = String.Empty;
        #endregion

        #region constructors
        public FRHello() { }

        public FRHello(String message)
        {
            this.setMessage(message);
        }
        #endregion

        #region Impl IHello
        public String getMessage() { return this.message; }

        public IHello setMessage(String m)
        {
            if (!String.IsNullOrEmpty(m))
            {
                this.message = m;
            }
            return this;
        }
        #endregion

        #region Impl INotify
        public void notified()
        {
            Console.WriteLine("{0} have been notified", NOTIFY);
        }
        #endregion

        #region Impl IStrategy
        public String alterMessage(String message)
        {
            if (String.IsNullOrEmpty(message))
                return this.getMessage();
            String[] msg = message.Split();
            var first = msg.First();
            var last = NOTIFY;
            return String.Format("{0} {1}\n", last, first);
        }
        #endregion
    }
}
