package LearningAbstractClass;

public class smartwatch extends smartphone {
	
	public smartwatch(String model_name, String brand_name, String colour, int screensize_inches, int price) {
		super(model_name, brand_name, colour, screensize_inches, price);
	}
	
	//will give error if we do not implement the abstract method gaming
	
	public void gaming()
	{
		System.out.println("Gaming not possible");
	}

}
