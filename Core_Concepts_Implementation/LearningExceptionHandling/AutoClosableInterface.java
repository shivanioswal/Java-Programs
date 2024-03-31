package LearningExceptionHandling;
import java.io.*;

public class AutoClosableInterface {

	public static void main(String[] args) {
		
		File f1 = new File("testing.txt");
		
		try(FileReader fr = new FileReader(f1); BufferedReader bf = new BufferedReader(fr); )
		{
			String f = bf.readLine();
			while(f!=null)
			{
				System.out.println(f);
				f=bf.readLine();
			}
		}
		
		catch(FileNotFoundException e)
		{
			System.out.println("File not found");
		}
		
		catch(IOException e)
		{
			System.out.println("IO Exception");
		}
	}
//Here you can observe that we did not have to use the finally block after the try catch block to close the bufferedReader. It automatically got closed after try got executed

}
