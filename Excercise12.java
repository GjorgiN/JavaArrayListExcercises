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

		//sublist returns List
		bestColors = colors.subList(1, 3);
		
		System.out.println(colors);
		System.out.println(bestColors);
		
	}
}
