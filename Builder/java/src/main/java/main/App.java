package main;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
		Builder build = new Builder()
				.Age(1)
				.First("John")
				.Last("Doe")
				.Location("Toledo, Ohio");
		HelloWorldBuilder obj = new HelloWorldBuilder(build);
        System.out.println( obj.getMessage() );
    }
}
