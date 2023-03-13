
public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] cars = {"Lamborgini","Lancer", "Daihatsu"};
		int[] numbers = {5, 4, 2};
		
		System.out.println(cars[0] + " : "+ numbers[0]);
		
		cars[0] = "Mustang";
		
		System.out.println(cars[0] + " : " + numbers[0]);
		
		System.out.println();
		
		for(int i=0; i<cars.length; i++) {
			System.out.println(cars[i]);
		}
		

	}

}
