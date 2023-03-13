
public class ArrayObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Human human1 = new Human("Dzaky", 20, 171.2);
		Human human2 = new Human("Tamir", 19, 167.2);
		
		Human[] humans = {human1, human2};
		
		System.out.println(humans[1].name);
		System.out.println(humans[0].age);
		
		System.out.println(humans[0]);
		System.out.println(humans[1]);
		

	}

}
