import java.util.Scanner;

public class LogicalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// && = and
		int temp = 25;
		
		if(temp > 30) {
			System.out.println("Hot");
		}
		else if(temp > 20 && temp <=30) {
			System.out.println("Warm");
		}
		else {
			System.out.println("Cold");
		}
		
		System.out.println("\n");
		
		//|| = or
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Press q to quit the game");
		String response = scanner.next();
		
		if(!response.equals("q") && !response.equals("Q")) {
			System.out.println("You quit the game");
		}
		else {
			System.out.println("Okay, we'll stay");
		}
		
		scanner.close();
		

	}

}
