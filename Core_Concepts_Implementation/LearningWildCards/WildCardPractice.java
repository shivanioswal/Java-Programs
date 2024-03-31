package LearningWildCards;
import java.util.*;
public class WildCardPractice {

	public static void main(String[] args) {
		
		Object o1 = new Object();
		String str = "Apple";
		o1=str;
		System.out.println(o1);
		
		 ArrayList<Object>arr1 = new ArrayList<>();
		ArrayList<String>arr2 = new ArrayList<>();
			//arr1=arr2; //Not allowed because of generics */
		
		 ArrayList<?>arr3 = new ArrayList<>();
		 arr3=arr2; //here datatype is not defined so it is allowed
		 
		 ArrayList <? extends Fruits>arrfr = new ArrayList<>();
		 ArrayList<Apple>arrapp = new ArrayList<>();
		 arrfr=arrapp;
		 //Allowed since Apple extends fruits class. ? means any class that is the child class of fruit will be allowed to operate in the following statement 
		 
		 ArrayList<? super Fruits>arr5 = new ArrayList<>();
		 //arr5=arrapp; //Not allowed because Apple is the child class of fruits
		 
		 ArrayList<Object>arrB = new ArrayList<>();
		 arr5=arrB;
		 
		 
		 
		 
		 
		 
		
			
			

	}

}
