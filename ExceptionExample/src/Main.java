import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// It's like try except in Python
		
		Scanner scanner = new Scanner(System.in);
		
		try {
			System.out.println("Enter a whole number to divide: ");
			int x = scanner.nextInt();
			
			System.out.println("Enter a whole number to divided by: ");
			int y = scanner.nextInt();
			
			int z = x/y;
			
			System.out.println("result: "+z);
		}
		catch(ArithmeticException e) {
			System.out.println("Undefined!!!");
		}
		catch(InputMismatchException e) {
			System.out.println("Please enter the number");
		}
		catch(Exception e) {
			System.out.println("Something was wrong");
		}
		finally {
			System.out.println("This block is always get printed");
			scanner.close();
		}
	}

}
