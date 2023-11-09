package LearningCollections;

import java.util.ArrayList;

public class ArrayListPractice {
		public static void main(String args[])
		{
			ArrayList<String> ar = new ArrayList<String>();
			ar.add("Apple");
			ar.add("mango");
			//ar.add(1);
			//ar.add(2);
			//ar.add(2.0);
			
			String str = ar.get(0); //Type casting it into a string
			System.out.println(str);
			String srt = ar.remove(0);
			System.out.println(srt);
			String stt = ar.get(0); //Type casting it into a string
			System.out.println(stt);
		}
}
