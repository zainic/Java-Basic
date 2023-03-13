import java.util.ArrayList;

public class ListArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> food = new ArrayList<String>();
		ArrayList<Integer> number = new ArrayList<Integer>();
		
		food.add("pizza");
		food.add("hamburger");
		food.add("hotdog");
		
		number.add(2);
		number.add(6);
		number.add(10);
		
		for(int i=0; i<food.size(); i++) {
			System.out.println(food.get(i));
		}
		
		food.set(0, "fish");
		food.remove(1);
		
		for(int i=0; i<food.size(); i++) {
			System.out.println(food.get(i));
		}
		
		

	}

}
