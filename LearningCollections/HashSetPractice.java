package LearningCollections;
import java.util.*;

/*public class HashSetPractice {

	public static void main(String[] args) {
		
		HashSet<Integer>set = new HashSet<Integer>();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(10);
		set.add(3);
		
		for(Integer x:set)
		{
			System.out.println(x);
		}
	}
} 	O/P -->
	1
	2
	3
	10

Duplicate values are always elimintaed in hashsets. Hashsets do not have any order to display the elements. See the example below, todisplay in order use linkedhashset */
public class HashSetPractice {

	public static void main(String[] args) {
		
		HashSet<String>set = new HashSet<String>();
		set.add("Mango");
		set.add("Ball");
		set.add("Cat");
		set.add("Dragon");
		set.add("Elephant");
		
		for(String x:set)
		{
			System.out.println(x);
		}
	}
} /* O/P -->
	Ball
	Cat
	Elephant
	Mango
	Dragon */

