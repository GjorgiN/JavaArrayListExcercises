package arrayListExcercises;

import java.util.ArrayList;

public class Excercise5 {

	// update specific element
	
	public static void main(String[] args) {
		
		ArrayList<String> colors = new ArrayList<>();
		
		colors.add("Red");
		colors.add("Green");
		colors.add("Blue");
		
		System.out.println(colors);
	
		String orange = "Orange";
		colors.set(0, orange);

		colors.set(2, "Purple");
		
		System.out.println(colors);
		
		
		
		
	}
	
}
