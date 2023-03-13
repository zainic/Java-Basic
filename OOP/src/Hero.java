
public class Hero extends Human{

	String power;
	
	Hero(String name, int age, double height, String power){
		
		super(name, age, height);
		this.power = power;
		
	}
	
	public String toString() {
		
		String myString = super.toString() + " has power of " + this.power;
		return myString;
		
	}

}
