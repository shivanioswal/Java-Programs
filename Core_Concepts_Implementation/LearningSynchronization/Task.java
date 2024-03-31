package LearningSynchronization;

public class Task {
	int val=0;
	
	public int increase()
	{
		synchronized(this) /*Both of the below lines will get executed before the control shifts from one thread to another*/
		{
			val+=1;
			return val;
		}
		
	}
		
}//now all unique values come
//Just increases the value of val and then returns it 
/*public synchronized int increase() //alternate way of doing it, tells java that all the line below this method signature has to be in sync means 
 1 time 1 thread next time control goes to another thread
 
public class Task {
	int val =0;
	public synchronized int increase)
{
		val+=1;
		return val;
	
	
}
	
}*/
