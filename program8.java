package programs;

/*Write a Java program to convert a string to lowercase*/

import java.util.*;
public class program8
{
	public static void main(String[] args)
	{
		System.out.println("Enter a string in uppercase:-");
		Scanner sc=new Scanner(System.in);
		String string = sc.next();
		String lowercase = string.toLowerCase();
		System.out.println("Lowercase String:-\n"+lowercase);
		sc.close();
		
	}
}
/*
O/P-->
Enter a string in uppercase:-
SHIVANI
Lowercase String:-
shivani

*/