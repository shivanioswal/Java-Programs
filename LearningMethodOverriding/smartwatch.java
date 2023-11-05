package LearningMethodOverriding;

public class smartwatch extends smartphone{
	
	public smartwatch(String model_name, String brand_name, String colour, int screensize_inches, int price){
		super(model_name, brand_name, colour, screensize_inches, price);
	}
	
	public void playGames()
	{
		System.out.println("A smartwatch cannot play games :-(");
	}
	/* Here we are using the concept of method overriding where we are overriding the playGames method in the smartwatch class to display the relevant information.
	 Remember that the method name has to be exactly same as in the parent class.
	 */

}
