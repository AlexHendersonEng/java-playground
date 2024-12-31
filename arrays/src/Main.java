
public class Main {

	public static void main(String[] args) {
		// Create array of int primitive type and print
		int[] integers = {0, 1, 2};
		System.out.println("Array of integers: ");
		for (int i = 0; i < integers.length; i++)
			System.out.println(integers[i]);
		System.out.println();
		
		// Create array of double primitive type and print
		double[] doubles = new double[3];
		doubles[0] = 0.0; doubles[1] = 1.0; doubles[2] = 2.0;
		System.out.println("Array of doubles: ");
		for (int i = 0; i < doubles.length; i++)
			System.out.println(doubles[i]);
		System.out.println();
		
		// Create array of String reference type and print
		String[] strings = {"Apple", "Pear", "Orange"};
		System.out.println("Array of strings: ");
		for (int i = 0; i < strings.length; i++)
			System.out.println(strings[i]);
		System.out.println();
		
		// Create array of custom type and print
		Food food1 = new Food("Apple");
		Food food2 = new Food("Pear");
		Food food3 = new Food("orange");
		Food[] foods = {food1, food2, food3};
		System.out.println("Array of foods: ");
		for (int i = 0; i < foods.length; i++)
			System.out.println(foods[i]);
		System.out.println();
		
	}

}
