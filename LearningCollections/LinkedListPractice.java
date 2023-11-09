package LearningCollections;

import java.util.LinkedList;

public class LinkedListPractice {

	public static void main(String[] args) {
		
		LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.add(1);
		ll.add(2);
		ll.add(3);
		ll.add(4);
		
		for(int x: ll)
		{
			System.out.println(x);
		}

	}

}
