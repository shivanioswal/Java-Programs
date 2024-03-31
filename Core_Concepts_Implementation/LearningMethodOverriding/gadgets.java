package LearningMethodOverriding;

public class gadgets {

	public static void main(String[] args) {
		smartwatch watch1 = new smartwatch("Iwatch","Apple","Black",10,50000);
		watch1.playGames(); /*This is a problem when we have not overriden the method in the smartwatch class. The method playGames of smartphone class is not relevant to the smartwatch class 
		hence we need to method override it with the relevant method*/
		
		//Now displays the information correctly.
		
		tablet tab1 = new tablet("tab1", "Samsung","Black",10,50000);
		tab1.playGames();
		

	}

}
