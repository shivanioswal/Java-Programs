package LearningInheritance;

public class smartphone {
	
	String model_name;
	String brand_name;
	String colour;
	int screensize_inches;
	int price;
	
	public smartphone(String model_name, String brand_name, String colour, int screensize_inches, int price)
	{
		
		this.model_name = model_name;
		this.brand_name = brand_name;
		this.colour = colour;
		this.screensize_inches = screensize_inches;
		this.price = price;
		
	}
	
	public void details()
	{
		System.out.println("Model_Name:-" +model_name);
		System.out.println("Brand_Name:-" +brand_name);
	}
	
	public void turnon()
	{
		System.out.println("Smartphone is turning on");
	}
	
	public void turnoff()
	{
		System.out.println("Smartphone is turning off");
	}
	
	public void call()
	{
		System.out.println("Smartphone is making a call");
	}


}
