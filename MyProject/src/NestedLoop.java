import java.util.Scanner;

public class NestedLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		int rows, columns;
		String symbol = "";
		
		System.out.println("Enter number of rows : ");
		rows = scanner.nextInt();
		System.out.println("Enter number of columns : ");
		columns = scanner.nextInt();
		System.out.println("Enter symbol : ");
		symbol = scanner.next();
		
		for(int i=0; i<rows; i++) {
			System.out.println();
			for(int j=0; j<columns; j++) {
				System.out.print(symbol);
			}
		}
		
		scanner.close();
			

	}

}
