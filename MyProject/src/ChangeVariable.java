
public class ChangeVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x = "variable x", y = "variable y", temp;
		System.out.println(x);
		System.out.println(y);
		
		temp = x;
		x = y;
		y = temp;
		
		System.out.println(x);
		System.out.println(y);
		

	}

}
