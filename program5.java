package programs;
/* Write a Java Program to convert Kilometers to Miles */
import java.util.*;
public class program5
{
	public static void main(String[] args)
	{
		/* 1 Kilometer = 0.621371 Miles */
		
		System.out.println("Enter Kilometer Value:");
		Scanner sc = new Scanner(System.in);
		float kilo = sc.nextFloat();
		double miles =(kilo*0.621371);
		System.out.println("Miles:"+miles);
		sc.close();
		
	}
}
/*
O/P-->
Enter Kilometer Value:
2
Miles:1.242742
*/
