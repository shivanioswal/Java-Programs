package programs;
import java.util.*;
/*Write a Java program which asks the user his/her name and greets them with "Hello <name>, have a good day" text*/
public class program4
{
	public static void main(String[] args)
	{
		String name;
		System.out.println("Enter your name:");
		Scanner sc=new Scanner(System.in);
		name=sc.nextLine();
		
		System.out.println("Hello "+name+",have a good day");
		sc.close();
	}
}
/*
O/P-->
Enter your name:
shivani
Hello shivani,have a good day
*/