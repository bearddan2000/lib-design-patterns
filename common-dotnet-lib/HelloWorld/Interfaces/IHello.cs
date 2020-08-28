using System;
namespace HelloWorld.Interfaces
{
    public interface IHello
    {
        IHello setMessage(String m);
        String getMessage();
    }
}
