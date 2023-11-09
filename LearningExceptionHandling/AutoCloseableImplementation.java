package LearningExceptionHandling;

public class AutoCloseableImplementation {

	public static void main(String[] args) {
		
		try(AutoClosableExample ace1 = new AutoClosableExample();)
		{
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	
	//we basically created a class that implements autocloseable interface and is called here.

}
