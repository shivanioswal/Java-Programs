package LearningExceptionHandling;


public class AutoClosableExample implements AutoCloseable {
	
	public void close() throws Exception
	{
		System.out.println("Closing all the resources");
	}
}
