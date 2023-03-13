import java.util.Scanner;

public class Looping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// while or do while loop
		Scanner scanner = new Scanner(System.in);
		String name = "";
		
		while(name.isBlank()) {
			System.out.println("Enter name : ");
			name = scanner.nextLine();
			if(!name.isBlank()) {
				break;
			}
			System.out.println("No name was detected");
		}
		
		// for loop
		for(int i=0; i<=10; i++) {
			System.out.println("Hello "+name+" it's been "+i+" day(s)");
		}
		
		scanner.close();

	}

}
