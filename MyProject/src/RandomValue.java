import java.util.Random;

public class RandomValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		
		int x = random.nextInt(6) + 1;
		double y = random.nextDouble();
		boolean z = random.nextBoolean();
		
		System.out.println(x+","+y+","+z);
		
	}

}
