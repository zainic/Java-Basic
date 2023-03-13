import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Input A : ");
		double A = scanner.nextDouble();
		
		System.out.println("Input B : ");
		double B = scanner.nextDouble();
		scanner.nextLine();
		
		System.out.println("Input Text : ");
		String text = scanner.nextLine();
		
		double result = A + B;
		
		System.out.println("Result = "+A+" + "+B+" = "+result);
		System.out.println("Your text : "+text);
		
		scanner.close();
		
	}

}
