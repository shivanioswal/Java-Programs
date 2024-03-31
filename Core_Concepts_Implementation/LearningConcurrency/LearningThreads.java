package LearningConcurrency;

public class LearningThreads {

	public static void main(String[] args) {
		
		
		Task t1 = new Task();
		t1.start();
		System.out.println("Happy"); //Happy gets printed first as thread takes time to implement completely so in mean time happy gets printed.

	}

}
class Task extends Thread {
	public void run()
	{
		for(int i=0;i<100;i++)
		{
			System.out.println("i="+i);
		}
	}
}
