package programs;
/* Write a Java Program to encrypt a grade by adding 8 to it and decrypt it to show the correct grade */
/* You will learn important concept of Typecasting as well as some important predefined methods of Characters */

import java.util.*;

public class program7 
{
	public static void main(String[] args)
	{
		System.out.println("Enter your grade:");
		Scanner sc=new Scanner(System.in);
		
		char grade =sc.next().charAt(0); //This is the way you read characters in java. Cannot use next or nextLine etc
		
		if(Character.isUpperCase(grade)==true) /*To convert a char to uppercase or lowercase use isUpperCase and isLowerCase but also have to call the Character class and pass 
		char variable to it because we have the same functions in String as well which is 
		default so to use it for Character you will have to mention specifically the "Character" class in front of the methods */
		{
			
		}
		else
		{
			grade=Character.toUpperCase(grade);
		}
		int encrypt = grade+8; ///TypeCasting Char to integer
		
		System.out.println("Congratulations!!! Your Grade in encrypted !");
		
		System.out.println("Do you want to decrypt your grade ? Y/N");
		
		char answer = sc.next().charAt(0);
		if(answer=='y' || answer=='Y')
		{
			encrypt = encrypt-8;
			char decrypt = (char) encrypt; //Typecasting int to character again
			System.out.println(decrypt);
		}
		else
		{
			System.out.println("You're better with hidden grades :-)");
		}
		
		
		sc.close();
		
		
	}
	
}
/*
O/P-->
Enter your grade:
a
Congratulations!!! Your Grade in encrypted !
Do you want to decrypt your grade ? Y/N
y
A

*/
