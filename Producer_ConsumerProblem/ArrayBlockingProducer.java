package Producer_ConsumerProblem;
import java.util.concurrent.BlockingQueue;

public class ArrayBlockingProducer implements Runnable {
	
	BlockingQueue<Integer> product_list = null; //The only shared resource 
	int product_no;
	
	public ArrayBlockingProducer(BlockingQueue<Integer>product_list)
	{
		this.product_list = product_list;
	}
	
	public void run()
	{
		while(true)
		{
			try {
				synchronized(this) //not really required as these loc is not shared by different threads but we still add it 
				{
					int nextprod = product_no++;
					System.out.println("Added a new product"+" "+nextprod);
					product_list.put(nextprod);
//The put method is thread safe and made for the concurrent package only. Adds a new number to the BlockingQueue
				}
			}catch(InterruptedException e)
			{
				e.printStackTrace();
			}
			
		}
	}

}
