
public class Human {
	
	String name;
	int age;
	double height;
	
	Human(String name, int age, double height){
		
		this.name = name;
		this.age = age;
		this.height = height;
		
	}
	
	void eat() {
		System.out.println(this.name + " is eating");
	}
	
	void addHeight(double additionHeight) {
		this.height += additionHeight;
		System.out.println(this.name + " is now " + this.height + " cm");
	}

}
