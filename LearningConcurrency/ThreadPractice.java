package LearningConcurrency;

public class ThreadPractice {

	public static void main(String[] args) {
		
		System.out.println("Thread 1 starting");
		Exe t1 = new Exe();
		t1.start();
		
		System.out.println("Thread 2 starting");
		Exe t2 = new Exe();
		t2.start();
	}
}
class Exe extends Thread {
	public void run()
	{
		for(int i=0;i<100;i++)
		{
			System.out.println("i="+i+Thread.currentThread().getName());
			
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
/* Here the name of the threads is given by Java and the threads get executed in an intermixed format*/
