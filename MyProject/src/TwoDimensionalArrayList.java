import java.util.ArrayList;

public class TwoDimensionalArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> bakery = new ArrayList<String>();
		bakery.add("Cheese Bread");
		bakery.add("Chocolate Bread");
		bakery.add("Garlic Bread");
		
		ArrayList<Integer> quantity = new ArrayList<Integer>();
		quantity.add(15);
		quantity.add(25);
		quantity.add(5);
		
		System.out.println(bakery + " " + quantity);
		
		ArrayList<ArrayList<String>> grocery = new ArrayList<ArrayList<String>>();
		
		ArrayList<String> vegetables = new ArrayList<String>();
		vegetables.add("Spinach");
		vegetables.add("Green Leaf");
		vegetables.add("Coffee");
		vegetables.add("Onion");
		
		ArrayList<String> fruits = new ArrayList<String>();
		fruits.add("Apple");
		fruits.add("Pineapple");
		
		grocery.add(bakery);
		grocery.add(vegetables);
		grocery.add(fruits);
		
		System.out.println(grocery.get(1).get(2));
		
	}

}
