package main;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Rule;
import org.junit.rules.ExpectedException;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import main.algorithm.EnumExceptionMessages;

/**
 * Unit test for simple App.
 */
public class AppTest 
extends TestCase
{
	// let's us test exceptions
	@Rule
	public ExpectedException thrown = ExpectedException.none();

	/**
	 * Create the test case
	 *
	 * @param testName name of the test case
	 */
	public AppTest( String testName )
	{
		super( testName );
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite()
	{
		return new TestSuite( AppTest.class );
	}


	/**
	 * test simple hello World
	 */
	public void testHelloWorld()
	{
		final String message = "Hello World";
		HelloWorld obj = new HelloWorld();
		obj.setMessage(message);
		assertEquals(message, obj.getMessage());
	}
	/***
	 * test complete build
	 */
	public void testCompletedeBuild() {
		final String message = "Hello World, John Doe age 1 at Toledo, Ohio";
		Builder build = new Builder()
				.Age(1)
				.First("John")
				.Last("Doe")
				.Location("Toledo, Ohio");
		HelloWorldBuilder obj = new HelloWorldBuilder(build);
		assertEquals(message, obj.getMessage());
	}
	/***
	 * test age not set build
	 */
	public void testMissingAgeBuild() {
		Builder build = new Builder()
				//.Age(1)
				.First("John")
				.Last("Doe")
				.Location("Toledo, Ohio");
		this.builderException(build);
	}
	/***
	 * test age exception message
	 */
	public void testAgeExceptionMessage() {
		final String expected = "age can't be blank";
		final EnumExceptionMessages code = EnumExceptionMessages.AGE;
		final String actual = EnumHelper.getDescAnnotationValue(EnumExceptionMessages.class, code.name());
		assertEquals(expected, actual);		
	}
	/***
	 * test age not set message
	 */
	public void testMissingAgeMessageBuild() {
		final EnumExceptionMessages code = EnumExceptionMessages.AGE;
		Builder build = new Builder()
				//.Age(1)
				.First("John")
				.Last("Doe")
				.Location("Toledo, Ohio");
		this.builderExceptionMessage(build, code);
	}
	/***
	 * test first name not set build
	 */
	public void testMissingFirstBuild() {
		Builder build = new Builder()
				.Age(1)
				//.First("John")
				.Last("Doe")
				.Location("Toledo, Ohio");
		this.builderException(build);
	}
	/***
	 * test first exception message
	 */
	public void testFirstExceptionMessage() {
		final String expected = "first name can't be blank";
		final EnumExceptionMessages code = EnumExceptionMessages.FIRST;
		final String actual = EnumHelper.getDescAnnotationValue(EnumExceptionMessages.class, code.name());
		assertEquals(expected, actual);		
	}
	/***
	 * test first name not set message
	 */
	public void testMissingFirstMessageBuild() {
		final EnumExceptionMessages code = EnumExceptionMessages.FIRST;
		Builder build = new Builder()
				.Age(1)
				//.First("John")
				.Last("Doe")
				.Location("Toledo, Ohio");
		this.builderExceptionMessage(build, code);
	}
	/***
	 * test last name not set build
	 */
	public void testMissingLastBuild() {
		Builder build = new Builder()
				.Age(1)
				.First("John")
				//.Last("Doe")
				.Location("Toledo, Ohio");
		this.builderException(build);
	}
	/***
	 * test last name exception message
	 */
	public void testLastExceptionMessage() {
		final String expected = "last name can't be blank";
		final EnumExceptionMessages code = EnumExceptionMessages.LAST;
		final String actual = EnumHelper.getDescAnnotationValue(EnumExceptionMessages.class, code.name());
		assertEquals(expected, actual);		
	}
	/***
	 * test last name not set message
	 */
	public void testMissingLastMessageBuild(){
		final EnumExceptionMessages code = EnumExceptionMessages.LAST;
		Builder build = new Builder()
				.Age(1)
				.First("John")
				//.Last("Doe")
				.Location("Toledo, Ohio");
		this.builderExceptionMessage(build, code);
	}
	/***
	 * test location not set build
	 */
	public void testMissingLocationBuild() {
		Builder build = new Builder()
				.Age(1)
				.First("John")
				.Last("Doe");
		//.Location("Toledo, Ohio");
		this.builderException(build);
	}
	/***
	 * test location exception message
	 */
	public void testLocationExceptionMessage() {
		final String expected = "location can't be blank";
		final EnumExceptionMessages code = EnumExceptionMessages.LOCATION;
		final String actual = EnumHelper.getDescAnnotationValue(EnumExceptionMessages.class, code.name());
		assertEquals(expected, actual);		
	}
	/***
	 * test location not set message
	 */
	public void testMissingLocationMessageBuild() {
		final EnumExceptionMessages code = EnumExceptionMessages.LOCATION;
		Builder build = new Builder()
				.Age(1)
				.First("John")
				.Last("Doe");
		//.Location("Toledo, Ohio");
		this.builderExceptionMessage(build, code);
	}
	private void builderException(Builder build)
	{
		// redirect stderr, we expect an exception we don't need the stack trace
		final ByteArrayOutputStream myOut = new ByteArrayOutputStream();
		System.setErr(new PrintStream(myOut));
		
		try {
			HelloWorldBuilder obj = new HelloWorldBuilder(build);
		} catch(Exception e){
			thrown.expect(Exception.class);
		}

	}
	private void builderExceptionMessage(Builder build, final EnumExceptionMessages code)
	{
		// redirect stderr, we exception we don't need the stack trace
		final ByteArrayOutputStream myOut = new ByteArrayOutputStream();
		System.setErr(new PrintStream(myOut));
		
		final String errorMessage = EnumHelper.getDescAnnotationValue(EnumExceptionMessages.class, code.name());
		try {
			HelloWorldBuilder obj = new HelloWorldBuilder(build);
		} catch(Exception e){
			thrown.expect(Exception.class);
			thrown.expectMessage(errorMessage);
		}

	}
}
