package arrayListExcercises;

import java.util.ArrayList;
import java.util.Collections;

public class Excercise9 {

	// copy one list into another
	
	public static void main(String[] args) {
		
		ArrayList<String> colors = new ArrayList<>();
		
		colors.add("Red");
		colors.add("Orange");
		colors.add("Black");
		
		ArrayList<String> fruits = new ArrayList<>();
		
		fruits.add("Orange");
		fruits.add("Apple");
		fruits.add("Pear");
		
		
		System.out.println("Before copying: ");
		System.out.println("Colors: " + colors);
		System.out.println("Fruits: " + fruits);
		System.out.println();
		
		Collections.copy(colors, fruits); // to, from
		//colors = fruits; // works this way too
		
		System.out.println("After copying: ");
		System.out.println("Colors: " + colors);
		System.out.println("Fruits: " + fruits);
		
	}
}
