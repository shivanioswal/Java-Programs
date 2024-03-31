package LearningExceptionHandling;
import java.io.*;
public class BuffReader
{
	public static void main(String args[]) throws Exception  //Do not forget to write main method
	{
	File f1 = new File("testing.txt");
		BufferedReader bf = null ;
		
		try
		{
			FileReader fr = new FileReader(f1);
			bf = new BufferedReader(fr);
			String f = bf.readLine();
			
			while(f!=null)
			{
				System.out.println(f);
				f=bf.readLine();
			}
		}
		
		catch(FileNotFoundException e)
		{
			System.out.println("File not Found");
		}
		catch(IOException e)
		{
			System.out.println("IO Exception");
		}
		finally
		{
			bf.close();
		}

	}


}
