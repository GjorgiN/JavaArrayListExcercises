package arrayListExcercises;

import java.util.ArrayList;

public class Excercise6 {

	// remove element from list
	public static void main(String[] args) {
		
		ArrayList<String> colors = new ArrayList<>();
		
		colors.add("White");
		colors.add("Gray");
		colors.add("Black");
		
		System.out.println(colors);
		
		colors.remove(1);
		
		System.out.println(colors);
		
	}
}
