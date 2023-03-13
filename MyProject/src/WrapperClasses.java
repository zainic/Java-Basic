
public class WrapperClasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		
		Boolean a = true;
		Character b = 'a';
		Integer c = 12345;
		Double d = 2.7182;
		String e = "Dzaky";
		
		System.out.println(a.booleanValue());
		System.out.println(b.hashCode());
		System.out.println(c.toString().length());
		System.out.println(d.isInfinite());
		System.out.println(e.subSequence(1, 3));
		
	}

}
