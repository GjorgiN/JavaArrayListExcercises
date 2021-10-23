package arrayListExcercises;

import java.util.ArrayList;
import java.util.List;

public class Excercise12 {

	// extract portion of list

	public static void main(String[] args) {

		ArrayList<String> colors = new ArrayList<>();

		colors.add("Red");
		colors.add("Green");
		colors.add("Blue");
		colors.add("Orange");
		colors.add("White");
		colors.add("Black");

		List<String> bestColors = new ArrayList<>();

		// sublist returns List
		bestColors = colors.subList(1, 3);

		System.out.println(colors);
		System.out.println(bestColors);

		ArrayList<String> worstColors = new ArrayList<>();
		
		// if .set is used on row 46 --> Exception in thread "main" java.lang.IndexOutOfBoundsException: Index 3 out of bounds for length 0
		// cannot set elements to array list of size 0
		worstColors = copyRangeOfElements(colors, 3, 5);

		System.out.println(worstColors);

	}

	public static ArrayList<String> copyRangeOfElements(ArrayList<String> arrL, Integer start, Integer end) {

		ArrayList<String> range = new ArrayList<>();
		Integer size = arrL.size();

		if (size > start) {
			for (Integer i = start; i < end; i++) {
				range.add(arrL.get(i));
			}
		}

		return range;
	}

}
