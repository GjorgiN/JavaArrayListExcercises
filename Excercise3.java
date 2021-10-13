package arrayListExcercises;

import java.util.ArrayList;

public class Excercise3 {
	
	// add new element on specific position in the list
	
	public static void main(String[] args) {
		
		ArrayList<String> colors = new ArrayList<>();

		colors.add("Red");
		colors.add("Green");
		colors.add("Blue");

		System.out.println(colors);
		
		colors.add(0, "White");

		System.out.println(colors);
		
	}
	
}
