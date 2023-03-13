import java.util.Scanner;

public class MathExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x, y, z;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter side x :");
		x = scan.nextDouble();
		System.out.println("Enter side y :");
		y = scan.nextDouble();
		
		z = Math.pow(x, 2) + Math.pow(y, 2);
		double result = Math.sqrt(z);
		
		System.out.println("Result : "+result);
		
		scan.close();

	}

}
