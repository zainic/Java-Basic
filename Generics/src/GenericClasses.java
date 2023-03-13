public class GenericClasses {

	public static void main(String[] args) {
		
		MyGenericClass<Integer, Integer> myInt = new MyGenericClass<>(1, 3);
		MyGenericClass<Double, Double> myDouble = new MyGenericClass<>(3.14, 2.71);
		MyGenericClass<Character, Character> myChar = new MyGenericClass<>('#','*');
		MyGenericClass<String, String> myString = new MyGenericClass<>("Hello","World");

		System.out.println(myInt.getValue1());
		System.out.println(myDouble.getValue1());
		System.out.println(myChar.getValue1());
		System.out.println(myString.getValue1());
		
		System.out.println(myInt.getValue2());
		System.out.println(myDouble.getValue2());
		System.out.println(myChar.getValue2());
		System.out.println(myString.getValue2());
		
	}

}
