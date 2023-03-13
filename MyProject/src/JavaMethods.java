
public class JavaMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		greeting("Dzaky");
		
		System.out.println(add(3,4));
		System.out.println(add(3,6));
		System.out.println(add(4,2));

	}
	
	static void greeting(String name) {
		System.out.println("Hello World, My name is " + name);
	}
	
	static double add(double a, double b) {
		return a+b;
	}

}
