package arrayListExcercises;

import java.util.ArrayList;

public class Excercise2 extends Excercise1 {

	// iterate through array list elements
	
	public static void main(String[] args) {

		ArrayList<String> colors = new ArrayList<>();

		colors.add("Red");
		colors.add("Green");
		colors.add("Blue");

		for (String color : colors) {
			System.out.println(color);
		}

	}

}
