package LearningAbstractClass;

public abstract class smartphone {
	
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
		System.out.println("The model_name is:-"+model_name+"\nThe brand_name is:-"+brand_name);
	}

	public abstract void gaming();
	
	public void playGames()
	{
		System.out.println("Smartphone can play games");
	}
	
}
