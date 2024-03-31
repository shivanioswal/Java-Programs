package LearningGenerics;
import java.util.*;
public class GenericMethodsPractice {

	public static void main(String[] args) {
		
		ArrayList<Integer>a1= new ArrayList<Integer>();
		a1.add(1);
		a1.add(2);
		a1.add(3);
		
		ArrayList<Integer>a2= new ArrayList<Integer>();
		a1.add(10);
		a1.add(20);
		a1.add(30);
		
		ArrayList<Integer> ans = fxn(a1,a2);
		
		//for loop,for each
		
		Iterator<Integer> it = ans.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
			
		}

	}
public static<E> ArrayList<E> fxn(ArrayList<E>a1, ArrayList<E>a2)
{
	ArrayList<E> ans = new ArrayList<>();
	ans.addAll(a1);
	ans.addAll(a2);
	return ans;
}
}
