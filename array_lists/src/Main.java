import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// Create fruits array list
		ArrayList<String> fruits = new ArrayList<String>();
		fruits.add("Apple");
		fruits.add("Pear");
		fruits.add("Orange");
		
		// Create vegetables array list
		ArrayList<String> vegetables = new ArrayList<String>();
		vegetables.add("Carrot");
		vegetables.add("Onion");
		vegetables.add("Cabbage");
		
		// Create nest array list
		ArrayList<ArrayList<String>> fruitAndVeg = new ArrayList<ArrayList<String>>();
		fruitAndVeg.add(fruits);
		fruitAndVeg.add(vegetables);
		
		// Print nested lists
		System.out.println(fruitAndVeg);
	}

}
