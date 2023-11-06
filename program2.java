/* Write a program to take 3 numbers from the keyboard and display addition */

import java.util.*;
public class program2
{
	int add(int num1,int num2, int num3)
	{
		int addition=num1+num2+num3;
		 System.out.println("Addition is:-"+addition);
		 return addition;
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 3 numbers:-");
		 int num1=sc.nextInt();
		 int num2=sc.nextInt();
		 int num3=sc.nextInt();
		 program2 p=new program2();
		 p.add(num1, num2, num3);
		 sc.close();
		 
		 
	}
}

/*
O/P --->
Enter 3 numbers:-
1
2
3
Addition is:-6
*/