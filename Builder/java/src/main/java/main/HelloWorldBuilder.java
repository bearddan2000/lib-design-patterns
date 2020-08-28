package main;

import java.util.logging.Level;
import java.util.logging.Logger;
import main.algorithm.FirstNameLeaf;

/***
 * Wrapper class for dependency class HelloWorld
 * @author Daniel Beard
 *
 */
public class HelloWorldBuilder extends main.HelloWorld{
	Builder mBuilder;
	
	public HelloWorldBuilder() {}

	public HelloWorldBuilder(Builder hello)
	{
		//hello.Age(-1);
		
		FirstNameLeaf tree = new FirstNameLeaf();
		
		try {
			tree.test(hello);
		} catch (Exception e) {
            Logger.getLogger(HelloWorldBuilder.class.getName()).log(Level.SEVERE, null, e);
		}
		this.mBuilder = hello;
		build();
	}
	
	private void build()
	{
		mMessage = "Hello World";
		mMessage += ", " + mBuilder.getFirst();
		mMessage += " " + mBuilder.getLast();
		mMessage += " age " + mBuilder.getAge();
		mMessage += " at " + mBuilder.getLocation();		
	}
	
	
	/**
	 * @return the mMessage
	 */
	public String getMessage() {
		return super.mMessage;
	}

	/**
	 * @param message the mMessage to set
	 */
	public void setMessage(String message) {
		super.mMessage = message;
	}
}
