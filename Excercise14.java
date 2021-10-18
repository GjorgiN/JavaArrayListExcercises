package arrayListExcercises;

import java.util.ArrayList;
import java.util.Collections;

public class Excercise14 {

	// swap two elements of an array list

	public static void main(String[] args) {

		ArrayList<String> colors = new ArrayList<>();

		colors.add("Red");
		colors.add("Green");
		colors.add("Blue");

		System.out.println("Original array list: " + colors);

		Collections.swap(colors, 0, 1);

		System.out.println("Elements swapped: " + colors);

		elementsSwap(colors, 2, 0);

		System.out.println("Elements swapped: " + colors);

	}

	public static void elementsSwap(ArrayList<String> arrL, Integer index1, Integer index2) {

		String temp = arrL.get(index1);
		arrL.set(index1, arrL.get(index2));
		arrL.set(index2, temp);

	}

}
