package arrayListExcercises;

import java.util.ArrayList;
import java.util.Collections;

public class Excercise10 {

	// shuffle the elements of the list

	public static void main(String[] args) {

		ArrayList<String> fruits = new ArrayList<>();

		fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("Pear");
		fruits.add("Blackberry");

		System.out.println(fruits);

		Collections.shuffle(fruits);

		System.out.println(fruits);

		shuffleElements(fruits);

		System.out.println(fruits);

	}

	public static void shuffleElements(ArrayList<String> arrL) {
		Integer size = arrL.size();
		ArrayList<Integer> randomizedIndicies = new ArrayList<>();
		Integer random;

		for (int i = 0; i < size; i++) {
			random = (int) Math.floor(Math.random() * size);

			while (randomizedIndicies.contains(random) == true)
				random = (int) Math.floor(Math.random() * size);

			randomizedIndicies.add(random);
		}

		System.out.println("Randomization of indicies: " + randomizedIndicies);

		ArrayList<String> copyOfArrL = new ArrayList<>();
		copyOfArrL.addAll(arrL);

		Integer randomIndex;
		String temp;
		for (int i = 0; i < size; i++) {
			randomIndex = randomizedIndicies.get(i);
			temp = copyOfArrL.get(i);
			arrL.set(i, copyOfArrL.get(randomIndex));
			copyOfArrL.set(i, temp);
		}
	}

}
