package LearningExceptionHandling;

public class UserDefinedException {
	
	public int multiply20(int a) throws Exception
	{
		int ans = 20*a;
		if(ans>=100)
		{
			throw new RtException("The value is greater than 100");
		}
		return ans;
	}
	


}
//Called in the class InputOutput
