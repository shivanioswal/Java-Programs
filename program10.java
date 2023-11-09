package programs;
/* Write a Java Program to detect double and triple spaces in a string */
import java.util.*;
public class program10
{
	public static void main(String[] args)
	{
		System.out.println("Enter a string with double and triple spaces and see it get detected:-");
		Scanner sc = new Scanner(System.in);
		String string = sc.nextLine();
		if(string.indexOf("  ") > 0)
		{
			System.out.println("There are double spaces in your string");
			
		}
		else
		{
			System.out.println("There are no double spaces in your string");
		}
		if(string.indexOf("   ") > 0)
		{
			System.out.println("There are triple spaces in your string");
		}
		else
		{
			System.out.println("There are no triple spaces in your string");
		}
		
		sc.close();
		
		
	}
}
/*
O/P-->
Enter a string with double and triple spaces and see it get detected:-
a  b   c
There are double spaces in your string
There are triple spaces in your string

*/