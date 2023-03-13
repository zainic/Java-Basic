import java.util.Scanner;

public class Statement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Input score : ");
		double score = scanner.nextDouble();
		
		if(score>80) {
			System.out.println("Your score is A");
		}
		else if(score>70) {
			System.out.println("Your score is B");
		}
		else if(score>60) {
			System.out.println("Your score is C");
		}
		else {
			System.out.println("Your score is D");
		}
		
		scanner.close();
		

	}

}
