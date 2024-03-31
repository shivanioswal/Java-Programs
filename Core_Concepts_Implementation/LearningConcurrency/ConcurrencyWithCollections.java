package LearningConcurrency;

import java.util.*;
import java.util.concurrent.*; //very IMP to include for CopyOnWriteArrayList

public class ConcurrencyWithCollections {

	public static void main(String[] args) {
		
		Mine m1 = new Mine();
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				m1.add(); //calls the add method of the mine class
			}
		});
		
		Thread t2 = new Thread(new Runnable()
				{
			public void run()
			{
				m1.print();
			}
				});
	t1.start(); //opens a new thread and gives it execution 
	try {
		Thread.sleep(3000); /*because if not slowed down then t2 starts executing before t1 thread and nothing gets added as add method is 
		triggered in t1. Empty printing would happen. Main thread sleeps here for 3000 milliseconds and then the second thread is made for printing */
		
	}
	catch(InterruptedException e)
	{
		e.printStackTrace();
	}

/*try {
	t1.join();
	Thread.sleep(200); /*Will wait till the t1 thread completes and then will join it to the main thread to complete thread 2nd then print.The problem with 
	multiprogramming is that it lets the first thread execute first and then the second so this is not exactly multiprogramming. We need that the adding and 
	printing should be done exactly at the same time. So the solution for this was a CopyOnWriteArrayList instead of ArrayList 
} catch(InterruptedException e)
{
	e.printStackTrace();
}*/
	
	t2.start();  //opens a new thread and gives it execution

}
}

class Mine {
	
	List<Integer> arr= new CopyOnWriteArrayList<Integer>(); /*Collections framework in Java are not allowed to be synchronized. Thread modification is not allowed in an collection 
	We had the same arrayList in which we added and printed the elements. We cannot read the values as we add them into collection so java gives the 
	ConcurrentModificationException*/ 
	
	
	
	public void add() //adds a number in arraylist and also prints out that the number is added
	{
		for(int i=0;i<100;i++) {
			arr.add(i);
			System.out.println("Added");
			try {
				Thread.sleep(100);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}

public void print() //It will just print out the elements from the list
{
	for(int i:arr)
	{
		System.out.println(i);
		System.out.println("printed");
		try {
			Thread.sleep(10);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
}
}


