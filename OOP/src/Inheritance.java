
public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car car = new Car("Jord-GT");
		Bicycle bike = new Bicycle("BMX");
		
		car.go();
		bike.go();
		
		car.drifting();
		bike.jumping();
		
		car.stop();
		bike.stop();

	}

}
