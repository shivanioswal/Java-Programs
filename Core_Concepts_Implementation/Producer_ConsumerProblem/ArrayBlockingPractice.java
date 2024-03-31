package Producer_ConsumerProblem;
//import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
//import java.util.concurrent.ArrayBlockingQueue;
public class ArrayBlockingPractice {

	public static void main(String[] args) {
		
		BlockingQueue<Integer> product_list = new ArrayBlockingQueue<Integer>(5);
/*ArrayBlockingQueue is the one which has a fixed size so we do not have to add the limit variable like previous program */
		Thread t1 = new Thread(new ArrayBlockingProducer(product_list));
		Thread t2 = new Thread(new ArrayBlockingConsumer(product_list));
		
		t1.start();
		t2.start();

	}

}
//ArrayBlockingQueue takes care of all the wait and notify methods that we did previously and reduced our code 
