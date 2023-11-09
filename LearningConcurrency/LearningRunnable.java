package LearningConcurrency;

public class LearningRunnable {

	public static void main(String[] args) {
		
		/*System.out.println("Thread 1 starting");
		Practice p1 = new Practice("First Thread");
		p1.run();
		
		System.out.println("Thread 2 starting");
		Practice p2 = new Practice("Second Thread");
		p2.run(); This implements as a normal program and no multithreading involved. To implement multithreading using runnable interface use the below method */
		
		System.out.println("Thread 1 starting");
		Practice p1 = new Practice("First Thread");
		Thread ta = new Thread(p1);
		ta.run();
		
		System.out.println("Thread 2 starting");
		Practice p2 = new Practice("Second Thread");
		Thread tb = new Thread(p2);
		tb.run(); //Now implements multithreading using runnable interface.

	}

}
class Practice implements Runnable {
	
	String name;
	
	public Practice(String name)
	{
		this.name = name;
	}
	
	public void run()
	{
		Thread.currentThread().setName(this.name);
		for(int i=0;i<100;i++)
		{
			System.out.println("i="+i+" "+Thread.currentThread().getName());
		}
		try
		{
			Thread.sleep(100);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
}
