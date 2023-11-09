package Producer_ConsumerProblem;
import java.util.*;
public class Consumer implements Runnable  {
		
	List<Integer> product_list = null;
	int limit=5;
	int product_no;
	
	public Consumer(List<Integer> product_list)
	{
		this.product_list = product_list;
	}
	
	public void TakeProduct() throws InterruptedException {  //It will take the product from the product list 
		
		//Lock on product list
		synchronized(product_list)
		{
			while(product_list.isEmpty())
			{
				System.out.println("No products to take !");
				product_list.wait(); //consumer thread will communicate with the producer thread that I am waiting for you to add products in the product list 
			}
		}
		synchronized(product_list) {
			Thread.sleep(5000); //It takes little time to take out the elements from the product list 
			System.out.println("Taken product"+" "+product_list.remove(0)); //for simplicity taking out the 1st product from the product list 
			
			product_list.notify(); //notifies producer that I have taken a product from the product list 
		}
		
		
	}	
	public void run() //Infinite loop to keep on adding the products again and again
	{
		while(true)
		{
			try {
				TakeProduct();
				product_no--;
			} catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
	
}
