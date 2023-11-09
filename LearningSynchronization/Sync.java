package LearningSynchronization;
//import java.util.*;
public class Sync {

	public static void main(String[] args) {
		
		Task a1  = new Task(); //Made 1 instance of Task and gave to 2 threads.
		work w1 = new work(a1); //Gave object of task class
		
		w1.start();
		work w2 = new work(a1); //Gave object of Task class
		w2.start();
		//val=val+1
		
	}

}

class work extends Thread {
	
	Task t1 = null;
	
	public work (Task t1)
	{
		this.t1 = t1;
	}
	public void run()
	{
		
		for(int i=0;i<100;i++)
		{
			System.out.println(Thread.currentThread().getName()+" "+ t1.increase());
			try {
				Thread.sleep(500);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
}
/*If you closely observe the output some numbers are repeating for certain threads and some numbers don't exist for some threads and this is a problem which arises when
 you use a shared memory for the threads. The values gets mixed up and give a wrong output, because val is a shared variable among the 2 threads.When one thread is reading the value
 the other thread comes and changes the data which the first thread would've read hence there are many discrepancies*/
/*Required Output -->The thread is actually stopping on val=val+1, and is not executing completely and increasing the value.The control just reads the value
 of VAL and the control shifts from one thread to another We want that 1 thread should completely execute and then another
 thread should pick the fix value, there should be no change in the data. One moment only 1 thread should be using val function and then anther thread */
/*For achieving the following we will use the synchronized(this) variable*/
