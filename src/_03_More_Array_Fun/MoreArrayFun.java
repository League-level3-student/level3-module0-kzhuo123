package _03_More_Array_Fun;

import java.util.ArrayList;
import java.util.Random;

public class MoreArrayFun {
	// 1. Create a main method to test the other methods you write.
	public static void main(String[] args) {
		String[] names = { "a", "b", "c", "d", "e" };
		print(names);
		System.out.println("");
		back(names);
		System.out.println("");
		other(names);
		System.out.println("");
		random(names);
	}

	// 2. Write a method that takes an array of Strings and prints all the Strings
	// in the array.
	public static void print(String[] values) {
		for (int i = 0; i < values.length; i++) {
			System.out.println(values[i]);
		}

	}

	// 3. Write a method that takes an array of Strings and prints all the Strings
	// in the array
	// in reverse order.
	public static void back(String[] values) {
		for (int i = values.length - 1; i >= 0; i--) {
			System.out.println(values[i]);
		}

	}

	// 4. Write a method that takes an array of Strings and prints every other
	// String in the array.
	public static void other(String[] values) {
		for (int i = 0; i < values.length; i++) {
			if (i % 2 == 0) {
				System.out.println(values[i]);
			}
		}

	}

	// 5. Write a method that takes an array of Strings and prints all the Strings
	// in the array
	// in a completely random order. Almost every run of the program should result
	// in a different order.
	public static void random(String[] values) {
		int random;
		Random r = new Random();
		ArrayList<Integer> test = new ArrayList<Integer>();
		boolean printed = true;

		for (int i = 0; i < values.length; i++) {
			
			random = r.nextInt(values.length);
			
			for (int j = 0; j < test.size(); j++) {
				if (random == test.get(i)) {
					printed = false;
				}
			}

			if (printed) {
				System.out.println(values[random]);
				test.add(random);
			}
			
		}

	}

}
