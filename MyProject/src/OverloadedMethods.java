
public class OverloadedMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(add(1,2));
		System.out.println(add(1,2,3));
		System.out.println(add(1,2,3,4));
		System.out.println(add(1.0,2.0));
		System.out.println(add(1.0,2.0,3.0));
		System.out.println(add(1.0,2.0,3.0,4.0));
	}
	
	static int add(int a, int b) {
		System.out.println("This is overloaded #1");
		return a + b;
	}
	
	static int add(int a, int b, int c) {
		System.out.println("This is overloaded #2");
		return a + b + c;
	}
	
	static int add(int a, int b, int c, int d) {
		System.out.println("This is overloaded #3");
		return a + b + c + d;
	}
	
	static double add(double a, double b) {
		System.out.println("This is overloaded #4");
		return a + b;
	}
	
	static double add(double a, double b, double c) {
		System.out.println("This is overloaded #5");
		return a + b + c;
	}
	
	static double add(double a, double b, double c, double d) {
		System.out.println("This is overloaded #6");
		return a + b + c + d;
	}
	

}
