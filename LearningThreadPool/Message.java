package LearningThreadPool;

public class Message implements Runnable {

	int message;
	
	public Message(int message)
	{
		this.message = message;
	}
	
	public void run()
	{
		System.out.println("Message : "+message+"Received by - :"+Thread.currentThread().getName());
		try {
			Thread.sleep(3000);
		} catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}//run method will just tell the message received by it

}
