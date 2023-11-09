package LearningGenerics;

/* public class GenericsPractice {
	
	int num1;
	int num2;
	
	GenericsPractice(int num1,int num2)
	{
		this.num1=num1;
		this.num2=num2;
		
	
	}
	
	public int get1()
	{
		return num1;
	}
	
	public int get2()
	{
		return num2;
	}
	
	public int add(int num1,int num2)
	{
		return num1+num2;
	}

}Normal program that only takes integer datatype*/

public class GenericsPractice<i1,i2> {
	
	i1 num1;
	i2 num2;
	
	GenericsPractice(i1 num1,i2 num2)
	{
		this.num1=num1;
		this.num2=num2;
		
	
	}
	
	public i1 get1()
	{
		return num1;
	}
	
	public i2 get2()
	{
		return num2;
	}
	
	

}
