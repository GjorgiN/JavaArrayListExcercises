package arrayListExcercises;

import java.util.ArrayList;
import java.util.Arrays;

public class Excercise15 {

	// join two array lists

	public static void main(String[] args) {

		ArrayList<String> colors = new ArrayList<>() {
			{
				add("White");
				add("Yellow");
				add("Black");
			}
		};

		System.out.println("Colors: " + colors);

		ArrayList<String> fruits = new ArrayList<>(Arrays.asList("Apple", "Orange", "Mango"));

		System.out.println("Fruits: " + fruits);

		ArrayList<String> res = new ArrayList<>();

		res.addAll(colors);
		res.addAll(fruits);

		System.out.println(res);

		ArrayList<String> rez = mergeArrayLists(fruits, colors);

		System.out.println(rez);

	}

	public static ArrayList<String> mergeArrayLists(ArrayList<String> arrL1, ArrayList<String> arrL2) {
		
		ArrayList<String> result = new ArrayList<>();

		for (String el : arrL1) {
			result.add(el);
		}

		for (int i = 0; i < arrL2.size(); i++) {
			result.add(arrL2.get(i));
		}
		
		result.trimToSize();

		return result;

	}

}
