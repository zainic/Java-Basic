
public class MultiArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] number = new int[4][4];
		
		for(int i=0;i<number.length;i++) {
			for(int j=0;j<number[i].length;j++) {
				number[i][j] = i+j;
			}
		}
		for(int i=0;i<number.length;i++) {
			System.out.println();
			for(int j=0;j<number[i].length;j++) {
				System.out.print(number[i][j] + " ");
			}
		}
		
	}

}
