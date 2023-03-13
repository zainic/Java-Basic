
public class Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Human myHuman1 = new Human("Dzaky", 20, 170.3);
		Human myHuman2 = new Human("Tamir", 21, 168.3);
		
		System.out.println(myHuman1.name);
		System.out.println(myHuman2.name);
		
		myHuman1.eat();
		myHuman2.eat();
		
		myHuman1.addHeight(0.5);
		System.out.println(myHuman1.height);
	}

}
