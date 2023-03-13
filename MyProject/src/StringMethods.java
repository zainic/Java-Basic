
public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "Dzaky Tamir";
		
		System.out.println(name.equals("dzaky tamir"));
		System.out.println(name.equalsIgnoreCase("dzaky tamir"));
		System.out.println(name.length());
		System.out.println(name.charAt(4));
		System.out.println(name.indexOf("a"));	
		System.out.println(name.isEmpty());
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		System.out.println(name.replace("a", "i"));	
		System.out.println(name.split(" ")[1]);
		
	}

}
