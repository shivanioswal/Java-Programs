package Producer_ConsumerProblem;
import java.util.concurrent.*;
public class ArrayBlockingConsumer implements Runnable{
	
	BlockingQueue<Integer> product_list=null;
	int product_no;
	
	public ArrayBlockingConsumer(BlockingQueue<Integer> product_list)
	{
		this.product_list = product_list;
	}
	
	public void run()
	{
		while(true)
		{
			try {
				Thread.sleep(1000);
				System.out.println("Taken the product"+" "+product_list.take());
				//take() is a thread safe method modification of remove method. Take will throw an exception and also returns the value which it has taken
			}catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
	
	

}
