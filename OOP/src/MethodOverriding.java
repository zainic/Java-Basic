
public class MethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vehicle vehicle = new Vehicle();
		Bicycle bike = new Bicycle("BMX");
		
		vehicle.go();
		vehicle.stop();		
		
		bike.go();
		bike.stop();

	}

}
