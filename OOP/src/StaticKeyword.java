
public class StaticKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// static = modifier. A single copy of a variable/method is created and shared
		//          the class "owns" the static member.
		
		House house = new House("Kp.Leles");
		
		System.out.println(House.numberOfPeople);
		
		Human human1 = new Human("Dzaky", 20, 171.0);
		Human human2 = new Human("Tamir", 21, 173.0);
		
		house.stay(human1);
		house.stay(human2);
		
		System.out.println(House.numberOfPeople);
		
		House.displayFriend();

	}

}
