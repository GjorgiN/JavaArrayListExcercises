package arrayListExcercises;

import java.util.ArrayList;
import java.util.Collections;

public class Excercise8 {

	//sort the list
	
	public static void main(String[] args) {
		
		ArrayList<String> colors = new ArrayList<>();
		
		colors.add("White");
		colors.add("Blue");
		colors.add("Red");
		
		System.out.println(colors);
		
		Collections.sort(colors);
		
		System.out.println(colors);
		
	}
	
}
