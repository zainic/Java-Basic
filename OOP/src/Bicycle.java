
public class Bicycle extends Vehicle{
	
	String name;
	double maxSpeed = 20.0;
	
	Bicycle(String name){
		
		this.name = name;
		
	}
	
	void jumping() {
		
		System.out.println("This Bike is jumping");
		
	}
	
	@Override
	void stop() {
		
		System.out.println("This bike is sliding to stop");
		
	}

}
