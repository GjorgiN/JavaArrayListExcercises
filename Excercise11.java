package arrayListExcercises;

import java.util.ArrayList;
import java.util.Collections;

public class Excercise11 {

	// reverse the elements of the list

	public static void main(String[] args) {

		ArrayList<String> colors = new ArrayList<>();

		colors.add("Red");
		colors.add("Green");
		colors.add("Blue");
		colors.add("Orange");

		System.out.println("Original list: " + colors);

		Collections.reverse(colors);

		System.out.println("Reversed with collection method: " + colors);
		
		reverseList(colors);
		
		System.out.println("Reversed with method: " + colors);

	}

	public static void reverseList(ArrayList<String> arrList) {

		Integer size = arrList.size();
		String temp;
		for (int i = 0; i < size / 2; i++) {
			temp = arrList.get(i);
			arrList.set(i, arrList.get(size - 1 - i));
			arrList.set(size - 1 - i, temp);
		}

	}
}
