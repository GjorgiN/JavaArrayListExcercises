package arrayListExcercises;

import java.util.ArrayList;
import java.util.Collections;

public class Excercise10 {

	// shuffle the elements of the list
	
	public static void main(String[] args) {
		
		ArrayList<String> fruits = new ArrayList<>();
		
		fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("Pear");
		fruits.add("Blackberry");
		
		System.out.println(fruits);
		
		Collections.shuffle(fruits);
		
		System.out.println(fruits);
		
	}
}
