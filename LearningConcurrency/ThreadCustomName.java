package LearningConcurrency;

public class ThreadCustomName {

	public static void main(String[] args) {
		
		System.out.println(" Thread 1 starting");
		CustomName c1 = new CustomName("1st Thread");
		c1.run();
		
		System.out.println(" Thread 2 starting");
		CustomName c2 = new CustomName("2nd Thread");
		c2.run();
		

	}

}

class CustomName extends Thread {
	
	String name;
	
	public CustomName(String name)
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
