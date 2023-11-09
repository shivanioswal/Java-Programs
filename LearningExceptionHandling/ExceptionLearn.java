package LearningExceptionHandling;
import java.io.*;
import java.util.Scanner;

public class ExceptionLearn {

	public static void main(String[] args) throws FileNotFoundException {
		
		File f1 = new File("testing.txt");
		try  //Will try to execute everything in the block but if error comes it will give relevant details to the user by executing the catch block.
		{
			Scanner sc = new Scanner(f1);
			while(sc.hasNext())
			{
				String s = sc.next();
				System.out.println(s);
				
			}
			sc.close();
		}
		catch(FileNotFoundException e)  //Activated when the try block has some errors or issues in executing and give relevant details to the user.
		{
			System.out.println("File Not Found");
			e.printStackTrace();
		}
		
		
	}

}
