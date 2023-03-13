
public class FormattedPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//% [flags] [precision] [width] [conversion-character]
		
		boolean myBool = true;
		char myChar = '#';
		String myStr = "Dzaky";
		int myInt = 50;
		double myDouble = 2.718182;
		
		//conversion-character
		System.out.printf("%b This is boolean\n", myBool);
		System.out.printf("%c This is character\n", myChar);
		System.out.printf("%s This is string\n", myStr);
		System.out.printf("%d This is integer\n", myInt);
		System.out.printf("%f This is integer\n", myDouble);
		
		//width
		System.out.printf("Hello %14s\n", myStr);
		
		//precision
		System.out.printf("%.3f this is %d number of precision\n", myDouble, 3);

		//flags
		// - : left-justify
		// + : output (+) or (-) sign for a numeric value
		// 0 : numeric values are zero-padded
		// , : comma grouping separator if number > 1000
		double money = 2500000;
		System.out.printf("You have %-,20.2f rupiahs", money);
		
		
	}

}
