package arrayListExcercises;

import java.util.ArrayList;

public class Excercise2 {

	// iterate through array list elements

	public static void main(String[] args) {

		ArrayList<String> colors = new ArrayList<>();

		colors.add("Red");
		colors.add("Green");
		colors.add("Blue");

		for (String color : colors) {
			System.out.print(color + " ");
		}

		System.out.println();

		for (int i = colors.size() - 1; i > -1; i--) {
			System.out.print(colors.get(i) + " ");
		}

		System.out.println();

	}

}
