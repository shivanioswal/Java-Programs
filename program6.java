package programs;
/* Write a program to detect whether a number entered by the user is integer or not -- "You will learn usage of hasNextInt()" */
import java.util.*;
public class program6
{
	public static void main(String[] args)
	{
		System.out.println("Enter a number:-");
		Scanner sc= new Scanner(System.in);
	    boolean num = sc.hasNextInt();
	    if(num==true)
	    {
	    	System.out.println("Number is Integer");
	    }
	    else
	    {
	    	System.out.println("Number is not Integer");
	    }
		sc.close();
	}
}
/*
O/P-->
Enter a number:-
3
Number is Integer
-----------------
Enter a number:-
2.1
Number is not Integer

*/