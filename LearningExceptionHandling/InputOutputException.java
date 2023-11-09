package LearningExceptionHandling;

public class InputOutputException {

	public static void main(String[] args) {
		
		UserDefinedException usd1 = new UserDefinedException();
		try
		{
			int c = usd1.multiply20(2);
			System.out.println(c);
		}
		
		catch(Exception e)
		{
			System.out.println("Returned number is too big");
			e.printStackTrace();
		}

	}

}
