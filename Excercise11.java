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
		
		System.out.println(colors);
		
		Collections.reverse(colors);

		System.out.println(colors);

	}
}
