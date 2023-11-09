package LearningInterface;

public class smartphone  {
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
		
public void playGames()
		{
			System.out.println("A smartphone can play Games");
		}
	}



