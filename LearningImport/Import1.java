package LearningImport;
import test.ReturnWorkingDemo; //importing a specific public class belonging to another package itself.
//The package as well as the class is public hence we could import.


public class Import1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c = ReturnWorkingDemo.multiply(10, 20);
		System.out.println(c);
	}

}
