package Producer_ConsumerProblem;
import java.util.*;
public class Practice {

	public static void main(String[] args) {
		
		List<Integer> product_list = new ArrayList<Integer>(); //Implementing shared memory as the product list is being shared between both the producer and the consumer 
		
		Thread t1 = new Thread(new Producer(product_list)); //takes in constructor of producer
		
		Thread t2 = new Thread(new Consumer(product_list)); //takes in constructor of consumer
		
		t1.start();
		t2.start();

	}

}
