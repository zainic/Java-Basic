import java.util.ArrayList;

public class EnhancedLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] animals = {"cat", "dog", "hippo", "bird"};
		
		for(String i : animals) {
			System.out.println(i);
		}
		
		ArrayList<String> fruits = new ArrayList<String>();
		fruits.add("apple");
		fruits.add("orange");
		fruits.add("pear");
		fruits.add("blueberry");
		
		for(String j : fruits) {
			System.out.println(j);
		}

	}

}
