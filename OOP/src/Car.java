
public class Car extends Vehicle{

	String name;
	double maxSpeed = 100.0;
	
	Car(String name){
		
		this.name = name;
	
	}
	
	void drifting() {
		
		System.out.println("This car is drifting");
		
	}

}
