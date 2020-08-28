using System;
using HelloWorld.Interfaces;

namespace HelloWorld
{
    public class Hello : IHello
    {
        #region Fields
        private String message = String.Empty;
        #endregion

        #region Impl IHello
        public String getMessage() { return this.message; }

        public IHello setMessage(String m){ 
            if(!String.IsNullOrEmpty(m))
            {
                this.message = m;
            }
            return this;
        }
        #endregion

        public virtual String getTitle()
        {
            return " citizen.";
        }
    }
}
