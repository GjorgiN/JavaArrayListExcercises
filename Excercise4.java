package arrayListExcercises;

import java.util.ArrayList;

public class Excercise4 {

	// get element by index
	
	public static void main(String[] args) {
		
		ArrayList<String> colors = new ArrayList<>();
		
		colors.add("Red");
		colors.add("Green");
		colors.add("Blue");
		
		Integer index = 1;
		String valueOfIndex = colors.get(index);
		
		System.out.println("Index: " + index + ", value: " + valueOfIndex);
		System.out.println("---------");
		for (int i = 0; i < colors.size(); i++) {
			
			System.out.println("Element's value with index " + i + " is " + colors.get(i));
		}
		
	}
	
}
