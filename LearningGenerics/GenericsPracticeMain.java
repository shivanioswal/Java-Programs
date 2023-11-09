package LearningGenerics;

public class GenericsPracticeMain {

	public static void main(String[] args) {
	
		/* GenericsPractice o1 = new GenericsPractice(1,2);
		 int x = o1.add(1, 2);
		 System.out.println(x); Normal program that only takes integer datatype */
		
		GenericsPractice<Integer,String> o1=new GenericsPractice<Integer,String>(1,"Shivani");
		int x= o1.get1();
		String str = o1.get2();
		System.out.println(x+"\n"+str);
		
		//With generics any dataype at this point could be processed in the program.
	}

}
