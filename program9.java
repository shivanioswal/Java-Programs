package programs;
/* Write a Java Program to replace spaces with underscores */

import java.util.*;
public class program9
{
	public static void main(String[] args)
	{
		System.out.println("Enter spaces and see it get replaced with underscores");
		Scanner sc = new Scanner(System.in);
		String spaces = sc.nextLine();
		String underscore = spaces.replace(' ', '_');
		System.out.println("Output:-\n"+underscore);
		sc.close();
	}
}
/*
O/P-->
Enter spaces and see it get replaced with underscores

Output:-
_____

*/