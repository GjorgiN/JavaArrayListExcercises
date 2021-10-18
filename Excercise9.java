package arrayListExcercises;

import java.util.ArrayList;
import java.util.Collections;

public class Excercise9 {

	// copy one list into another
	
	public static void main(String[] args) {
		
		ArrayList<String> colors = new ArrayList<>();
		
		colors.add("Red");
		colors.add("Orange");
		colors.add("Black");
		
		ArrayList<String> fruits = new ArrayList<>();
		
		fruits.add("Orange");
		fruits.add("Apple");
		fruits.add("Pear");
		
		
		System.out.println("Before copying: ");
		System.out.println("Colors: " + colors);
		System.out.println("Fruits: " + fruits);
		System.out.println();
		
		Collections.copy(colors, fruits); // to, from
		// cannot use colors = fruits; // assign the reference value of fruits to color
		
		System.out.println("After copying: ");
		System.out.println("Colors: " + colors);
		System.out.println("Fruits: " + fruits);
		
		System.out.println("Change fruits first element");
		fruits.set(0, "Blueberry");
		
		System.out.println("Colors: " + colors);
		System.out.println("Fruits: " + fruits);
		
		System.out.println("--------------");
		ArrayList<String> vegetables = new ArrayList<>();
		
		vegetables.add("Carrot");
		vegetables.add("Cabbage");
		vegetables.add("Cucumber");
		
		System.out.println("Fruits: " + fruits);
		System.out.println("Vegetables: " + vegetables);
		
		System.out.println("--------\nvegetables = fruits\n");
		vegetables = fruits;
		System.out.println("Fruits: " + fruits);
		System.out.println("Vegetables: " + vegetables);
		
		
		vegetables.set(0, "Asparagus");
		System.out.println("Fruits: " + fruits);
		System.out.println("Vegetables: " + vegetables);
		
		fruits.set(1, "Tomato");
		System.out.println("Fruits: " + fruits);
		System.out.println("Vegetables: " + vegetables);
		
		
		
		
	}
}
