package arrayListExcercises;

import java.util.ArrayList;

public class Excercise13 {

	// compare if each corresponding element of two lists are equals

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
//		colors2.add("White");

		System.out.println(colors1);
		System.out.println(colors2);
		System.out.println(areEqual(colors1, colors2));

	}

	public static ArrayList<Boolean> areEqual(ArrayList<String> arrL1, ArrayList<String> arrL2) {
		ArrayList<Boolean> areEqual = new ArrayList<>();

		Integer size;

		if (arrL1.size() != arrL2.size()) {
			System.out.println("Array lists are not of equal size");
			areEqual.add(null);
//			return null;
		} else {
			size = arrL1.size();
			for (int i = 0; i < size; i++) {
				if (arrL1.get(i) == arrL2.get(i))
					areEqual.add(i, true);
				else
					areEqual.add(i, false);
			}
		}

		return areEqual;
	}

}
