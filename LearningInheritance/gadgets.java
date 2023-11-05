package LearningInheritance;

public class gadgets {

	public static void main(String[] args) {
		smartwatch watch1 = new smartwatch ("IWatch","Apple","Black",10,100000);
/*A smartwatch can be all things that a smartphone can. It inherited everything from the smartphone*/
		
		watch1.details();
		/* O/P --> Model_Name:-IWatch
				   Brand_Name:-Apple*/
		
		

	}

}
