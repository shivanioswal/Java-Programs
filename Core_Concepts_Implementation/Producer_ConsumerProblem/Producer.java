package Producer_ConsumerProblem;
import java.util.*;
public class Producer implements Runnable { //since implements runnable so you have to create the run method and override it
	
	List<Integer> product_list=null; //It contains the list of the products. Total number of products in product list
	int limit = 5; //cannot have more than this amount of products at a particular time
	int product_no; //Tells you on which product you're working
	
	//The product list will be the shared memory which will be in the producer as well as in the consumer programs
	
	public Producer(List<Integer> product_list)
	{
		this.product_list = product_list;
	}
	//producer will add products in the product list and consumers will remove the product from the product list with the help of constructor. 
	
	public void SeeProduct(int product_no) throws InterruptedException {
		
		//lock on product list
		synchronized(product_list) {
			while(product_list.size()==limit) //First checks that if the product list has reached its product limit or not.If product list reaches limit we can't add products to it
			{
				System.out.println("Demand OverLoad!");
				product_list.wait();
			}
		}
/* wait() communicates with the second thread i.e the consumer thread saying that I am waiting, consumer please take out the products asap*/
		synchronized(product_list) //passing this product list in synchronized parameter means the addition etc will be in sync, only 1 thread at a time gets to work on these LOC 
		{
			System.out.println("New Product: "+product_no); //We will reach here only if product_list size is less than 5.Printing product no that is being added to the list 
			product_list.add(product_no); //We will add product to the product list 
			Thread.sleep(100);
			product_list.notify();
		}
		
	}
//notify() tells consumer thread that yes another product has been added to the product_list
	
	public void run() //Infinite loop to keep on adding the products again and again
	{
		while(true)
		{
			try {
				SeeProduct(product_no);
				product_no++;
			} catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
}
