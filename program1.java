/* Write a Java Program to add 3 numbers */

public class program1
{
	int add(int num1,int num2,int num3)
	{
		int addition=num1+num2+num3;
		System.out.println("Addition of numbers is:"+addition);
		return addition;
	}


	
	public static void main(String[] args)
	{
		program1 p=new program1();
		p.add(1,2,3);
	}
}
/*
O/P --> Addition of numbers is:6
*/
		