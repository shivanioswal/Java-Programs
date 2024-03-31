package LearningInterface;

public class smartwatch extends smartphone implements gamable {
		
	public smartwatch(String model_name, String brand_name, String colour, int screensize_inches, int price) {
		super(model_name, brand_name, colour, screensize_inches, price);
	}
	
	public void playGames()
	{
		System.out.println("A smartwatch cannot playgames :-(");
	}
	
	}
		

