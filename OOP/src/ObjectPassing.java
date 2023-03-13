
public class ObjectPassing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		House house = new House("Kp.Leles");
		
		Human human1 = new Human("Dzaky", 20, 171.0);
		Human human2 = new Human("Tamir", 21, 173.0);
		
		house.stay(human1);
		house.stay(human2);

	}

}
