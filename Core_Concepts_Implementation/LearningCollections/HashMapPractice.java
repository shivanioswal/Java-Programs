package LearningCollections;
import java.util.*;
public class HashMapPractice {

	public static void main(String[] args) {
		
		HashMap<Integer,String>map = new HashMap<Integer,String>();
		map.put(1, "one");
		map.put(2, "two");
		map.put(3, "three");
		map.put(4, "four");
		
		for(Integer n :map.keySet())
		{
			System.out.println(n); //only gets the keys
			String str = map.get(n);
			System.out.println(str); //gets the keys and the values too
		}
		
		//For simultaneously iterating through both the values
		
		for(Map.Entry<Integer,String>entry: map.entrySet())
		{
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
			
		}
		

	}

}
