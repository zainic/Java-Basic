
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// polymorphism = greek work for poly-"many", morph-"form"
		//				  The ability of an object to identity as more than one type
		
		Car car = new Car();
		Bicycle bicycle = new Bicycle();
		Boat boat = new Boat();
		
		Vehicle[] racers = {car, bicycle, boat};
		
		for(Vehicle x:racers) {
			
			x.go();
			
		}
		

	}

}
