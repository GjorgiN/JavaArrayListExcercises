package arrayListExcercises;

import java.util.ArrayList;

public class Excercise13 {

	// compare if each element of two lists are equals

	public static void main(String[] args) {

		ArrayList<String> colors1 = new ArrayList<>();
		colors1.add("Red");
		colors1.add("Green");
		colors1.add("Blue");
		colors1.add("Orange");
		colors1.add("White");
		colors1.add("Black");

		ArrayList<String> colors2 = new ArrayList<>();
		colors2.add("Red");
		colors2.add("Blue");
		colors2.add("Green");
		colors2.add("Orange");
		colors2.add("Black");
		colors2.add("White");

		ArrayList<Boolean> areEqual = new ArrayList<>();

		Integer size;

		if (colors1.size() != colors2.size()) {
			System.out.println("Array lists are not of equal size");
		} else {
			size = colors1.size();
			for (int i = 0; i < size; i++) {
				if (colors1.get(i) == colors2.get(i))
					areEqual.add(i, true);
				else
					areEqual.add(i, false);
			}

		}
		
		System.out.println(colors1);
		System.out.println(colors2);
		System.out.println(areEqual);

	}
}
