package arrayListExcercises;

import java.util.ArrayList;
import java.util.Collections;

public class Excercise8 {

	// sort the list

	public static void main(String[] args) {

		ArrayList<String> colors = new ArrayList<>();

		colors.add("Orange");
		colors.add("Blue");
		colors.add("White");
		colors.add("Red");
		colors.add("Black");
		colors.add("Red");
		colors.add("Green");

		System.out.println("Original array list: " + colors);

		Collections.sort(colors);

		System.out.println("Sorted ascending: " + colors);
		
		Collections.shuffle(colors);
		System.out.println("Shuffled colors: " + colors);

		sortDescending(colors);
		
		System.out.println("Sorted descending: " + colors);
		
	}

	private static void sortDescending(ArrayList<String> arrList) {
		String temp;
		Integer k;

		for (int i = 0; i < arrList.size() - 1; i++) {

			for (int j = i + 1; j < arrList.size(); j++) {

				k = 0;
				while (k < arrList.get(i).length() - 1 && k < arrList.get(j).length() - 1
						&& arrList.get(i).charAt(k) == arrList.get(j).charAt(k))
					k++;

				if (arrList.get(i).charAt(k) < arrList.get(j).charAt(k)) {
					temp = arrList.get(i);
					arrList.set(i, arrList.get(j));
					arrList.set(j, temp);

				}
			}
		}
	}

}
