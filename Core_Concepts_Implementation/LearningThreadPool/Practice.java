package LearningThreadPool;
import java.util.concurrent.*;
public class Practice {

	public static void main(String[] args) {
		
		ExecutorService executor = Executors.newFixedThreadPool(2);
/*Need to specify the number of threads this thread pool will be using.Automatically threads will be assigned to the tasks but the no.of them used will
only be 2*/
/* Since this message class implements runnable interface, We can declare it of the runnable type and then the object would be of message type.
 Implements Polymorphism*/
		
		 
		Runnable message0 = new Message(0);
		executor.execute(message0);
		
		Runnable message1 = new Message(1);
		executor.execute(message1);
		
		Runnable message2 = new Message(2);
		executor.execute(message2);
		
		Runnable message3 = new Message(3);
		executor.execute(message3);
		
		executor.shutdown(); //if we do not shutdown the program will keep on running again and again  
		//executor.shutdownNow()
		//as soon as java will read shutdownnow it will just close the executor even if the executor has to do many tasks but abruptly terminated so java gives sleep interrupted error to us 
		
		try {
			executor.awaitTermination(20, TimeUnit.SECONDS);
		} catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		//awaitTerminator waits for the thread pool to complete the task and then prints out everything
		System.out.println("Everything's done");
	}
}
