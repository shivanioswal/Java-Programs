package LearningWildCards;
import java.util.*;
public class MoreOnWildCards {

	public static void main(String[] args) {
		
		ArrayList<Apple>arr = new ArrayList<>();
		arr.add(new Apple());
		arr.add(new Apple());
		fxn1(arr); //now since we've declared in the below function as apple extends fruit so fxn1 will also allow to take arr which belongs to Apple
		
	}
	
	public static void fxn(ArrayList<Apple>arr)
	{
		for(Apple ap: arr)
		{
			ap.eat();
		}
	}
	
	public static void fxn1(ArrayList<? extends Fruits>arr)
	{
		for(Fruits ft: arr)
		{
			ft.eat();
		}
	}

}
