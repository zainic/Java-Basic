
public class House {
	
	String address;
	static int numberOfPeople;
	
	House(String address){
		
		this.address = address;
		
	}
	
	void stay(Human human) {
	
		System.out.println(human);
		System.out.println("Now he stay in " + this.address);
		numberOfPeople += 1;
		
	}
	
	static void displayFriend() {
		System.out.println("The population is "+ numberOfPeople);
	}
}
