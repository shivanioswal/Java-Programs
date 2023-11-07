package programs;
/*Write a program to calculate percentage of a given student in board exam. His marks from 5 subjects must be taken as input from the keyboard. (Marks are
 out of 100 but even if marks are out of 80, your program should run)*/

/*TIP: Use only one Scanner throughout the program and close it at the end. Don't forget to increment the while loop */

import java.util.*;
public class program3
{
	public static void main(String[] args)
	{
		int subjects=1;
		System.out.println("Enter the total marks of a subject");
		Scanner sc=new Scanner(System.in);
		int submark =sc.nextInt();
		int totalsubmarks=0;
		int subjectMark=0;
		
		while(subjects<=5)
		{
			System.out.println("Enter the marks of Subject "+subjects);
			
			subjectMark=sc.nextInt();
			totalsubmarks = totalsubmarks+subjectMark;
			subjects++;
	    }
		
		float percentage = (totalsubmarks*100)/(submark* 5);
		System.out.println("The percentage of student is:- " + percentage);
		sc.close();
	}
}
