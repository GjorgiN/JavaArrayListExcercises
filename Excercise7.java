package arrayListExcercises;

import java.util.ArrayList;

public class Excercise7 {

	// find element in list
	public static void main(String[] args) {
		
		ArrayList<String> colors = new ArrayList<>();
		
		colors.add("Yellow");
		colors.add("Orange");
		colors.add("Blue");
		
		String someColor = "Red";
		
		if (colors.contains(someColor)) {
			System.out.println("The color \"" + someColor + "\" index is " + colors.indexOf(someColor));
		} else {
			System.out.println("The color \"" + someColor + "\" is not in the list");
		}
		
		someColor = "Blue";
		if (colors.contains(someColor)) {
			System.out.println("The index of color \"" + someColor + "\" is " + colors.indexOf(someColor));
		} else {
			System.out.println("The color \"" + someColor + "\" is not in the list");
		}
		
	}
}
