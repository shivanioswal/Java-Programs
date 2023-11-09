package LearningCollections;
import java.util.*;

public class LinkedHashSetPractice {

	public static void main(String[] args) {
		
		{
			LinkedHashSet<String>set = new LinkedHashSet<String>();
			set.add("Apple");
			set.add("Ball");
			set.add("Cat");
			set.add("Dragon");
			
			for(String x: set)
			{
				System.out.println(x);
			}
		}

	}

} //All have been displayed in the order in which they were added unlike HashSets ! 
